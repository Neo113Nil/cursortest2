package org.apache.cordova.networkinformation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Locale;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkManager extends CordovaPlugin {
    public static final String CDMA = "cdma";
    public static final String CELLULAR = "cellular";
    public static final String EDGE = "edge";
    public static final String EHRPD = "ehrpd";
    public static final String FOUR_G = "4g";
    public static final String GPRS = "gprs";
    public static final String GSM = "gsm";
    public static final String HSDPA = "hsdpa";
    public static final String HSPA = "hspa";
    public static final String HSPA_PLUS = "hspa+";
    public static final String HSUPA = "hsupa";
    private static final String LOG_TAG = "NetworkManager";
    public static final String LTE = "lte";
    public static final String MOBILE = "mobile";
    public static int NOT_REACHABLE = 0;
    public static final String ONEXRTT = "1xrtt";
    public static int REACHABLE_VIA_CARRIER_DATA_NETWORK = 1;
    public static int REACHABLE_VIA_WIFI_NETWORK = 2;
    public static final String THREE_G = "3g";
    public static final String TWO_G = "2g";
    public static final String TYPE_2G = "2g";
    public static final String TYPE_3G = "3g";
    public static final String TYPE_4G = "4g";
    public static final String TYPE_ETHERNET = "ethernet";
    public static final String TYPE_ETHERNET_SHORT = "eth";
    public static final String TYPE_NONE = "none";
    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_WIFI = "wifi";
    public static final String UMB = "umb";
    public static final String UMTS = "umts";
    public static final String WIFI = "wifi";
    public static final String WIMAX = "wimax";
    private CallbackContext connectionCallbackContext;
    private JSONObject lastInfo = null;
    BroadcastReceiver receiver;
    ConnectivityManager sockMan;

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        this.sockMan = (ConnectivityManager) cordovaInterface.getActivity().getSystemService("connectivity");
        this.connectionCallbackContext = null;
        registerConnectivityActionReceiver();
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        String str2;
        if (!str.equals("getConnectionInfo")) {
            return false;
        }
        this.connectionCallbackContext = callbackContext;
        try {
            str2 = getConnectionInfo(this.sockMan.getActiveNetworkInfo()).get("type").toString();
        } catch (JSONException e) {
            LOG.d(LOG_TAG, e.getLocalizedMessage());
            str2 = "";
        }
        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, str2);
        pluginResult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginResult);
        return true;
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onDestroy() {
        unregisterReceiver();
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onPause(boolean z) {
        unregisterReceiver();
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onResume(boolean z) {
        super.onResume(z);
        unregisterReceiver();
        registerConnectivityActionReceiver();
    }

    private void registerConnectivityActionReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.receiver == null) {
            this.receiver = new BroadcastReceiver() { // from class: org.apache.cordova.networkinformation.NetworkManager.1
                /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
                @Override // android.content.BroadcastReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onReceive(Context context, Intent intent) {
                    String obj;
                    if (NetworkManager.this.webView != null) {
                        NetworkManager networkManager = NetworkManager.this;
                        networkManager.updateConnectionInfo(networkManager.sockMan.getActiveNetworkInfo());
                    }
                    if (NetworkManager.this.lastInfo != null) {
                        try {
                            obj = NetworkManager.this.lastInfo.get("type").toString();
                        } catch (JSONException e) {
                            LOG.d(NetworkManager.LOG_TAG, e.getLocalizedMessage());
                        }
                        if ("none".equals(obj)) {
                            return;
                        }
                        boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                        LOG.d(NetworkManager.LOG_TAG, "Intent no connectivity: " + booleanExtra);
                        if (booleanExtra) {
                            LOG.d(NetworkManager.LOG_TAG, "Really no connectivity");
                            return;
                        } else {
                            LOG.d(NetworkManager.LOG_TAG, "!!! Switching to unknown, Intent states there is a connectivity.");
                            NetworkManager.this.sendUpdate("unknown");
                            return;
                        }
                    }
                    obj = "none";
                    if ("none".equals(obj)) {
                    }
                }
            };
        }
        if (Build.VERSION.SDK_INT >= 34) {
            this.webView.getContext().registerReceiver(this.receiver, intentFilter, 4);
        } else {
            this.webView.getContext().registerReceiver(this.receiver, intentFilter);
        }
    }

    private void unregisterReceiver() {
        if (this.receiver != null) {
            try {
                this.webView.getContext().unregisterReceiver(this.receiver);
            } catch (Exception e) {
                LOG.e(LOG_TAG, "Error unregistering network receiver: " + e.getMessage(), e);
            } finally {
                this.receiver = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateConnectionInfo(NetworkInfo networkInfo) {
        String str;
        JSONObject connectionInfo = getConnectionInfo(networkInfo);
        if (connectionInfo.equals(this.lastInfo)) {
            return;
        }
        try {
            str = connectionInfo.get("type").toString();
        } catch (JSONException e) {
            LOG.d(LOG_TAG, e.getLocalizedMessage());
            str = "";
        }
        sendUpdate(str);
        this.lastInfo = connectionInfo;
    }

    private JSONObject getConnectionInfo(NetworkInfo networkInfo) {
        String str;
        String str2 = "none";
        if (networkInfo == null) {
            str = "";
        } else {
            if (networkInfo.isConnected()) {
                str2 = getType(networkInfo);
            }
            str = networkInfo.getExtraInfo();
        }
        LOG.d(LOG_TAG, "Connection Type: " + str2);
        LOG.d(LOG_TAG, "Connection Extra Info: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str2);
            jSONObject.put("extraInfo", str);
            return jSONObject;
        } catch (JSONException e) {
            LOG.d(LOG_TAG, e.getLocalizedMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendUpdate(String str) {
        if (this.connectionCallbackContext != null) {
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, str);
            pluginResult.setKeepCallback(true);
            this.connectionCallbackContext.sendPluginResult(pluginResult);
        }
        this.webView.postMessage("networkconnection", str);
    }

    private String getType(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            String lowerCase = networkInfo.getTypeName().toLowerCase(Locale.US);
            LOG.d(LOG_TAG, "toLower : " + lowerCase.toLowerCase());
            LOG.d(LOG_TAG, "wifi : wifi");
            if (lowerCase.equals("wifi")) {
                return "wifi";
            }
            if (lowerCase.toLowerCase().equals("ethernet") || lowerCase.toLowerCase().startsWith(TYPE_ETHERNET_SHORT)) {
                return "ethernet";
            }
            if (lowerCase.equals(MOBILE) || lowerCase.equals("cellular")) {
                String lowerCase2 = networkInfo.getSubtypeName().toLowerCase(Locale.US);
                String str = "2g";
                if (!lowerCase2.equals(GSM) && !lowerCase2.equals("gprs") && !lowerCase2.equals("edge") && !lowerCase2.equals("2g")) {
                    str = "3g";
                    if (!lowerCase2.startsWith(CDMA) && !lowerCase2.equals(UMTS) && !lowerCase2.equals(ONEXRTT) && !lowerCase2.equals(EHRPD) && !lowerCase2.equals("hsupa") && !lowerCase2.equals("hsdpa") && !lowerCase2.equals(HSPA) && !lowerCase2.equals("3g")) {
                        str = "4g";
                        if (!lowerCase2.equals("lte") && !lowerCase2.equals(UMB) && !lowerCase2.equals(HSPA_PLUS) && !lowerCase2.equals("4g")) {
                            return "unknown";
                        }
                    }
                }
                return str;
            }
            return "unknown";
        }
        return "none";
    }
}

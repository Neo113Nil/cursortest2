package io.branch.referral.network;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.os.NetworkOnMainThreadException;
import io.branch.referral.PrefHelper;
import io.branch.referral.network.BranchRemoteInterface;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class BranchRemoteInterfaceUrlConnection extends BranchRemoteInterface {
    private static final int DEFAULT_TIMEOUT = 3000;
    private static final int THREAD_TAG_POST = 102;
    private PrefHelper prefHelper;

    BranchRemoteInterfaceUrlConnection(Context context) {
        this.prefHelper = PrefHelper.getInstance(context);
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.BranchResponse doRestfulGet(String str) throws BranchRemoteInterface.BranchRemoteException {
        return doRestfulGet(str, 0);
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.BranchResponse doRestfulPost(String str, JSONObject jSONObject) throws BranchRemoteInterface.BranchRemoteException {
        return doRestfulPost(str, jSONObject, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BranchRemoteInterface.BranchResponse doRestfulGet(String str, int i) throws BranchRemoteInterface.BranchRemoteException {
        int timeout;
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                timeout = this.prefHelper.getTimeout();
                if (timeout <= 0) {
                    timeout = 3000;
                }
                httpsURLConnection = (HttpsURLConnection) new URL(str + (str.contains("?") ? "&" : "?") + "retryNumber=" + i).openConnection();
            } catch (Throwable th) {
                th = th;
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (SocketException e) {
            e = e;
        } catch (SocketTimeoutException unused) {
        } catch (IOException e2) {
            e = e2;
        }
        try {
            httpsURLConnection.setConnectTimeout(timeout);
            httpsURLConnection.setReadTimeout(timeout);
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode >= 500 && i < this.prefHelper.getRetryCount()) {
                try {
                    Thread.sleep(this.prefHelper.getRetryInterval());
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
                BranchRemoteInterface.BranchResponse doRestfulGet = doRestfulGet(str, i + 1);
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return doRestfulGet;
            }
            if (responseCode != 200) {
                try {
                    if (httpsURLConnection.getErrorStream() != null) {
                        BranchRemoteInterface.BranchResponse branchResponse = new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getErrorStream()), responseCode);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        return branchResponse;
                    }
                } catch (FileNotFoundException unused2) {
                    PrefHelper.Debug("A resource conflict occurred with this request " + str);
                    BranchRemoteInterface.BranchResponse branchResponse2 = new BranchRemoteInterface.BranchResponse(null, responseCode);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return branchResponse2;
                }
            }
            BranchRemoteInterface.BranchResponse branchResponse3 = new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getInputStream()), responseCode);
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            return branchResponse3;
        } catch (SocketException e4) {
            e = e4;
            PrefHelper.Debug("Http connect exception: " + e.getMessage());
            throw new BranchRemoteInterface.BranchRemoteException(-113);
        } catch (SocketTimeoutException unused3) {
            httpsURLConnection2 = httpsURLConnection;
            if (i >= this.prefHelper.getRetryCount()) {
                throw new BranchRemoteInterface.BranchRemoteException(-111);
            }
            try {
                Thread.sleep(this.prefHelper.getRetryInterval());
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            BranchRemoteInterface.BranchResponse doRestfulGet2 = doRestfulGet(str, i + 1);
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            return doRestfulGet2;
        } catch (IOException e6) {
            e = e6;
            PrefHelper.Debug("Branch connect exception: " + e.getMessage());
            throw new BranchRemoteInterface.BranchRemoteException(-113);
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection2 = httpsURLConnection;
            if (httpsURLConnection2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x011f: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:106:0x011f */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BranchRemoteInterface.BranchResponse doRestfulPost(String str, JSONObject jSONObject, int i) throws BranchRemoteInterface.BranchRemoteException {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2;
        InputStream errorStream;
        int timeout = this.prefHelper.getTimeout();
        if (timeout <= 0) {
            timeout = 3000;
        }
        try {
            jSONObject.put(BranchRemoteInterface.RETRY_NUMBER, i);
        } catch (JSONException unused) {
        }
        HttpsURLConnection httpsURLConnection3 = null;
        try {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TrafficStats.setThreadStatsTag(102);
                    }
                    httpsURLConnection2 = (HttpsURLConnection) new URL(str).openConnection();
                    try {
                        try {
                            httpsURLConnection2.setConnectTimeout(timeout);
                            httpsURLConnection2.setReadTimeout(timeout);
                            httpsURLConnection2.setDoInput(true);
                            httpsURLConnection2.setDoOutput(true);
                            httpsURLConnection2.setRequestProperty("Content-Type", "application/json");
                            httpsURLConnection2.setRequestProperty("Accept", "application/json");
                            httpsURLConnection2.setRequestMethod("POST");
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection2.getOutputStream());
                            outputStreamWriter.write(jSONObject.toString());
                            outputStreamWriter.flush();
                            outputStreamWriter.close();
                            int responseCode = httpsURLConnection2.getResponseCode();
                            if (responseCode >= 500 && i < this.prefHelper.getRetryCount()) {
                                try {
                                    Thread.sleep(this.prefHelper.getRetryInterval());
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                BranchRemoteInterface.BranchResponse doRestfulPost = doRestfulPost(str, jSONObject, i + 1);
                                if (httpsURLConnection2 != null) {
                                    httpsURLConnection2.disconnect();
                                }
                                return doRestfulPost;
                            }
                            try {
                                try {
                                    if (responseCode != 200) {
                                        try {
                                            if (httpsURLConnection2.getErrorStream() != null) {
                                                errorStream = httpsURLConnection2.getErrorStream();
                                                BranchRemoteInterface.BranchResponse branchResponse = new BranchRemoteInterface.BranchResponse(getResponseString(errorStream), responseCode);
                                                if (errorStream != null) {
                                                    try {
                                                        errorStream.close();
                                                    } catch (IOException e2) {
                                                        e2.printStackTrace();
                                                    }
                                                }
                                                if (httpsURLConnection2 != null) {
                                                    httpsURLConnection2.disconnect();
                                                }
                                                return branchResponse;
                                            }
                                        } catch (FileNotFoundException unused2) {
                                            errorStream = null;
                                            PrefHelper.Debug("A resource conflict occurred with this request " + str);
                                            BranchRemoteInterface.BranchResponse branchResponse2 = new BranchRemoteInterface.BranchResponse(null, responseCode);
                                            if (errorStream != null) {
                                            }
                                            if (httpsURLConnection2 != null) {
                                            }
                                            return branchResponse2;
                                        } catch (Throwable th) {
                                            th = th;
                                            errorStream = null;
                                            if (errorStream != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    BranchRemoteInterface.BranchResponse branchResponse3 = new BranchRemoteInterface.BranchResponse(getResponseString(errorStream), responseCode);
                                    if (errorStream != null) {
                                    }
                                    if (httpsURLConnection2 != null) {
                                    }
                                    return branchResponse3;
                                } catch (FileNotFoundException unused3) {
                                    PrefHelper.Debug("A resource conflict occurred with this request " + str);
                                    BranchRemoteInterface.BranchResponse branchResponse22 = new BranchRemoteInterface.BranchResponse(null, responseCode);
                                    if (errorStream != null) {
                                        try {
                                            errorStream.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    return branchResponse22;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (errorStream != null) {
                                    try {
                                        errorStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                            errorStream = httpsURLConnection2.getInputStream();
                        } catch (IOException e5) {
                            e = e5;
                            PrefHelper.Debug("Http connect exception: " + e.getMessage());
                            throw new BranchRemoteInterface.BranchRemoteException(-113);
                        }
                    } catch (SocketTimeoutException unused4) {
                        httpsURLConnection3 = httpsURLConnection2;
                        if (i >= this.prefHelper.getRetryCount()) {
                            throw new BranchRemoteInterface.BranchRemoteException(-111);
                        }
                        try {
                            Thread.sleep(this.prefHelper.getRetryInterval());
                        } catch (InterruptedException e6) {
                            e6.printStackTrace();
                        }
                        BranchRemoteInterface.BranchResponse doRestfulPost2 = doRestfulPost(str, jSONObject, i + 1);
                        if (httpsURLConnection3 != null) {
                            httpsURLConnection3.disconnect();
                        }
                        return doRestfulPost2;
                    } catch (Exception e7) {
                        e = e7;
                        PrefHelper.Debug("Exception: " + e.getMessage());
                        if (e instanceof NetworkOnMainThreadException) {
                            PrefHelper.Debug("Branch Error: Don't call our synchronous methods on the main thread!!!");
                        }
                        BranchRemoteInterface.BranchResponse branchResponse4 = new BranchRemoteInterface.BranchResponse(null, 500);
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        return branchResponse4;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (httpsURLConnection3 != null) {
                        httpsURLConnection3.disconnect();
                    }
                    throw th;
                }
            } catch (SocketTimeoutException unused5) {
            } catch (IOException e8) {
                e = e8;
            } catch (Exception e9) {
                e = e9;
                httpsURLConnection2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection3 = httpsURLConnection;
        }
    }

    private String getResponseString(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            return new BufferedReader(new InputStreamReader(inputStream)).readLine();
        } catch (IOException unused) {
            return null;
        }
    }
}

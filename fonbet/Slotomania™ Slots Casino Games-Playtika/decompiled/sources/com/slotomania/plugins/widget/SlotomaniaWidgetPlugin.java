package com.slotomania.plugins.widget;

import com.slotomania.plugins.widget.SlotomaniaWidgetController;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SlotomaniaWidgetPlugin extends CordovaPlugin {
    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        str.hashCode();
        switch (str) {
            case "setDeeplink":
                setDeeplink(jSONArray, callbackContext);
                return true;
            case "refreshWidget":
                refreshWidget(callbackContext);
                return true;
            case "updateHourlyBonusState":
                updateHourlyBonusState(jSONArray, callbackContext);
                return true;
            case "isPinSupported":
                isPinSupported(callbackContext);
                return true;
            case "isWidgetOnHomeScreen":
                isWidgetOnHomeScreen(callbackContext);
                return true;
            case "setWidgetState":
                setWidgetState(jSONArray, callbackContext);
                return true;
            case "setImageUrl":
                setImageUrl(jSONArray, callbackContext);
                return true;
            case "requestPinWidget":
                requestPinWidget(callbackContext);
                return true;
            default:
                return false;
        }
    }

    private void updateHourlyBonusState(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        SlotomaniaWidgetController.HourlyBonusState hourlyBonusState;
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (SlotomaniaWidgetProvider.HOURLY_BONUS_STATE_COLLECT.equalsIgnoreCase(jSONObject.optString("state", SlotomaniaWidgetProvider.HOURLY_BONUS_STATE_TIMER))) {
            hourlyBonusState = SlotomaniaWidgetController.HourlyBonusState.COLLECT;
        } else {
            hourlyBonusState = SlotomaniaWidgetController.HourlyBonusState.TIMER;
        }
        SlotomaniaWidgetController.updateHourlyBonusState(this.f3354cordova.getActivity(), hourlyBonusState, jSONObject.has("nextHourlyBonusTimeMillis") ? Long.valueOf(jSONObject.optLong("nextHourlyBonusTimeMillis", 0L)) : null, jSONObject.has("deeplink") ? jSONObject.optString("deeplink", null) : null, jSONObject.has("imageUrl") ? jSONObject.optString("imageUrl", null) : null);
        callbackContext.success();
    }

    private void setWidgetState(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        SlotomaniaWidgetController.WidgetState widgetState;
        if (SlotomaniaWidgetProvider.WIDGET_STATE_HOURLY_BONUS.equalsIgnoreCase(jSONArray.getJSONObject(0).optString("state", SlotomaniaWidgetProvider.WIDGET_STATE_REGULAR))) {
            widgetState = SlotomaniaWidgetController.WidgetState.HOURLY_BONUS;
        } else {
            widgetState = SlotomaniaWidgetController.WidgetState.REGULAR;
        }
        SlotomaniaWidgetController.setWidgetState(this.f3354cordova.getActivity(), widgetState);
        callbackContext.success();
    }

    private void setDeeplink(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        SlotomaniaWidgetController.setDeeplink(this.f3354cordova.getActivity(), jSONArray.getJSONObject(0).optString("deeplink", null));
        callbackContext.success();
    }

    private void setImageUrl(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        SlotomaniaWidgetController.setImageUrl(this.f3354cordova.getActivity(), jSONArray.getJSONObject(0).optString("imageUrl", null));
        callbackContext.success();
    }

    private void refreshWidget(CallbackContext callbackContext) {
        SlotomaniaWidgetController.refreshWidget(this.f3354cordova.getActivity());
        callbackContext.success();
    }

    private void requestPinWidget(CallbackContext callbackContext) {
        boolean requestPinWidget = SlotomaniaWidgetController.requestPinWidget(this.f3354cordova.getActivity());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requested", requestPinWidget);
        } catch (JSONException unused) {
        }
        callbackContext.success(jSONObject);
    }

    private void isWidgetOnHomeScreen(CallbackContext callbackContext) {
        boolean isWidgetOnHomeScreen = SlotomaniaWidgetController.isWidgetOnHomeScreen(this.f3354cordova.getActivity());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isOnHomeScreen", isWidgetOnHomeScreen);
        } catch (JSONException unused) {
        }
        callbackContext.success(jSONObject);
    }

    private void isPinSupported(CallbackContext callbackContext) {
        boolean isPinSupported = SlotomaniaWidgetController.isPinSupported();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supported", isPinSupported);
        } catch (JSONException unused) {
        }
        callbackContext.success(jSONObject);
    }
}

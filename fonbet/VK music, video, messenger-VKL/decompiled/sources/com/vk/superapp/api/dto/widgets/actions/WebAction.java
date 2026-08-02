package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.api.dto.widgets.actions.WebActionRequestPermission;
import com.vk.superapp.api.dto.widgets.actions.WebActionVkInternal;
import com.vk.superapp.api.dto.widgets.actions.WebMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.c5g;
import xsna.dz5;
import xsna.epx;
import xsna.f370;
import xsna.tvs0;

/* compiled from: WebAction.kt */
/* loaded from: classes6.dex */
public abstract class WebAction implements Parcelable {
    public final bpn0 b = new bpn0(new tvs0(this, 7));

    /* compiled from: WebAction.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static WebAction a(JSONObject jSONObject, JSONObject jSONObject2) {
            WebActionOpenUrl.Target target;
            Pair pair;
            Object obj;
            WebActionVkInternal.Payload music;
            String str;
            ArrayList arrayList;
            String optString = jSONObject != null ? jSONObject.optString("type") : null;
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -1837800976:
                        if (optString.equals("open_section")) {
                            String string = jSONObject.getString("section_id");
                            JSONObject optJSONObject = jSONObject.optJSONObject("fallback_action");
                            return new WebActionOpenSection(string, optJSONObject != null ? a(optJSONObject, null) : null, jSONObject.optString("accessibility_label"), jSONObject.getString("type"));
                        }
                        break;
                    case -1337539862:
                        if (optString.equals("locality_picker")) {
                            WebActionLocalityPicker.CREATOR.getClass();
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("fallback_action");
                            return new WebActionLocalityPicker(optJSONObject2 != null ? a(optJSONObject2, null) : null, jSONObject.optString("accessibility_label"), jSONObject.getString("type"));
                        }
                        break;
                    case -624136624:
                        if (optString.equals("send_message")) {
                            WebActionSendMessage.CREATOR.getClass();
                            long j = jSONObject.getLong("peer_id");
                            WebMessage.a aVar = WebMessage.CREATOR;
                            JSONObject jSONObject3 = jSONObject.getJSONObject("message");
                            aVar.getClass();
                            WebMessage webMessage = new WebMessage(jSONObject3.optString("text"), jSONObject3.optString("payload"), jSONObject3.optBoolean("show_confirmation", false));
                            String string2 = jSONObject.getString("type");
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("fallback_action");
                            return new WebActionSendMessage(j, webMessage, optJSONObject3 != null ? a(optJSONObject3, null) : null, jSONObject.optString("accessibility_label"), string2);
                        }
                        break;
                    case -504306182:
                        if (optString.equals("open_url")) {
                            WebActionOpenUrl.CREATOR.getClass();
                            String optString2 = jSONObject.optString("target");
                            WebActionOpenUrl.Target[] values = WebActionOpenUrl.Target.values();
                            int length = values.length;
                            while (true) {
                                if (r8 < length) {
                                    target = values[r8];
                                    if (!epx.f(target.name(), optString2)) {
                                        r8++;
                                    }
                                } else {
                                    target = null;
                                }
                            }
                            if (target == null) {
                                target = WebActionOpenUrl.Target.f43default;
                            }
                            WebActionOpenUrl.Target target2 = target;
                            String optString3 = jSONObject.optString("url");
                            String string3 = jSONObject.getString("type");
                            try {
                                pair = new Pair(Long.valueOf(jSONObject.getLong("item_id")), Boolean.TRUE);
                            } catch (JSONException unused) {
                                pair = new Pair(-1L, Boolean.FALSE);
                            }
                            long longValue = ((Number) pair.d()).longValue();
                            boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                            if (optString3 == null || optString3.length() == 0) {
                                return null;
                            }
                            JSONObject optJSONObject4 = jSONObject.optJSONObject("fallback_action");
                            return new WebActionOpenUrl(optString3, target2, optJSONObject4 != null ? a(optJSONObject4, null) : null, jSONObject.optString("accessibility_label"), booleanValue, longValue, string3);
                        }
                        break;
                    case -478042873:
                        if (optString.equals("vk_internal")) {
                            WebActionVkInternal.CREATOR.getClass();
                            JSONObject jSONObject4 = jSONObject.getJSONObject("payload");
                            String optString4 = jSONObject4.optString("type");
                            if (epx.f(optString4, "share_me")) {
                                if (jSONObject2 == null || (str = jSONObject2.toString()) == null) {
                                    str = "";
                                }
                                music = new WebActionVkInternal.Payload.ShareMe(str);
                            } else {
                                if (!epx.f(optString4, "music")) {
                                    return null;
                                }
                                String optString5 = jSONObject4.optString("extra");
                                Object obj2 = WebActionVkInternal.Payload.Music.Extra.PLAY;
                                if (optString5 != null) {
                                    try {
                                        obj = Enum.valueOf(WebActionVkInternal.Payload.Music.Extra.class, optString5.toUpperCase(Locale.US));
                                    } catch (IllegalArgumentException unused2) {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        obj2 = obj;
                                    }
                                }
                                music = new WebActionVkInternal.Payload.Music((WebActionVkInternal.Payload.Music.Extra) obj2, f370.D(jSONObject4, "block_id"), jSONObject4.has("item_id") ? jSONObject4.getInt("item_id") : 0);
                            }
                            String string4 = jSONObject.getString("type");
                            JSONObject optJSONObject5 = jSONObject.optJSONObject("fallback_action");
                            return new WebActionVkInternal(music, optJSONObject5 != null ? a(optJSONObject5, null) : null, jSONObject.optString("accessibility_label"), string4);
                        }
                        break;
                    case -172220347:
                        if (optString.equals("callback")) {
                            WebActionCallback.CREATOR.getClass();
                            String string5 = jSONObject.getString("payload");
                            String string6 = jSONObject.getString("type");
                            JSONObject optJSONObject6 = jSONObject.optJSONObject("fallback_action");
                            return new WebActionCallback(string5, optJSONObject6 != null ? a(optJSONObject6, null) : null, jSONObject.optString("accessibility_label"), string6);
                        }
                        break;
                    case 3045982:
                        if (optString.equals(NotificationCompat.CATEGORY_CALL)) {
                            WebActionCall.CREATOR.getClass();
                            int i = jSONObject.getInt("peer_id");
                            JSONObject optJSONObject7 = jSONObject.optJSONObject("fallback_action");
                            return new WebActionCall(i, optJSONObject7 != null ? a(optJSONObject7, null) : null, jSONObject.optString("accessibility_label"), jSONObject.getString("type"));
                        }
                        break;
                    case 170703335:
                        if (optString.equals("grant_access")) {
                            WebActionRequestPermission.CREATOR.getClass();
                            ArrayList H = dz5.H(jSONObject.getJSONArray("needed_permissions"));
                            if (H != null) {
                                arrayList = new ArrayList(c5g.u(H, 10));
                                Iterator it = H.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(WebActionRequestPermission.Permission.valueOf(((String) it.next()).toUpperCase(Locale.US)));
                                }
                            } else {
                                arrayList = null;
                            }
                            String string7 = jSONObject.getString("type");
                            if (arrayList != null && !arrayList.isEmpty()) {
                                JSONObject optJSONObject8 = jSONObject.optJSONObject("fallback_action");
                                return new WebActionRequestPermission(arrayList, optJSONObject8 != null ? a(optJSONObject8, null) : null, jSONObject.optString("accessibility_label"), string7);
                            }
                        }
                        break;
                    case 689656590:
                        if (optString.equals("open_native_app")) {
                            WebActionOpenNativeApp.CREATOR.getClass();
                            String D = f370.D(jSONObject, CampaignEx.JSON_KEY_DEEP_LINK_URL);
                            String D2 = f370.D(jSONObject, "package_name");
                            if (D2 != null) {
                                String string8 = jSONObject.getString("type");
                                JSONObject optJSONObject9 = jSONObject.optJSONObject("fallback_action");
                                return new WebActionOpenNativeApp(D, D2, optJSONObject9 != null ? a(optJSONObject9, null) : null, jSONObject.optString("accessibility_label"), string8);
                            }
                        }
                        break;
                    case 693771543:
                        if (optString.equals("open_vkapp")) {
                            WebActionOpenVkApp.CREATOR.getClass();
                            return WebActionOpenVkApp.a.a(jSONObject);
                        }
                        break;
                    case 850282638:
                        if (optString.equals("open_mini_app")) {
                            WebActionOpenVkApp.CREATOR.getClass();
                            return WebActionOpenVkApp.a.a(jSONObject);
                        }
                        break;
                    case 1391552897:
                        if (optString.equals("redesign_v3_header")) {
                            JSONObject optJSONObject10 = jSONObject.optJSONObject("fallback_action");
                            return new WebActionOnboardingRedesignV3(optJSONObject10 != null ? a(optJSONObject10, null) : null, jSONObject.optString("accessibility_label"), jSONObject.getString("type"));
                        }
                        break;
                    case 1545944263:
                        if (optString.equals("open_game")) {
                            WebActionOpenVkApp.CREATOR.getClass();
                            return WebActionOpenVkApp.a.a(jSONObject);
                        }
                        break;
                    case 1586893590:
                        if (optString.equals("open_internal_vkui")) {
                            WebActionOpenInternalVkUi.CREATOR.getClass();
                            String optString6 = jSONObject.optString("url");
                            String string9 = jSONObject.getString("type");
                            if (optString6 != null && optString6.length() != 0) {
                                JSONObject optJSONObject11 = jSONObject.optJSONObject("fallback_action");
                                return new WebActionOpenInternalVkUi(optString6, optJSONObject11 != null ? a(optJSONObject11, null) : null, jSONObject.optString("accessibility_label"), string9);
                            }
                        }
                        break;
                }
            }
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String f();

    public abstract WebAction g();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}

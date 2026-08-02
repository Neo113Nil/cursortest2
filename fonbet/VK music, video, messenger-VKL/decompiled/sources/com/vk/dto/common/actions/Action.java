package com.vk.dto.common.actions;

import android.os.Parcel;
import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.actions.ActionOpenVkApp;
import com.vk.dto.common.actions.ActionPerformActionWithUrl;
import com.vk.dto.common.actions.snackbar.ActionShowSnackbar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.drm0;
import xsna.epx;
import xsna.f370;
import xsna.f8k0;

/* compiled from: Action.kt */
/* loaded from: classes18.dex */
public abstract class Action implements Serializer.StreamParcelable, bxx {
    public static final b b = new b();

    /* compiled from: Action.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static Action a(JSONObject jSONObject) {
            ActionOpenUrl.Target target;
            String A;
            String A2;
            String A3;
            String optString = jSONObject != null ? jSONObject.optString("type") : null;
            if (optString != null) {
                int i = 0;
                switch (optString.hashCode()) {
                    case -1709628451:
                        if (optString.equals("market_edit_album")) {
                            Serializer.c<ActionOpenEditMarketAlbum> cVar = ActionOpenEditMarketAlbum.CREATOR;
                            JSONObject optJSONObject = jSONObject.optJSONObject("market_edit_album_info");
                            return new ActionOpenEditMarketAlbum(new UserId(optJSONObject.optLong("owner_id")), optJSONObject.optInt("album_id"));
                        }
                        break;
                    case -1209156902:
                        if (optString.equals("groups_advertisement")) {
                            Serializer.c<ActionOpenAdvUrl> cVar2 = ActionOpenAdvUrl.CREATOR;
                            String optString2 = jSONObject.optString("target");
                            ActionOpenUrl.Target[] values = ActionOpenUrl.Target.values();
                            int length = values.length;
                            while (true) {
                                if (i < length) {
                                    target = values[i];
                                    if (!epx.f(target.name(), optString2)) {
                                        i++;
                                    }
                                } else {
                                    target = null;
                                }
                            }
                            String optString3 = jSONObject.optString("url");
                            if (optString3 != null && optString3.length() != 0 && target != null) {
                                return new ActionOpenAdvUrl(optString3, target);
                            }
                            return null;
                        }
                        break;
                    case -653055912:
                        if (optString.equals("open_conversation")) {
                            Serializer.c<ActionOpenConversation> cVar3 = ActionOpenConversation.CREATOR;
                            Long z = f370.z(jSONObject, "peer_id");
                            if (z != null) {
                                return new ActionOpenConversation(z.longValue());
                            }
                            return null;
                        }
                        break;
                    case -504306182:
                        if (optString.equals("open_url")) {
                            ActionOpenUrl.a aVar = ActionOpenUrl.e;
                            return ActionOpenUrl.a.a(jSONObject);
                        }
                        break;
                    case 3045982:
                        if (optString.equals(NotificationCompat.CATEGORY_CALL)) {
                            Serializer.c<ActionPhoneCall> cVar4 = ActionPhoneCall.CREATOR;
                            JSONObject optJSONObject2 = jSONObject.optJSONObject(NotificationCompat.CATEGORY_CALL);
                            if (optJSONObject2 != null) {
                                return new ActionPhoneCall(optJSONObject2.optString("phone"));
                            }
                            return null;
                        }
                        break;
                    case 109400031:
                        if (optString.equals("share")) {
                            Serializer.c<ActionShareUrl> cVar5 = ActionShareUrl.CREATOR;
                            String optString4 = jSONObject.optString("url");
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("share_options");
                            Boolean valueOf = optJSONObject3 != null ? Boolean.valueOf(optJSONObject3.optBoolean("disable_message")) : null;
                            if (optString4 != null && !drm0.N(optString4)) {
                                return new ActionShareUrl(optString4, valueOf != null ? valueOf.booleanValue() : false);
                            }
                            return null;
                        }
                        break;
                    case 262287900:
                        if (optString.equals("market_write")) {
                            Serializer.c<ActionSendMarketMessage> cVar6 = ActionSendMarketMessage.CREATOR;
                            JSONObject optJSONObject4 = jSONObject.optJSONObject("market_write");
                            if (optJSONObject4 != null) {
                                return new ActionSendMarketMessage(optJSONObject4.optLong("peer_id"), optJSONObject4.optString("message", null));
                            }
                            return null;
                        }
                        break;
                    case 474265455:
                        if (optString.equals("close_web_app")) {
                            return new ActionCloseWebApp();
                        }
                        break;
                    case 646872449:
                        if (optString.equals("perform_action_with_url")) {
                            Serializer.c<ActionPerformActionWithUrl> cVar7 = ActionPerformActionWithUrl.CREATOR;
                            String optString5 = jSONObject.optString("url");
                            JSONObject optJSONObject5 = jSONObject.optJSONObject("perform_action_with_url");
                            return new ActionPerformActionWithUrl(optString5, optJSONObject5 != null ? new ActionPerformActionWithUrl.PerformActionWithUrl(optJSONObject5.optString("action")) : null);
                        }
                        break;
                    case 693771543:
                        if (optString.equals("open_vkapp")) {
                            Serializer.c<ActionOpenVkApp> cVar8 = ActionOpenVkApp.CREATOR;
                            return ActionOpenVkApp.a.a(jSONObject);
                        }
                        break;
                    case 729574798:
                        if (optString.equals("show_full_post")) {
                            return new ActionShowFullPost(new UserId(jSONObject.optLong("post_owner_id")), jSONObject.optInt("post_id"), jSONObject.optString("referer"));
                        }
                        break;
                    case 1297033413:
                        if (optString.equals("help_hint")) {
                            Serializer.c<ActionHelpHint> cVar9 = ActionHelpHint.CREATOR;
                            JSONObject optJSONObject6 = jSONObject.optJSONObject("help_hint");
                            if (optJSONObject6 != null) {
                                Serializer.c<Hint> cVar10 = Hint.CREATOR;
                                Hint a = Hint.a.a(optJSONObject6);
                                if (a != null) {
                                    return new ActionHelpHint(a);
                                }
                            }
                            return null;
                        }
                        break;
                    case 1361543127:
                        if (optString.equals("enable_top_newsfeed")) {
                            return new ActionEnableTopNews();
                        }
                        break;
                    case 1545944263:
                        if (optString.equals("open_game")) {
                            Serializer.c<ActionOpenVkApp> cVar11 = ActionOpenVkApp.CREATOR;
                            return ActionOpenVkApp.a.a(jSONObject);
                        }
                        break;
                    case 1586893590:
                        if (optString.equals("open_internal_vkui")) {
                            Serializer.c<ActionOpenInternalVkUi> cVar12 = ActionOpenInternalVkUi.CREATOR;
                            String optString6 = jSONObject.optString("url");
                            if (optString6 != null && optString6.length() != 0) {
                                return new ActionOpenInternalVkUi(optString6);
                            }
                            return null;
                        }
                        break;
                    case 1782807769:
                        if (optString.equals("specials_perform_action")) {
                            Serializer.c<ActionPerformClick> cVar13 = ActionPerformClick.CREATOR;
                            String optString7 = jSONObject.optString("jwt");
                            if (optString7 != null) {
                                return new ActionPerformClick(optString7);
                            }
                            return null;
                        }
                        break;
                    case 2012826631:
                        if (optString.equals("show_snackbar")) {
                            Serializer.c<ActionShowSnackbar> cVar14 = ActionShowSnackbar.CREATOR;
                            JSONObject optJSONObject7 = jSONObject.optJSONObject("show_snackbar");
                            if (optJSONObject7 != null && (A = f370.A("message", optJSONObject7)) != null) {
                                JSONObject optJSONObject8 = optJSONObject7.optJSONObject("icon");
                                f8k0 f8k0Var = (optJSONObject8 == null || (A2 = f370.A("type", optJSONObject8)) == null || (A3 = f370.A("color", optJSONObject8)) == null) ? null : new f8k0(A2, A3);
                                if (f8k0Var != null) {
                                    return new ActionShowSnackbar(A, f8k0Var);
                                }
                            }
                            return null;
                        }
                        break;
                }
            }
            return new ActionEmpty();
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<Action> {
        @Override // xsna.aay
        public final Action a(JSONObject jSONObject) {
            b bVar = Action.b;
            return a.a(jSONObject);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }
}

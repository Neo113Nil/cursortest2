package com.vk.feed.core.models.actions;

import android.os.Parcel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenModal;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: HeaderAction.kt */
/* loaded from: classes18.dex */
public abstract class HeaderAction implements Serializer.StreamParcelable {

    /* compiled from: HeaderAction.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        public static HeaderAction a(JSONObject jSONObject, Map map) {
            ActionOpenModal.ModalImage modalImage;
            ActionOpenModal.OverlayImage overlayImage;
            Text text;
            Image image;
            String optString = jSONObject.optString("type");
            ActionOpenModal.ModalButton modalButton = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -2047720868:
                        if (optString.equals("best_friend_posting")) {
                            return new ActionOpenBestFriendsPosting();
                        }
                        break;
                    case -252086239:
                        if (optString.equals("open_geo_feed")) {
                            return new ActionOpenGeoFeed();
                        }
                        break;
                    case 136300623:
                        if (optString.equals("remote_action")) {
                            Serializer.c<ActionRemote> cVar = ActionRemote.CREATOR;
                            JSONObject optJSONObject = jSONObject.optJSONObject("remote_action");
                            Action.b bVar = Action.b;
                            return new ActionRemote(Action.a.a(optJSONObject));
                        }
                        break;
                    case 685581432:
                        if (optString.equals("open_modal")) {
                            Serializer.c<ActionOpenModal> cVar2 = ActionOpenModal.CREATOR;
                            JSONObject jSONObject2 = jSONObject.getJSONObject("modal");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("image");
                            int i = 2;
                            if (optJSONObject2 != null) {
                                Serializer.c<ActionOpenModal.ModalImage> cVar3 = ActionOpenModal.ModalImage.CREATOR;
                                UserId userId = optJSONObject2.has("source_id") ? new UserId(optJSONObject2.optLong("source_id")) : null;
                                Owner owner = (userId == null || map == null) ? null : (Owner) map.get(userId);
                                String optString2 = optJSONObject2.optString(CampaignEx.JSON_KEY_IMAGE_URL);
                                if (optString2.length() <= 0) {
                                    optString2 = null;
                                }
                                if (optString2 == null) {
                                    optString2 = owner != null ? owner.d : null;
                                }
                                if (owner == null || (image = owner.g) == null) {
                                    JSONArray optJSONArray = optJSONObject2.optJSONArray("sizes");
                                    image = optJSONArray != null ? new Image(optJSONArray, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0) : null;
                                }
                                modalImage = new ActionOpenModal.ModalImage(optString2, image);
                            } else {
                                modalImage = null;
                            }
                            JSONObject optJSONObject3 = jSONObject2.optJSONObject("overlay_image");
                            if (optJSONObject3 != null) {
                                Serializer.c<ActionOpenModal.OverlayImage> cVar4 = ActionOpenModal.OverlayImage.CREATOR;
                                String optString3 = optJSONObject3.optString("name");
                                String optString4 = optJSONObject3.optString("url");
                                JSONArray optJSONArray2 = optJSONObject3.optJSONArray("sizes");
                                overlayImage = new ActionOpenModal.OverlayImage(optString3, optString4, optJSONArray2 != null ? new Image(optJSONArray2, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0) : null);
                            } else {
                                overlayImage = null;
                            }
                            String optString5 = jSONObject2.optString("title");
                            JSONObject optJSONObject4 = jSONObject2.optJSONObject("text");
                            if (optJSONObject4 != null) {
                                Serializer.c<Text> cVar5 = Text.CREATOR;
                                text = Text.a.a(optJSONObject4);
                            } else {
                                text = null;
                            }
                            JSONObject optJSONObject5 = jSONObject2.optJSONObject("button");
                            if (optJSONObject5 != null) {
                                Serializer.c<ActionOpenModal.ModalButton> cVar6 = ActionOpenModal.ModalButton.CREATOR;
                                modalButton = ActionOpenModal.ModalButton.a.a(optJSONObject5, map);
                            }
                            return new ActionOpenModal(modalImage, overlayImage, optString5, text, modalButton);
                        }
                        break;
                    case 1306443794:
                        if (optString.equals("open_copyright")) {
                            return new ActionOpenCopyright();
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

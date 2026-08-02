package com.braze.models.inappmessage;

import bo.app.z1;
import com.braze.Constants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageZippedAssetHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "", "", "getRemoteAssetPathsForPrefetch", "Lorg/json/JSONObject;", "forJsonPut", "assetsZipRemoteUrl", "Ljava/lang/String;", "getAssetsZipRemoteUrl", "()Ljava/lang/String;", "setAssetsZipRemoteUrl", "(Ljava/lang/String;)V", "<init>", "()V", "jsonObject", "Lbo/app/z1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/z1;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class InAppMessageZippedAssetHtmlBase extends InAppMessageHtmlBase implements IInAppMessageZippedAssetHtml {
    private static final String HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL = "zipped_assets_url";
    private String assetsZipRemoteUrl;

    public InAppMessageZippedAssetHtmlBase() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public String getAssetsZipRemoteUrl() {
        return this.assetsZipRemoteUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String assetsZipRemoteUrl = getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl != null && !StringsKt.isBlank(assetsZipRemoteUrl)) {
            arrayList.add(assetsZipRemoteUrl);
        }
        return arrayList;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public void setAssetsZipRemoteUrl(String str) {
        this.assetsZipRemoteUrl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageZippedAssetHtmlBase(JSONObject jsonObject, z1 brazeManager) {
        super(jsonObject, brazeManager);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        String it = jsonObject.optString(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (StringsKt.isBlank(it)) {
            return;
        }
        setAssetsZipRemoteUrl(it);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getJsonKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject == null) {
            jsonObject = super.getJsonKey();
            try {
                jsonObject.putOpt(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL, getAssetsZipRemoteUrl());
            } catch (JSONException unused) {
            }
        }
        return jsonObject;
    }
}

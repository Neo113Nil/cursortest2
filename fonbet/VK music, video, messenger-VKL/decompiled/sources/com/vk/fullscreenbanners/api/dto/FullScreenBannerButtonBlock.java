package com.vk.fullscreenbanners.api.dto;

import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.fullscreenbanners.BlockType;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.button.OpenUrlButtonFullScreenBannerBlock;
import org.json.JSONObject;
import xsna.aay;

/* compiled from: FullScreenBannerButtonBlock.kt */
/* loaded from: classes16.dex */
public abstract class FullScreenBannerButtonBlock extends FullScreenBannerBlock {
    public static final a d = new a();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<FullScreenBannerButtonBlock> {
        @Override // xsna.aay
        public final FullScreenBannerButtonBlock a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            if (optJSONObject == null) {
                return null;
            }
            String string = optJSONObject.getString("type");
            if (string == null) {
                string = "";
            }
            if (!string.equals("open_url")) {
                return null;
            }
            ActionOpenUrl.a aVar = ActionOpenUrl.e;
            return new OpenUrlButtonFullScreenBannerBlock(jSONObject.getString("title"), ActionOpenUrl.a.a(optJSONObject), optJSONObject.optString("consume_reason"));
        }
    }

    public FullScreenBannerButtonBlock() {
        super(BlockType.BUTTON);
    }
}

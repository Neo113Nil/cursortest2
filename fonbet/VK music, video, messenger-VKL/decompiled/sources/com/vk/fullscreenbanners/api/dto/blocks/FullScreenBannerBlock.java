package com.vk.fullscreenbanners.api.dto.blocks;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.fullscreenbanners.BlockType;
import com.vk.fullscreenbanners.api.dto.blocks.button.OpenUrlButtonFullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.common.ImageFullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.common.TextFullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.common.TitleFullScreenBannerBlock;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.tvs;

/* compiled from: FullScreenBannerBlock.kt */
/* loaded from: classes16.dex */
public abstract class FullScreenBannerBlock extends Serializer.StreamParcelableAdapter implements bxx {
    public static final a c = new a();
    public final BlockType b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<FullScreenBannerBlock> {
        @Override // xsna.aay
        public final FullScreenBannerBlock a(JSONObject jSONObject) {
            JSONObject optJSONObject;
            String string = jSONObject.getString("type");
            BlockType.Companion.getClass();
            int i = tvs.$EnumSwitchMapping$0[BlockType.a.a(string).ordinal()];
            if (i == 1) {
                return new TextFullScreenBannerBlock(jSONObject);
            }
            if (i == 2) {
                return new TitleFullScreenBannerBlock(jSONObject);
            }
            if (i == 3) {
                return new ImageFullScreenBannerBlock(jSONObject);
            }
            if (i != 4 || (optJSONObject = jSONObject.optJSONObject("action")) == null) {
                return null;
            }
            String string2 = optJSONObject.getString("type");
            if (string2 == null) {
                string2 = "";
            }
            if (!string2.equals("open_url")) {
                return null;
            }
            ActionOpenUrl.a aVar = ActionOpenUrl.e;
            return new OpenUrlButtonFullScreenBannerBlock(jSONObject.getString("title"), ActionOpenUrl.a.a(optJSONObject), optJSONObject.optString("consume_reason"));
        }
    }

    public FullScreenBannerBlock(BlockType blockType) {
        this.b = blockType;
    }
}

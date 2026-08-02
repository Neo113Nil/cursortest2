package com.vk.search.ui.impl.catalog.feed;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.search.params.api.VkFeedSearchParams;
import org.json.JSONObject;
import xsna.asp;
import xsna.hda;
import xsna.ozl;
import xsna.rsg0;
import xsna.wba;
import xsna.zrp;

/* compiled from: CatalogGetSearchStatuses.kt */
/* loaded from: classes5.dex */
public final class CatalogGetSearchStatuses extends rsg0<hda> {
    public final wba s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetSearchStatuses.kt */
    public static final class InputMethod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InputMethod[] $VALUES;
        public static final InputMethod GoogleVoice;
        public static final InputMethod Keyboard;

        @ozl
        public static final InputMethod Marusia;
        public static final InputMethod Preset;
        public static final InputMethod QueryViewClick;
        public static final InputMethod Suggest;
        private final String apiName;

        static {
            InputMethod inputMethod = new InputMethod("Keyboard", 0, "keyboard");
            Keyboard = inputMethod;
            InputMethod inputMethod2 = new InputMethod("GoogleVoice", 1, "google_speech_to_text");
            GoogleVoice = inputMethod2;
            InputMethod inputMethod3 = new InputMethod("Preset", 2, "preset_from_link");
            Preset = inputMethod3;
            InputMethod inputMethod4 = new InputMethod("Marusia", 3, "marusia_speech_to_text");
            Marusia = inputMethod4;
            InputMethod inputMethod5 = new InputMethod("Suggest", 4, "suggest");
            Suggest = inputMethod5;
            InputMethod inputMethod6 = new InputMethod("QueryViewClick", 5, "query_view_click");
            QueryViewClick = inputMethod6;
            InputMethod[] inputMethodArr = {inputMethod, inputMethod2, inputMethod3, inputMethod4, inputMethod5, inputMethod6};
            $VALUES = inputMethodArr;
            $ENTRIES = new asp(inputMethodArr);
        }

        public InputMethod(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static InputMethod valueOf(String str) {
            return (InputMethod) Enum.valueOf(InputMethod.class, str);
        }

        public static InputMethod[] values() {
            return (InputMethod[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    public CatalogGetSearchStatuses(wba wbaVar, String str, String str2, VkFeedSearchParams vkFeedSearchParams, InputMethod inputMethod, boolean z) {
        super("catalog.getSearchStatuses");
        this.s = wbaVar;
        K(CampaignEx.JSON_KEY_AD_Q, str);
        C(20, "count");
        K("input_method", inputMethod != null ? inputMethod.h() : null);
        C(1, "safe_search");
        if (vkFeedSearchParams != null) {
            C(vkFeedSearchParams.b.h(), "sort");
        }
        if (vkFeedSearchParams != null) {
            C(!vkFeedSearchParams.c ? 1 : 0, "allow_duplicates");
        }
        C(1, "need_blocks");
        K("suggest_trackcode", str2);
        R("is_ptr", z);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        hda c = this.s.c(jSONObject.getJSONObject("response"));
        CatalogSection Ab = ((CatalogCatalog) c.a).Ab();
        return new hda(Ab, c.b, Ab.e);
    }
}

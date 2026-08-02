package com.vk.superapp.api.dto.story.actions;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;

/* compiled from: WebActionSituationalTheme.kt */
/* loaded from: classes6.dex */
public final class WebActionSituationalTheme extends StickerAction {
    public static final Serializer.c<WebActionSituationalTheme> CREATOR = new a();
    public final WebStickerType b = WebStickerType.SITUATIONAL_THEME;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionSituationalTheme> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionSituationalTheme a(Serializer serializer) {
            return new WebActionSituationalTheme();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionSituationalTheme[i];
        }
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        return new JSONObject();
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}

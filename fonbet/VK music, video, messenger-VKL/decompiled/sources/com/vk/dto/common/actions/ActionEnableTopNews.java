package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.yq;

/* compiled from: ActionEnableTopNews.kt */
/* loaded from: classes18.dex */
public final class ActionEnableTopNews extends Action {
    public static final Serializer.c<ActionEnableTopNews> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionEnableTopNews> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionEnableTopNews a(Serializer serializer) {
            return new ActionEnableTopNews();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionEnableTopNews[i];
        }
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return yq.d("type", "enable_top_news");
    }

    public final boolean equals(Object obj) {
        return obj instanceof ActionEnableTopNews;
    }

    public final int hashCode() {
        return ActionEnableTopNews.class.hashCode();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}

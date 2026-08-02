package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenUrl;
import org.json.JSONObject;

/* compiled from: ActionOpenAdvUrl.kt */
/* loaded from: classes18.dex */
public final class ActionOpenAdvUrl extends ActionOpenUrl {
    public static final Serializer.c<ActionOpenAdvUrl> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenAdvUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenAdvUrl a(Serializer serializer) {
            return new ActionOpenAdvUrl(serializer.H(), ActionOpenUrl.Target.values()[serializer.u()]);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenAdvUrl[i];
        }
    }

    public ActionOpenAdvUrl(String str, ActionOpenUrl.Target target) {
        super(str, target);
    }

    @Override // com.vk.dto.common.actions.ActionOpenUrl, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.S(this.d.ordinal());
    }

    @Override // com.vk.dto.common.actions.ActionOpenUrl, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("type", "groups_advertisement");
        return e5;
    }
}

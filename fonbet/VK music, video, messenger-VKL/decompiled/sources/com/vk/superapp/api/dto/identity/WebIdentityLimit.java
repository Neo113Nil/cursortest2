package com.vk.superapp.api.dto.identity;

import com.vk.core.serialize.Serializer;

/* compiled from: WebIdentityLimit.kt */
/* loaded from: classes6.dex */
public final class WebIdentityLimit extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebIdentityLimit> CREATOR = new a();
    public final String b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebIdentityLimit> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebIdentityLimit a(Serializer serializer) {
            return new WebIdentityLimit(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebIdentityLimit[i];
        }
    }

    public WebIdentityLimit(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
    }

    public WebIdentityLimit(Serializer serializer) {
        this(serializer.H(), serializer.u());
    }
}

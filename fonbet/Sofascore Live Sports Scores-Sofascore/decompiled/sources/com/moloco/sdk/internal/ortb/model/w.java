package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.d;
import defpackage.r5h;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class w {

    @NotNull
    public static final d.b Companion = new d.b();
    public final String a;
    public final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class a {
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) e1.a.getValue();
        }
    }

    public /* synthetic */ w(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}

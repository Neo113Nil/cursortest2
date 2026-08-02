package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.U3;
import defpackage.e7n;
import defpackage.e9k;
import defpackage.f7n;
import defpackage.map;
import defpackage.wt3;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiElementImpl implements e9k {
    public static final map GSON_TYPE_ADAPTER = new map() { // from class: com.google.ads.interactivemedia.v3.impl.data.UiElementImpl.1
        @Override // defpackage.map
        public UiElementImpl read(e7n e7nVar) throws IOException {
            if (e7nVar.Q0() != 9) {
                return new UiElementImpl(e7nVar.f0());
            }
            e7nVar.j0();
            return new UiElementImpl("");
        }

        @Override // defpackage.map
        public void write(f7n f7nVar, UiElementImpl uiElementImpl) throws IOException {
            if (uiElementImpl == null) {
                f7nVar.f0();
            } else {
                f7nVar.H(uiElementImpl.getName());
            }
        }
    };
    private final String name;

    public UiElementImpl(@NonNull String str) {
        this.name = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof UiElementImpl)) {
            return this.name.equals(((UiElementImpl) obj).name);
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    @NonNull
    public String toString() {
        String str = this.name;
        return wt3.m("UiElementImpl[name=", str, new StringBuilder(String.valueOf(str).length() + 20), U3.j.e);
    }
}

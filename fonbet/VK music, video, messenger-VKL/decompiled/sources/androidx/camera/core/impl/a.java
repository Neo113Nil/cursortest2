package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import xsna.tk5;

/* compiled from: AutoValue_Config_Option.java */
/* loaded from: classes11.dex */
public final class a<T> extends Config.a<T> {
    public final String a;
    public final Class<T> b;
    public final Object c;

    public a(String str, Class cls, @Nullable CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.c = key;
    }

    @Override // androidx.camera.core.impl.Config.a
    @NonNull
    public final String b() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.Config.a
    @Nullable
    public final Object c() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.Config.a
    @NonNull
    public final Class<T> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.a)) {
            return false;
        }
        Config.a aVar = (Config.a) obj;
        if (!this.a.equals(aVar.b()) || !this.b.equals(aVar.d())) {
            return false;
        }
        Object obj2 = this.c;
        return obj2 == null ? aVar.c() == null : obj2.equals(aVar.c());
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.a);
        sb.append(", valueClass=");
        sb.append(this.b);
        sb.append(", token=");
        return tk5.c(sb, this.c, "}");
    }
}

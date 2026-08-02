package com.vk.core.fragments;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import java.io.Serializable;
import java.util.UUID;
import xsna.epx;
import xsna.ho8;
import xsna.vbs;
import xsna.zcl;

/* compiled from: FragmentEntry.kt */
/* loaded from: classes.dex */
public final class FragmentEntry extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<FragmentEntry> CREATOR = new b();
    public final Class<? extends FragmentImpl> b;
    public final Bundle c;
    public final String d;
    public final Class<? extends FragmentImpl> e;

    /* compiled from: FragmentEntry.kt */
    public static final class a {
        public static String a(FragmentImpl fragmentImpl) {
            Bundle arguments = fragmentImpl.getArguments();
            if (arguments != null) {
                return arguments.getString("_fragment_impl_key_id");
            }
            return null;
        }

        public static String b(FragmentImpl fragmentImpl) {
            String a = a(fragmentImpl);
            if (a != null && a.length() != 0) {
                return a;
            }
            String uuid = UUID.randomUUID().toString();
            if (fragmentImpl.getArguments() == null) {
                fragmentImpl.setArguments(new Bundle());
            }
            fragmentImpl.requireArguments().putString("_fragment_impl_key_id", uuid);
            return uuid;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<FragmentEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FragmentEntry a(Serializer serializer) {
            return new FragmentEntry((Class) serializer.C(), serializer.o(FragmentEntry.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FragmentEntry[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentEntry(Class<? extends FragmentImpl> cls) {
        this(cls, null, 2, 0 == true ? 1 : 0);
    }

    public final FragmentImpl Ab() {
        FragmentImpl newInstance = this.b.newInstance();
        FragmentImpl fragmentImpl = newInstance;
        String str = this.d;
        Bundle bundle = this.c;
        bundle.putString("_fragment_impl_key_id", str);
        fragmentImpl.setArguments(new Bundle(bundle));
        fragmentImpl.C = this;
        return newInstance;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.K(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        FragmentEntry fragmentEntry = obj instanceof FragmentEntry ? (FragmentEntry) obj : null;
        return epx.f(this.d, fragmentEntry != null ? fragmentEntry.d : null);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentEntry{class=");
        sb.append(this.b.getName());
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", root=");
        Class<? extends FragmentImpl> cls = this.e;
        return ho8.a(sb, cls != null ? cls.getName() : null, '}');
    }

    public final FragmentImpl zb(vbs vbsVar) {
        return vbsVar.b(this.d);
    }

    public /* synthetic */ FragmentEntry(Class cls, Bundle bundle, int i, zcl zclVar) {
        this(cls, (i & 2) != 0 ? new Bundle() : bundle);
    }

    public FragmentEntry(Class<? extends FragmentImpl> cls, Bundle bundle) {
        this(cls, bundle == null ? new Bundle() : bundle, UUID.randomUUID().toString());
    }

    public FragmentEntry(Class<? extends FragmentImpl> cls, Bundle bundle, String str) {
        this.b = cls;
        this.c = bundle;
        this.d = str;
        Class<? extends FragmentImpl> cls2 = null;
        try {
            Serializable serializable = bundle.getSerializable("_fragment_impl_key_root_fragment");
            if (serializable instanceof Class) {
                cls2 = (Class) serializable;
            }
        } catch (Exception unused) {
        }
        this.e = cls2;
    }
}

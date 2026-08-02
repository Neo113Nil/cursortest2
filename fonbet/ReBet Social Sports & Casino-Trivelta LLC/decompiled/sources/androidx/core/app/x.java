package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f18990a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f18991b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18992c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18993d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f18994e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f18995f;
    private final CharSequence[] mChoices;

    public static class a {
        public static RemoteInput a(x xVar) {
            Set d10;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(xVar.i()).setLabel(xVar.h()).setChoices(xVar.e()).setAllowFreeFormInput(xVar.c()).addExtras(xVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (d10 = xVar.d()) != null) {
                Iterator it = d10.iterator();
                while (it.hasNext()) {
                    b.a(addExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(addExtras, xVar.f());
            }
            return addExtras.build();
        }
    }

    public static class b {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    public static class c {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f18996a;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f18999d;
        private CharSequence[] mChoices;

        /* renamed from: b, reason: collision with root package name */
        public final Set f18997b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f18998c = new Bundle();

        /* renamed from: e, reason: collision with root package name */
        public boolean f19000e = true;

        /* renamed from: f, reason: collision with root package name */
        public int f19001f = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f18996a = str;
        }

        public x a() {
            return new x(this.f18996a, this.f18999d, this.mChoices, this.f19000e, this.f19001f, this.f18998c, this.f18997b);
        }

        public d b(CharSequence charSequence) {
            this.f18999d = charSequence;
            return this;
        }
    }

    public x(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f18990a = str;
        this.f18991b = charSequence;
        this.mChoices = charSequenceArr;
        this.f18992c = z10;
        this.f18993d = i10;
        this.f18994e = bundle;
        this.f18995f = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(x xVar) {
        return a.a(xVar);
    }

    public static RemoteInput[] b(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            remoteInputArr[i10] = a(xVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f18992c;
    }

    public Set d() {
        return this.f18995f;
    }

    public CharSequence[] e() {
        return this.mChoices;
    }

    public int f() {
        return this.f18993d;
    }

    public Bundle g() {
        return this.f18994e;
    }

    public CharSequence h() {
        return this.f18991b;
    }

    public String i() {
        return this.f18990a;
    }

    public boolean j() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}

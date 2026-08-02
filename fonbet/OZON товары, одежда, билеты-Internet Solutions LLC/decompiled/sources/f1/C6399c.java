package f1;

import android.view.ViewStructure;
import org.jetbrains.annotations.NotNull;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6399c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C6399c f62430a = new C6399c();

    public final int a(@NotNull ViewStructure viewStructure, int i11) {
        return viewStructure.addChildCount(i11);
    }

    public final ViewStructure b(@NotNull ViewStructure viewStructure, int i11) {
        return viewStructure.newChild(i11);
    }

    public final void c(@NotNull ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
        viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
    }

    public final void d(@NotNull ViewStructure viewStructure, int i11, String str, String str2, String str3) {
        viewStructure.setId(i11, str, str2, str3);
    }
}

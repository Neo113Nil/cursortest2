package s1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import androidx.core.content.res.d;
import androidx.core.content.res.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import r1.h;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9580a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final XmlResourceParser f98118a;

    /* renamed from: b, reason: collision with root package name */
    private int f98119b = 0;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f98120c = new h();

    public C9580a(XmlResourceParser xmlResourceParser) {
        this.f98118a = xmlResourceParser;
    }

    private final void l(int i11) {
        this.f98119b = i11 | this.f98119b;
    }

    public final float a(@NotNull TypedArray typedArray, int i11) {
        float dimension = typedArray.getDimension(i11, 0.0f);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(@NotNull TypedArray typedArray, int i11) {
        float f7 = typedArray.getFloat(i11, 0.0f);
        l(typedArray.getChangingConfigurations());
        return f7;
    }

    public final int c(@NotNull TypedArray typedArray) {
        int i11 = typedArray.getInt(6, -1);
        l(typedArray.getChangingConfigurations());
        return i11;
    }

    public final boolean d(@NotNull TypedArray typedArray) {
        boolean z11 = k.d(this.f98118a, "autoMirrored") ? typedArray.getBoolean(5, false) : false;
        l(typedArray.getChangingConfigurations());
        return z11;
    }

    public final ColorStateList e(@NotNull TypedArray typedArray, Resources.Theme theme) {
        ColorStateList b11 = k.b(typedArray, this.f98118a, theme);
        l(typedArray.getChangingConfigurations());
        return b11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9580a)) {
            return false;
        }
        C9580a c9580a = (C9580a) obj;
        return Intrinsics.d(this.f98118a, c9580a.f98118a) && this.f98119b == c9580a.f98119b;
    }

    @NotNull
    public final d f(@NotNull TypedArray typedArray, Resources.Theme theme, @NotNull String str, int i11) {
        d c11 = k.c(typedArray, this.f98118a, theme, str, i11);
        l(typedArray.getChangingConfigurations());
        return c11;
    }

    public final float g(@NotNull TypedArray typedArray, @NotNull String str, int i11, float f7) {
        if (k.d(this.f98118a, str)) {
            f7 = typedArray.getFloat(i11, f7);
        }
        l(typedArray.getChangingConfigurations());
        return f7;
    }

    public final int h(@NotNull TypedArray typedArray, @NotNull String str, int i11, int i12) {
        if (k.d(this.f98118a, str)) {
            i12 = typedArray.getInt(i11, i12);
        }
        l(typedArray.getChangingConfigurations());
        return i12;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98119b) + (this.f98118a.hashCode() * 31);
    }

    public final String i(@NotNull TypedArray typedArray, int i11) {
        String string = typedArray.getString(i11);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    @NotNull
    public final XmlPullParser j() {
        return this.f98118a;
    }

    @NotNull
    public final TypedArray k(@NotNull Resources resources, Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull int[] iArr) {
        TypedArray e11 = k.e(resources, theme, attributeSet, iArr);
        l(e11.getChangingConfigurations());
        return e11;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f98118a);
        sb2.append(", config=");
        return Ek.a.d(sb2, this.f98119b, ')');
    }
}

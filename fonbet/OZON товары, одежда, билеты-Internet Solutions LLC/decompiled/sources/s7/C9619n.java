package s7;

import B0.A0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b0;
import i7.C7017a;
import ru.ozon.app.android.R;

/* renamed from: s7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9619n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f98341a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f98342b = {R.attr.colorPrimaryVariant};

    private static void a(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65934R, i11, i12);
        boolean z11 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z11) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                d(context, f98342b, "Theme.MaterialComponents");
            }
        }
        d(context, f98341a, "Theme.AppCompat");
    }

    public static void b(@NonNull Context context) {
        d(context, f98342b, "Theme.MaterialComponents");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i11, int i12, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65934R, i11, i12);
        boolean z11 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
            for (int i13 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i13, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z11 = true;
            obtainStyledAttributes.recycle();
            if (!z11) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    private static void d(@NonNull Context context, @NonNull int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!obtainStyledAttributes.hasValue(i11)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(A0.b("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    @NonNull
    public static TypedArray e(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i11, int i12, int... iArr2) {
        a(context, attributeSet, i11, i12);
        c(context, attributeSet, iArr, i11, i12, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
    }

    public static b0 f(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i11, int i12, int... iArr2) {
        a(context, attributeSet, i11, i12);
        c(context, attributeSet, iArr, i11, i12, iArr2);
        return b0.v(context, attributeSet, iArr, i11, i12);
    }
}

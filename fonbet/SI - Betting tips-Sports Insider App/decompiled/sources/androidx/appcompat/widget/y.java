package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1004a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1005b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1006c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1007d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1008e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1009f;

    /* renamed from: g, reason: collision with root package name */
    public Enum f1010g;

    public y(boolean z5, boolean z7, String prettyPrintIndent, String classDiscriminator, boolean z10, tg.a classDiscriminatorMode) {
        this.f1004a = 1;
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f1005b = z5;
        this.f1006c = z7;
        this.f1008e = prettyPrintIndent;
        this.f1009f = classDiscriminator;
        this.f1007d = z10;
        this.f1010g = classDiscriminatorMode;
    }

    public void a() {
        x xVar = (x) this.f1008e;
        Drawable checkMarkDrawable = xVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1005b || this.f1006c) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1005b) {
                    mutate.setTintList((ColorStateList) this.f1009f);
                }
                if (this.f1006c) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1010g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(xVar.getDrawableState());
                }
                xVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public String toString() {
        switch (this.f1004a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f1005b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f1006c + ", prettyPrintIndent='" + ((String) this.f1008e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f1009f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f1007d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((tg.a) this.f1010g) + ')';
            default:
                return super.toString();
        }
    }

    public y(x xVar) {
        this.f1004a = 0;
        this.f1009f = null;
        this.f1010g = null;
        this.f1005b = false;
        this.f1006c = false;
        this.f1008e = xVar;
    }
}

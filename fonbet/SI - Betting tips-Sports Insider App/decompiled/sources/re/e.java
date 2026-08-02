package re;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ve.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22474c;

    public /* synthetic */ e(g gVar, String str, int i5) {
        this.f22472a = i5;
        this.f22473b = gVar;
        this.f22474c = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v5, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int widthHomeFlagSize;
        int widthGuestFlagSize;
        switch (this.f22472a) {
            case 0:
                Intrinsics.checkNotNullParameter(v5, "v");
                u uVar = v5 instanceof u ? (u) v5 : null;
                if (uVar != null) {
                    int widthSize = uVar.getWidthSize();
                    int heightSize = uVar.getHeightSize();
                    if (widthSize > 0 && heightSize > 0) {
                        v5.removeOnLayoutChangeListener(this);
                        Context context = ((u) v5).getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        this.f22473b.c(context, this.f22474c, widthSize, heightSize);
                        break;
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v5, "v");
                u uVar2 = v5 instanceof u ? (u) v5 : null;
                if (uVar2 != null && (widthHomeFlagSize = uVar2.getWidthHomeFlagSize()) > 0) {
                    v5.removeOnLayoutChangeListener(this);
                    Context context2 = ((u) v5).getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    this.f22473b.e(context2, widthHomeFlagSize, this.f22474c);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(v5, "v");
                u uVar3 = v5 instanceof u ? (u) v5 : null;
                if (uVar3 != null && (widthGuestFlagSize = uVar3.getWidthGuestFlagSize()) > 0) {
                    v5.removeOnLayoutChangeListener(this);
                    Context context3 = ((u) v5).getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    this.f22473b.d(context3, widthGuestFlagSize, this.f22474c);
                    break;
                }
                break;
        }
    }
}

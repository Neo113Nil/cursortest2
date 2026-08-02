package hd;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.sports.insider.MyApp;
import eg.c0;
import eg.y;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10529a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10530b;

    public /* synthetic */ f(int i5, Object obj) {
        this.f10529a = i5;
        this.f10530b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View textView) {
        switch (this.f10529a) {
            case 0:
                Intrinsics.checkNotNullParameter(textView, "textView");
                ((l1.a) this.f10530b).y(textView.getContext(), false);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(textView, "widget");
                sd.b bVar = (sd.b) this.f10530b;
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                c0.t(MyApp.f6830c, new y("MessageDialog"), null, new me.y(context, bVar, null, 23), 2);
                break;
            default:
                Intrinsics.checkNotNullParameter(textView, "textView");
                String str = (String) this.f10530b;
                WeakReference weakReference = new WeakReference(textView.getContext());
                if (str != null) {
                    zc.e.e(str, weakReference, null);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f10529a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(-1);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(-7829368);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(Color.parseColor("#2A377C"));
                break;
        }
    }

    public f(String str) {
        this.f10529a = 2;
        this.f10530b = str;
    }
}

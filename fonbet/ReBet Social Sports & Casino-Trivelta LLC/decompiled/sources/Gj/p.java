package Gj;

import Dj.a;
import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes5.dex */
public final class p extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4244a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f4245a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f4246b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f4247c;

        public b(View root, TextView name, ImageView icon) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f4245a = root;
            this.f4246b = name;
            this.f4247c = icon;
        }

        public final ImageView a() {
            return this.f4247c;
        }

        public final TextView b() {
            return this.f4246b;
        }

        public final View c() {
            return this.f4245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, List items) {
        super(context, Dj.l.f2868b, items);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
    }

    public final int a(Dj.a aVar) {
        if (!aVar.b()) {
            return AbstractC5338c.getColor(getContext(), R.color.transparent);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Xj.c.k(context, R.attr.colorControlHighlight);
    }

    public final int b(Dj.a aVar) {
        if (aVar instanceof a.c) {
            return Dj.j.f2842e;
        }
        if (aVar instanceof a.b) {
            return Dj.j.f2841d;
        }
        if (aVar instanceof a.C0059a) {
            return Dj.j.f2838a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String c(Dj.a aVar) {
        String c10;
        if (aVar instanceof a.c) {
            c10 = getContext().getString(Dj.m.f2877b);
        } else if (aVar instanceof a.b) {
            c10 = getContext().getString(Dj.m.f2876a);
        } else {
            if (!(aVar instanceof a.C0059a)) {
                throw new NoWhenBranchMatchedException();
            }
            c10 = ((a.C0059a) aVar).c();
            if (c10 == null) {
                c10 = getContext().getString(Dj.m.f2890o);
                Intrinsics.checkNotNullExpressionValue(c10, "getString(...)");
            }
        }
        Intrinsics.checkNotNull(c10);
        return c10;
    }

    public final void d(ImageView imageView, boolean z10) {
        imageView.setAlpha(z10 ? 1.0f : 0.54f);
    }

    public final void e(b bVar, Dj.a aVar) {
        bVar.b().setText(c(aVar));
        bVar.a().setImageResource(b(aVar));
        d(bVar.a(), aVar.b());
        bVar.c().setBackgroundColor(a(aVar));
    }

    public final b f(View view, ViewGroup viewGroup) {
        if (view != null) {
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type zendesk.talk.android.internal.call.audio.AudioOutputDeviceAdapter.ViewHolder");
            return (b) tag;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(Dj.l.f2868b, viewGroup, false);
        Intrinsics.checkNotNull(inflate);
        View findViewById = inflate.findViewById(Dj.k.f2850b);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = inflate.findViewById(Dj.k.f2849a);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        b bVar = new b(inflate, (TextView) findViewById, (ImageView) findViewById2);
        inflate.setTag(bVar);
        return bVar;
    }

    public final void g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        clear();
        addAll(items);
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        b f10 = f(view, parent);
        Object item = getItem(i10);
        Intrinsics.checkNotNull(item);
        e(f10, (Dj.a) item);
        return f10.c();
    }
}

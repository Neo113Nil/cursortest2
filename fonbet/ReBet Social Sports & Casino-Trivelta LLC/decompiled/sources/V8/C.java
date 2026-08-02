package V8;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes2.dex */
public final class C extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public List f12581a;

    /* renamed from: b, reason: collision with root package name */
    public final S8.e f12582b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f12583c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f12584d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f12585e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f12586f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f12587g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f12588h;

    public final class a extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextView f12589a;

        /* renamed from: b, reason: collision with root package name */
        public ImageView f12590b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f12591c;

        /* renamed from: d, reason: collision with root package name */
        public GradientDrawable f12592d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C f12593e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C c10, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f12593e = c10;
            View findViewById = view.findViewById(O8.s.f8442B0);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.suggestionText)");
            this.f12589a = (TextView) findViewById;
            View findViewById2 = view.findViewById(O8.s.f8529z0);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.suggestionLeftImage)");
            this.f12590b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(O8.s.f8440A0);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.suggestionRightImage)");
            this.f12591c = (ImageView) findViewById3;
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f12592d = gradientDrawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            this.f12592d.setCornerRadii(new float[]{60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f});
            this.itemView.setBackground(this.f12592d);
        }

        public final void b() {
            this.f12590b.setVisibility(8);
            this.f12591c.setVisibility(8);
            this.f12590b.setPadding(0, 0, 0, 0);
            this.f12589a.setPadding(0, 0, 0, 0);
            this.f12591c.setPadding(0, 0, 0, 0);
        }

        public final ImageView c() {
            return this.f12590b;
        }

        public final GradientDrawable d() {
            return this.f12592d;
        }

        public final ImageView e() {
            return this.f12591c;
        }

        public final TextView g() {
            return this.f12589a;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[O8.f.values().length];
            try {
                iArr[O8.f.Trending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O8.f.Recents.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O8.f.Channels.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O8.f.Text.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C(List suggestions, S8.e theme, Function1 listener) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12581a = suggestions;
        this.f12582b = theme;
        this.f12583c = listener;
    }

    public static final void e(C this$0, O8.g item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.f12583c.invoke(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final O8.g gVar = (O8.g) this.f12581a.get(i10);
        holder.g().setText(gVar.a());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: V8.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C.e(C.this, gVar, view);
            }
        });
        holder.d().setColors(ArraysKt.toIntArray(new Integer[]{Integer.valueOf(this.f12582b.s()), Integer.valueOf(this.f12582b.s())}));
        holder.g().setTextColor(this.f12582b.t());
        int i11 = b.$EnumSwitchMapping$0[gVar.b().ordinal()];
        if (i11 == 1) {
            holder.c().setVisibility(0);
            holder.c().setImageDrawable(this.f12586f);
            holder.c().getLayoutParams().height = U8.f.a(12);
            holder.c().setPadding(U8.f.a(4), 0, 0, 0);
            holder.g().setPadding(0, U8.f.a(4), U8.f.a(18), U8.f.a(6));
            return;
        }
        if (i11 == 2) {
            holder.c().setVisibility(0);
            ImageView c10 = holder.c();
            S8.e eVar = this.f12582b;
            c10.setImageDrawable(((eVar instanceof S8.d) || (eVar instanceof S8.b)) ? this.f12585e : this.f12584d);
            holder.c().getLayoutParams().height = U8.f.a(15);
            holder.c().setPadding(U8.f.a(4), 0, 0, 0);
            holder.g().setPadding(0, U8.f.a(4), U8.f.a(12), U8.f.a(6));
            return;
        }
        if (i11 == 3) {
            holder.e().setImageDrawable(this.f12587g);
            holder.e().setVisibility(0);
            holder.g().setPadding(U8.f.a(12), U8.f.a(3), 0, U8.f.a(7));
            holder.e().getLayoutParams().height = U8.f.a(18);
            holder.e().setPadding(0, 0, 0, 0);
            return;
        }
        if (i11 != 4) {
            return;
        }
        holder.d().setColors(ArraysKt.toIntArray(new Integer[]{Integer.valueOf(Color.parseColor("#FF6666")), Integer.valueOf(Color.parseColor("#9933FF"))}));
        holder.c().setVisibility(0);
        holder.c().setImageDrawable(this.f12588h);
        holder.c().getLayoutParams().height = U8.f.a(16);
        holder.c().setPadding(U8.f.a(4), 0, 0, 0);
        holder.g().setPadding(0, U8.f.a(4), U8.f.a(18), U8.f.a(6));
        holder.g().setTextColor(-1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12584d = AbstractC5338c.getDrawable(parent.getContext(), O8.r.f8427o);
        this.f12585e = AbstractC5338c.getDrawable(parent.getContext(), O8.r.f8425m);
        this.f12586f = AbstractC5338c.getDrawable(parent.getContext(), O8.r.f8433u);
        this.f12587g = AbstractC5338c.getDrawable(parent.getContext(), O8.r.f8434v);
        this.f12588h = AbstractC5338c.getDrawable(parent.getContext(), O8.r.f8432t);
        View itemView = LayoutInflater.from(parent.getContext()).inflate(O8.t.f8540k, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return new a(this, itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(a holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.b();
        super.onViewRecycled(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f12581a.size();
    }

    public final void h(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f12581a = list;
    }
}

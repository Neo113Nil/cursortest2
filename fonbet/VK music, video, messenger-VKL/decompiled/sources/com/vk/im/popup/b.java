package com.vk.im.popup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.utils.ItemType;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.popup.Popup;
import com.vk.im.popup.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.apj0;
import xsna.b3a0;
import xsna.brj0;
import xsna.c220;
import xsna.c5g;
import xsna.cpj0;
import xsna.d410;
import xsna.d5;
import xsna.dko;
import xsna.drm0;
import xsna.dw20;
import xsna.dzb0;
import xsna.e3m;
import xsna.e43;
import xsna.eko;
import xsna.epx;
import xsna.ezb0;
import xsna.f4h;
import xsna.fzb0;
import xsna.g0t;
import xsna.g880;
import xsna.gjw;
import xsna.gzb0;
import xsna.gzs;
import xsna.h7u0;
import xsna.hz20;
import xsna.iah0;
import xsna.iid;
import xsna.izs;
import xsna.j5g;
import xsna.jjc;
import xsna.k1u0;
import xsna.ka60;
import xsna.krv0;
import xsna.ku70;
import xsna.lwb0;
import xsna.m1y;
import xsna.m33;
import xsna.ner0;
import xsna.oq;
import xsna.p6a;
import xsna.qda0;
import xsna.s3q0;
import xsna.sh3;
import xsna.sy50;
import xsna.tlo0;
import xsna.u210;
import xsna.u56;
import xsna.uv80;
import xsna.uz;
import xsna.v01;
import xsna.vc00;
import xsna.wg4;
import xsna.x7g;
import xsna.xyb0;
import xsna.xzs;
import xsna.yq1;
import xsna.yu1;

/* compiled from: PopupVcImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.vk.im.popup.a {
    public static final Object d = new Object();
    public final Context a;
    public final iid b = new iid(2);
    public final C1130b c = new C1130b();

    /* compiled from: PopupVcImpl.kt */
    public static final class a extends BaseAdapter {
        public final Context b;
        public final ArrayList c;
        public final LayoutInflater d;

        public a(Context context, ArrayList arrayList) {
            this.b = context;
            this.c = arrayList;
            this.d = e3m.b(context);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.c.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return (lwb0) this.c.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = 0;
            if (view == null) {
                view = this.d.inflate(R.layout.vkim_popup_actions_item, viewGroup, false);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.icon);
            TextView textView = (TextView) view.findViewById(R.id.label);
            lwb0 lwb0Var = (lwb0) this.c.get(i);
            Drawable drawable = lwb0Var.c;
            CharSequence charSequence = lwb0Var.a;
            int i3 = lwb0Var.e;
            if (drawable != null) {
                appCompatImageView.setImageDrawable(drawable);
            } else if (i3 != 0) {
                appCompatImageView.setImageResource(i3);
            } else {
                appCompatImageView.setImageDrawable(null);
            }
            if (drm0.N(charSequence)) {
                int i4 = lwb0Var.b;
                if (i4 != 0) {
                    textView.setText(i4);
                } else {
                    textView.setText("");
                }
            } else {
                textView.setText(charSequence);
            }
            boolean z = lwb0Var.g;
            Context context = this.b;
            if (z) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_negative, context)));
            } else {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent, context)));
            }
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
            if (lwb0Var.c == null && i3 == 0) {
                i2 = 8;
            }
            appCompatImageView.setVisibility(i2);
            return view;
        }
    }

    /* compiled from: PopupVcImpl.kt */
    /* renamed from: com.vk.im.popup.b$b, reason: collision with other inner class name */
    public static final class C1130b {
        public androidx.appcompat.app.d a;
        public ner0 b;
        public com.vk.core.view.components.spinner.c c;
        public dw20 d;
        public VkContextMenu e;

        public final void a() {
            androidx.appcompat.app.d dVar = this.a;
            if (dVar != null) {
                dVar.dismiss();
            }
            ner0 ner0Var = this.b;
            if (ner0Var != null) {
                ner0Var.dismiss();
            }
            com.vk.core.view.components.spinner.c cVar = this.c;
            if (cVar != null) {
                cVar.dismiss();
            }
            dw20 dw20Var = this.d;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
            VkContextMenu vkContextMenu = this.e;
            if (vkContextMenu != null) {
                vkContextMenu.b();
            }
            b();
        }

        public final void b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    /* compiled from: PopupVcImpl.kt */
    public static final class c extends RecyclerView.Adapter<a> {
        public ArrayList c;
        public final yu1 d;

        /* compiled from: PopupVcImpl.kt */
        public static abstract class a extends RecyclerView.e0 {

            /* compiled from: PopupVcImpl.kt */
            /* renamed from: com.vk.im.popup.b$c$a$a, reason: collision with other inner class name */
            public static final class C1131a extends a {
                public final VkCell l;
                public brj0 m;
                public izs<? super brj0, s3q0> n;

                public C1131a(VkCell vkCell) {
                    super(vkCell);
                    this.l = vkCell;
                    vkCell.setOnClickListener(new v01(this, 7));
                }

                @Override // com.vk.im.popup.b.c.a
                public final void V5(brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
                    this.m = brj0Var;
                    this.n = izsVar;
                    VkCell vkCell = this.l;
                    Context context = vkCell.getContext();
                    int i = brj0Var.d;
                    String string = i != 0 ? context.getString(i) : brj0Var.e.toString();
                    int i2 = brj0Var.g ? R.attr.vk_ui_background_negative : R.attr.vk_ui_icon_accent;
                    Drawable drawable = brj0Var.c;
                    VkCell.Right.d dVar = null;
                    if (drawable == null) {
                        int i3 = brj0Var.b;
                        drawable = i3 != 0 ? krv0.e(i3, context) : null;
                    }
                    vkCell.setLeft(drawable != null ? VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(new eko(drawable), VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(i2)), 8)) : null);
                    vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, string), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
                    if (brj0Var.i == ItemType.DEFAULT_WITH_CHECK) {
                        Integer num = brj0Var.n;
                        Integer num2 = num != null ? num : null;
                        int intValue = num2 != null ? num2.intValue() : krv0.m(R.attr.vk_ui_icon_accent, context);
                        Drawable mutate = context.getDrawable(R.drawable.vk_icon_check_circle_on_24).mutate();
                        mutate.setTint(intValue);
                        dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new eko(mutate), (k1u0) k1u0.c.a, (Size) null, (tlo0) null, false, (gzs) null, 60), null, null, 29);
                    }
                    vkCell.setRight(dVar);
                    vkCell.setContentDescription(string);
                    vkCell.setEnabled(brj0Var.h);
                }
            }

            /* compiled from: PopupVcImpl.kt */
            /* renamed from: com.vk.im.popup.b$c$a$b, reason: collision with other inner class name */
            public static final class C1132b extends a {
                public final FrameLayout l;

                public C1132b(FrameLayout frameLayout) {
                    super(frameLayout);
                    this.l = frameLayout;
                }

                @Override // com.vk.im.popup.b.c.a
                public final void V5(brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
                    cpj0 cpj0Var = brj0Var.m;
                    if (cpj0Var != null) {
                        cpj0Var.a(this.l, brj0Var, izsVar);
                    }
                }
            }

            /* compiled from: PopupVcImpl.kt */
            /* renamed from: com.vk.im.popup.b$c$a$c, reason: collision with other inner class name */
            public static final class C1133c extends a {
                public final VkTopBar l;

                public C1133c(VkTopBar vkTopBar) {
                    super(vkTopBar);
                    this.l = vkTopBar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.vk.im.popup.b.c.a
                public final void V5(brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
                    int i = brj0Var.d;
                    VkTopBar vkTopBar = this.l;
                    String string = i != 0 ? vkTopBar.getContext().getString(i) : brj0Var.e.toString();
                    vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, string), null, null, VkTopBar.Middle.Text.Title.Size.Small, null, 22), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
                }
            }

            public abstract void V5(brj0 brj0Var, izs<? super brj0, s3q0> izsVar);
        }

        public c(ArrayList arrayList, yu1 yu1Var) {
            this.c = arrayList;
            this.d = yu1Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return ((brj0) this.c.get(i)).i.h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            aVar.V5((brj0) this.c.get(i), this.d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            if (i == ItemType.CUSTOM.h()) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                frameLayout.setMinimumHeight(iah0.a(48));
                return new a.C1132b(frameLayout);
            }
            int i2 = 0;
            int i3 = 6;
            AttributeSet attributeSet = null;
            if (i == ItemType.TITLE.h()) {
                VkTopBar vkTopBar = new VkTopBar(context, attributeSet, i3, i2);
                vkTopBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new a.C1133c(vkTopBar);
            }
            VkCell vkCell = new VkCell(context, attributeSet, i3, i2);
            vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new a.C1131a(vkCell);
        }
    }

    /* compiled from: PopupVcImpl.kt */
    public static final class d implements hz20, g0t {
        public final /* synthetic */ d410 b;

        public d(d410 d410Var) {
            this.b = d410Var;
        }

        @Override // xsna.hz20
        public final /* synthetic */ void a(int i) {
            this.b.invoke(Integer.valueOf(i));
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof hz20) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public b(Context context) {
        this.a = context;
    }

    public static void h(b bVar, Popup.a aVar, izs izsVar, gzs gzsVar, gzs gzsVar2, int i) {
        String string;
        boolean z = (i & 16) == 0;
        Context context = bVar.a;
        Iterable iterable = aVar.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (j5g.P(aVar.i, ((lwb0) obj).f)) {
                arrayList.add(obj);
            }
        }
        VkContextMenu.c cVar = (VkContextMenu.c) gzsVar2.invoke();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lwb0 lwb0Var = (lwb0) it.next();
            if (lwb0Var.a.length() > 0) {
                string = lwb0Var.a;
            } else {
                int i2 = lwb0Var.b;
                string = i2 != 0 ? context.getString(i2) : "";
            }
            String obj2 = string.toString();
            Drawable drawable = lwb0Var.c;
            if (drawable == null) {
                int i3 = lwb0Var.e;
                if (i3 != 0) {
                    e3m.a aVar2 = e3m.a;
                    drawable = m33.a(i3, context);
                } else {
                    drawable = null;
                }
            }
            VkContextMenu.c.d(cVar, obj2, drawable, false, new d5(20, izsVar, lwb0Var), 24);
        }
        cVar.m = 0;
        VkContextMenu a2 = cVar.a();
        a2.e(gzsVar);
        C1130b c1130b = bVar.c;
        c1130b.a();
        c1130b.e = a2;
        if (z) {
            a2.j(false);
        } else {
            a2.h(false);
        }
    }

    @Override // com.vk.im.popup.a
    public final void a(Popup.e eVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3) {
        String str = eVar.h;
        int i = eVar.g;
        CharSequence charSequence = eVar.f;
        int i2 = eVar.e;
        String str2 = eVar.d;
        int i3 = eVar.c;
        String str3 = eVar.b;
        int i4 = eVar.a;
        Popup.g gVar = eVar.i;
        boolean f = epx.f(gVar, Popup.g.c.a);
        Context context = this.a;
        C1130b c1130b = this.c;
        if (!f) {
            if (!epx.f(gVar, Popup.g.b.a)) {
                throw new IllegalArgumentException();
            }
            dw20.b N = new dw20.b(context, null).N(null);
            if (str3.length() <= 0) {
                str3 = i4 != 0 ? context.getString(i4) : "";
            }
            dw20.b w0 = N.w0(str3);
            if (str2.length() <= 0) {
                str2 = i3 != 0 ? context.getString(i3) : "";
            }
            dw20.a R = dw20.a.R(w0, str2, 0, 0, 6);
            if (i2 != 0) {
                ((dw20.b) R).h0(i2, gzsVar == null ? new uz(25) : gzsVar);
            }
            if (i != 0) {
                ((dw20.b) R).T(i, gzsVar2 == null ? new ku70(6) : gzsVar2);
            }
            if (charSequence.length() > 0) {
                ((dw20.b) R).j0(charSequence, new sy50(gzsVar, 10));
            }
            if (str.length() > 0) {
                ((dw20.b) R).j0(str, new gzb0(0, gzsVar2));
            }
            dw20.b X = ((dw20.b) R).X(gzsVar3 == null ? new uv80(2) : gzsVar3);
            c1130b.a();
            c1130b.d = X.I0("CurrentBottomSheet");
            return;
        }
        g880 g880Var = new g880(this, 6);
        if (i4 != 0) {
            str3 = context.getString(i4);
        }
        if (i3 != 0) {
            str2 = context.getString(i3);
        }
        if (i2 != 0) {
            charSequence = context.getString(i2);
        }
        if (i != 0) {
            str = context.getString(i);
        }
        h7u0.a aVar = new h7u0.a(context);
        aVar.h0(str3);
        int length = str2.length();
        AlertController.b bVar = aVar.a;
        if (length > 0) {
            bVar.f = str2;
        }
        aVar.c = true;
        aVar.d0(charSequence, new f4h(gzsVar, 1));
        aVar.X(str, new ka60(gzsVar2, 1));
        aVar.a0(new b3a0(g880Var, 1));
        bVar.n = new u56(1, gzsVar3);
        c1130b.a();
        c1130b.a = aVar.m();
    }

    @Override // com.vk.im.popup.a
    public final void b(Popup.c cVar, gzs<s3q0> gzsVar) {
        boolean z = cVar.d;
        Object obj = d;
        iid iidVar = this.b;
        if (z) {
            ((Handler) iidVar.b).postAtTime(new dzb0(this, cVar, gzsVar, 0), obj, SystemClock.uptimeMillis() + 250);
        } else {
            ((Handler) iidVar.b).postAtTime(new fzb0(this, cVar, gzsVar, 0), obj, SystemClock.uptimeMillis() + 250);
        }
    }

    @Override // com.vk.im.popup.a
    public final <T> void c(Popup.a<T> aVar, izs<? super T, s3q0> izsVar, gzs<s3q0> gzsVar) {
        Popup.g gVar = aVar.j;
        if (!(gVar instanceof Popup.g.c)) {
            if (!epx.f(gVar, Popup.g.b.a)) {
                if (!(gVar instanceof Popup.g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h(this, aVar, izsVar, gzsVar, new m1y(aVar, 27), 56);
                return;
            } else if (aVar.k) {
                j(aVar, izsVar, gzsVar, new c220(3));
                return;
            } else {
                i(aVar, izsVar, gzsVar, new c220(3));
                return;
            }
        }
        List<lwb0<T>> list = aVar.h;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (j5g.P(aVar.i, ((lwb0) t).f)) {
                arrayList.add(t);
            }
        }
        Context context = this.a;
        h7u0.a aVar2 = new h7u0.a(context);
        aVar2.R(new a(context, arrayList), new qda0(izsVar, arrayList, 1));
        int i = aVar.b;
        aVar2.h0(i != 0 ? context.getString(i) : aVar.a.toString());
        aVar2.a0(new ezb0(gzsVar, 0));
        aVar2.c = true;
        C1130b c1130b = this.c;
        c1130b.a();
        c1130b.a = aVar2.m();
    }

    @Override // com.vk.im.popup.a
    public final void dismiss() {
        this.c.a();
        ((Handler) this.b.b).removeCallbacksAndMessages(d);
    }

    @Override // com.vk.im.popup.a
    public final void e(Popup.f fVar, izs izsVar) {
        if (!epx.f(fVar.i, Popup.g.c.a)) {
            throw new IllegalArgumentException();
        }
        Iterable iterable = fVar.j;
        final ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (j5g.P(fVar.k, ((lwb0) obj).f)) {
                arrayList.add(obj);
            }
        }
        int i = fVar.a;
        CharSequence charSequence = fVar.b;
        int i2 = fVar.c;
        CharSequence charSequence2 = fVar.d;
        int i3 = fVar.e;
        CharSequence charSequence3 = fVar.f;
        int i4 = fVar.g;
        String str = fVar.h;
        final u210 u210Var = new u210(this, 12);
        Context context = this.a;
        if (i != 0) {
            charSequence = context.getString(i);
        }
        CharSequence charSequence4 = charSequence;
        if (i2 != 0) {
            charSequence2 = context.getString(i2);
        }
        if (i3 != 0) {
            charSequence3 = context.getString(i3);
        }
        if (i4 != 0) {
            str = context.getString(i4);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lwb0 lwb0Var = (lwb0) it.next();
            int i5 = lwb0Var.b;
            arrayList2.add(i5 == 0 ? lwb0Var.a : context.getText(i5));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.vkim_popup_list_multichoice_item, android.R.id.text1, arrayList2);
        View inflate = e3m.b(context).inflate(R.layout.vkim_popup_msg_with_list, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_msg);
        if (charSequence2.length() > 0) {
            textView.setVisibility(0);
            textView.setText(charSequence2);
        } else {
            textView.setVisibility(8);
        }
        final ListView listView = (ListView) inflate.findViewById(R.id.lv_items);
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView.setChoiceMode(2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.btn_negative);
        textView2.setText(str);
        jjc.g(textView2, new vc00(ref$ObjectRef, 1));
        TextView textView3 = (TextView) inflate.findViewById(R.id.btn_positive);
        textView3.setText(charSequence3);
        jjc.g(textView3, new p6a(ref$ObjectRef, arrayList, izsVar, listView, 2));
        h7u0.a aVar = new h7u0.a(context);
        aVar.b0(new DialogInterface.OnShowListener() { // from class: xsna.uyb0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Ref$ObjectRef.this.element = dialogInterface;
                int i6 = 0;
                for (Object obj2 : arrayList) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((lwb0) obj2).j) {
                        listView.setItemChecked(i6, true);
                    }
                    i6 = i7;
                }
            }
        });
        aVar.h0(charSequence4);
        aVar.f = inflate;
        aVar.c = true;
        aVar.a0(new DialogInterface.OnDismissListener() { // from class: xsna.vyb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                u210.this.invoke();
            }
        });
        aVar.a.n = new xyb0();
        C1130b c1130b = this.c;
        c1130b.a();
        c1130b.a = aVar.m();
    }

    @Override // com.vk.im.popup.a
    public final void f(Popup.a aVar, View view, Rect rect, izs izsVar) {
        h(this, aVar, izsVar, null, new yq1(16, view, rect), 32);
    }

    @Override // com.vk.im.popup.a
    public final a.b g(Popup.a aVar, izs izsVar, izs izsVar2) {
        if (epx.f(aVar.j, Popup.g.b.a)) {
            return aVar.k ? j(aVar, izsVar, null, izsVar2) : i(aVar, izsVar, null, izsVar2);
        }
        throw new IllegalArgumentException("Not implemented. Only the root of bottom sheet popup can be modified currently");
    }

    public final com.vk.im.popup.c i(Popup.a aVar, izs izsVar, gzs gzsVar, izs izsVar2) {
        Iterable iterable = aVar.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            lwb0 lwb0Var = (lwb0) obj;
            if (lwb0Var.k || j5g.P(aVar.i, lwb0Var.f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            lwb0 lwb0Var2 = (lwb0) next;
            int i3 = lwb0Var2.e;
            Drawable drawable = lwb0Var2.c;
            int i4 = lwb0Var2.b;
            CharSequence charSequence = lwb0Var2.a;
            boolean z = lwb0Var2.g;
            Integer num = lwb0Var2.d;
            cpj0 cpj0Var = lwb0Var2.h;
            arrayList2.add(new brj0(i, i3, drawable, i4, charSequence, z, false, cpj0Var != null ? ItemType.CUSTOM : lwb0Var2.k ? ItemType.TITLE : lwb0Var2.j ? ItemType.DEFAULT_WITH_CHECK : ItemType.DEFAULT, 0, num, null, cpj0Var, null, lwb0Var2, 55936));
            i = i2;
        }
        c cVar = new c(arrayList2, new yu1(21, this, izsVar));
        com.vk.im.popup.c cVar2 = new com.vk.im.popup.c(cVar);
        dw20.b v = new dw20.b(this.a, null).i(cVar, true, true).a0(new gjw(1, gzsVar)).v(aVar.f);
        v.getClass();
        v.d.k1 = izsVar2;
        C1130b c1130b = this.c;
        c1130b.a();
        c1130b.d = v.I0("CurrentBottomSheet");
        return cVar2;
    }

    public final com.vk.im.popup.d j(Popup.a aVar, izs izsVar, gzs gzsVar, izs izsVar2) {
        Iterable iterable = aVar.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            lwb0 lwb0Var = (lwb0) obj;
            if (lwb0Var.k || j5g.P(aVar.i, lwb0Var.f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            lwb0 lwb0Var2 = (lwb0) next;
            int i3 = lwb0Var2.e;
            Drawable drawable = lwb0Var2.c;
            int i4 = lwb0Var2.b;
            CharSequence charSequence = lwb0Var2.a;
            boolean z = lwb0Var2.g;
            Integer num = lwb0Var2.d;
            cpj0 cpj0Var = lwb0Var2.h;
            arrayList2.add(new brj0(i, i3, drawable, i4, charSequence, z, false, cpj0Var != null ? ItemType.CUSTOM : lwb0Var2.k ? ItemType.TITLE : lwb0Var2.j ? ItemType.DEFAULT_WITH_CHECK : ItemType.DEFAULT, 0, num, null, cpj0Var, null, lwb0Var2, 55936));
            i = i2;
        }
        apj0 apj0Var = new apj0(arrayList2, new sh3(26, this, izsVar));
        com.vk.im.popup.d dVar = new com.vk.im.popup.d(apj0Var);
        Context context = this.a;
        dw20.b a0 = new dw20.b(context, null).i(apj0Var, true, true).a0(new wg4(1, gzsVar));
        int i5 = aVar.b;
        dw20.b z0 = a0.w0(i5 != 0 ? context.getString(i5) : aVar.a.toString()).A0(aVar.d).z0(aVar.c);
        Integer num2 = aVar.e;
        z0.getClass();
        z0.d.Y = num2;
        dw20.b p0 = z0.v(aVar.f).p0(aVar.g);
        p0.getClass();
        p0.d.k1 = izsVar2;
        C1130b c1130b = this.c;
        c1130b.a();
        c1130b.d = p0.I0("CurrentBottomSheet");
        return dVar;
    }
}

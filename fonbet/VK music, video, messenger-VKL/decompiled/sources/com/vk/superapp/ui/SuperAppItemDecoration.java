package com.vk.superapp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.toggle.d;
import com.vk.toggle.features.SmbFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bek0;
import xsna.bpn0;
import xsna.c7n0;
import xsna.dcn0;
import xsna.den0;
import xsna.dhr0;
import xsna.e43;
import xsna.eqy;
import xsna.fan0;
import xsna.fdn0;
import xsna.han0;
import xsna.hbj0;
import xsna.hdn0;
import xsna.iah0;
import xsna.jdn0;
import xsna.lan0;
import xsna.lbn0;
import xsna.ldn0;
import xsna.mcn0;
import xsna.mlf0;
import xsna.obn0;
import xsna.pvh0;
import xsna.pwh0;
import xsna.qbn0;
import xsna.qdn0;
import xsna.t970;
import xsna.uuk;
import xsna.v5n0;
import xsna.vdn0;
import xsna.xdn0;
import xsna.zif0;
import xsna.zrp;

/* compiled from: SuperAppItemDecoration.kt */
/* loaded from: classes6.dex */
public final class SuperAppItemDecoration extends RecyclerView.n {
    public static final bpn0 n = new bpn0(new t970(8));
    public static final int o = iah0.a(6);
    public static final int p = iah0.a(2);
    public static final int q = iah0.a(16);
    public static final int r = iah0.a(7);
    public final Context b;
    public final MenuBackgroundType d;
    public final mlf0 e;
    public final pvh0 f;
    public final int l;
    public final int m;
    public final boolean c = true;
    public final bpn0 g = new bpn0(new hbj0(this, 8));
    public final bpn0 h = new bpn0(new pwh0(this, 12));
    public final bpn0 i = new bpn0(new v5n0(this, 1));
    public final int j = iah0.a(20);
    public final Rect k = new Rect();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppItemDecoration.kt */
    public static final class MenuBackgroundType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MenuBackgroundType[] $VALUES;
        public static final MenuBackgroundType NONE;
        public static final MenuBackgroundType ROUND_RECT;

        static {
            MenuBackgroundType menuBackgroundType = new MenuBackgroundType("ROUND_RECT", 0);
            ROUND_RECT = menuBackgroundType;
            MenuBackgroundType menuBackgroundType2 = new MenuBackgroundType("NONE", 1);
            NONE = menuBackgroundType2;
            MenuBackgroundType[] menuBackgroundTypeArr = {menuBackgroundType, menuBackgroundType2};
            $VALUES = menuBackgroundTypeArr;
            $ENTRIES = new asp(menuBackgroundTypeArr);
        }

        public MenuBackgroundType() {
            throw null;
        }

        public static MenuBackgroundType valueOf(String str) {
            return (MenuBackgroundType) Enum.valueOf(MenuBackgroundType.class, str);
        }

        public static MenuBackgroundType[] values() {
            return (MenuBackgroundType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppItemDecoration.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a MENU;
        public static final a SECTION;
        public static final a TILE;

        static {
            a aVar = new a("MENU", 0);
            MENU = aVar;
            a aVar2 = new a("TILE", 1);
            TILE = aVar2;
            a aVar3 = new a("SECTION", 2);
            SECTION = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: SuperAppItemDecoration.kt */
    public static final class b {
        public static boolean a(List list) {
            Object obj;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof lan0) {
                    break;
                }
            }
            return ((lan0) (obj instanceof lan0 ? obj : null)) != null;
        }

        public static boolean b(zif0 zif0Var) {
            return (zif0Var instanceof obn0) || (zif0Var instanceof qbn0) || (zif0Var instanceof lan0);
        }

        public static boolean c(ListDataSet.ArrayListImpl arrayListImpl, List list) {
            return a(arrayListImpl) ^ a(list);
        }
    }

    /* compiled from: SuperAppItemDecoration.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MENU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.TILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuperAppItemDecoration(Context context, MenuBackgroundType menuBackgroundType, mlf0 mlf0Var, pvh0 pvh0Var) {
        this.b = context;
        this.d = menuBackgroundType;
        this.e = mlf0Var;
        this.f = pvh0Var;
        this.l = context.getResources().getDimensionPixelSize(R.dimen.vk_tile_widget_edge_margin);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.vk_section_widget_edge_margin);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f7, code lost:
    
        if ((r5 instanceof xsna.vdn0) == false) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0289 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int n2;
        Object obj;
        Rect rect2;
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean z = this.c;
        if (childAdapterPosition == -1) {
            if (z) {
                Object tag = view.getTag(R.id.tag_key_recycler_view_item_offsets);
                if (tag instanceof Rect) {
                    rect2 = (Rect) tag;
                    if (rect2 == null) {
                        rect.set(rect2);
                        return;
                    }
                    return;
                }
            }
            rect2 = null;
            if (rect2 == null) {
            }
        } else {
            zif0 zif0Var = (zif0) o().c.c(childAdapterPosition);
            if (zif0Var == null) {
                return;
            }
            boolean z2 = zif0Var instanceof lbn0;
            int i4 = p;
            if (z2) {
                i = iah0.a(8);
            } else if ((zif0Var instanceof obn0) || (zif0Var instanceof qbn0)) {
                int R0 = o().R0();
                i = (R0 > childAdapterPosition || childAdapterPosition >= R0 + 4) ? i4 / 2 : q;
            } else if (zif0Var instanceof fdn0) {
                i = iah0.a(40);
            } else if ((zif0Var instanceof fan0) || (zif0Var instanceof han0)) {
                i = iah0.a(12);
            } else if (zif0Var instanceof hdn0) {
                i = iah0.a(16);
            } else if (zif0Var instanceof vdn0) {
                i = iah0.a(4);
            } else if ((zif0Var instanceof qdn0) || (zif0Var instanceof ldn0)) {
                i = iah0.a(4);
            } else if (zif0Var instanceof den0) {
                i = iah0.a(p(childAdapterPosition) ? 4 : 8);
            } else {
                i = 0;
            }
            rect.top = i;
            if (z2) {
                i2 = iah0.a(6);
            } else if ((zif0Var instanceof obn0) || (zif0Var instanceof qbn0)) {
                i2 = childAdapterPosition - o().R0() >= (n() * (((n() + o().T0()) + (-1)) / n())) - n() ? o + r : i4 / 2;
            } else if (zif0Var instanceof xdn0) {
                if (childAdapterPosition == a0Var.b() - 1) {
                    i2 = iah0.a(6);
                }
                i2 = 0;
            } else if ((zif0Var instanceof fan0) || (zif0Var instanceof han0)) {
                i2 = iah0.a(8);
            } else if ((zif0Var instanceof qdn0) || (zif0Var instanceof vdn0) || (zif0Var instanceof ldn0)) {
                i2 = iah0.a(4);
            } else if (zif0Var instanceof lan0) {
                i2 = iah0.a(16);
            } else if (zif0Var instanceof hdn0) {
                i2 = iah0.a(24);
            } else if (zif0Var instanceof fdn0) {
                if (childAdapterPosition == o().getItemCount() - 1) {
                    i2 = iah0.a(40);
                }
                i2 = 0;
            } else {
                if (!(zif0Var instanceof jdn0) && !(zif0Var instanceof mcn0) && !(zif0Var instanceof dcn0)) {
                    if (!(zif0Var instanceof den0)) {
                        i2 = iah0.a(childAdapterPosition == a0Var.b() + (-1) ? 10 : 4);
                    } else if (p(childAdapterPosition)) {
                        i2 = iah0.a(12);
                    }
                }
                i2 = 0;
            }
            rect.bottom = i2;
            int i5 = this.m;
            int i6 = this.l;
            if (!z2) {
                if (zif0Var instanceof obn0) {
                    i3 = l(childAdapterPosition);
                } else if (zif0Var instanceof qbn0) {
                    i3 = l(childAdapterPosition);
                } else if (zif0Var instanceof mcn0) {
                    i3 = i6;
                } else if ((zif0Var instanceof qdn0) || (zif0Var instanceof xdn0) || (zif0Var instanceof vdn0) || (zif0Var instanceof ldn0)) {
                    i3 = i5;
                }
                if (!z2) {
                    if ((zif0Var instanceof qbn0) || (zif0Var instanceof obn0)) {
                        int measuredWidth = recyclerView.getMeasuredWidth();
                        float f = ((Boolean) n.getValue()).booleanValue() ? 10.0f : 2.0f;
                        int R02 = (childAdapterPosition - o().R0()) % n();
                        float n3 = R02 / (n() - 1);
                        i5 = (childAdapterPosition != o().S0() || (n2 = (n() + (-1)) - R02) <= 0) ? iah0.a(f * n3) : (int) ((n2 * (measuredWidth / n())) + iah0.b(f * n3));
                    } else if (zif0Var instanceof mcn0) {
                        i5 = i6;
                    } else if (!(zif0Var instanceof qdn0)) {
                        if (!(zif0Var instanceof xdn0)) {
                            if (!(zif0Var instanceof ldn0)) {
                            }
                        }
                    }
                    if (recyclerView.getLayoutDirection() == 0) {
                        rect.left = i3;
                        rect.right = i5;
                    } else {
                        rect.left = i5;
                        rect.right = i3;
                    }
                    if (z) {
                        Object tag2 = view.getTag(R.id.tag_key_recycler_view_item_offsets);
                        Rect rect3 = tag2 instanceof Rect ? (Rect) tag2 : null;
                        if (rect3 != null) {
                            rect3.set(rect);
                        } else {
                            view.setTag(R.id.tag_key_recycler_view_item_offsets, new Rect(rect));
                        }
                    }
                    if (zif0Var.b() != R.layout.vk_super_app_showcase_footer_menu_item) {
                        return;
                    }
                    ArrayList arrayList = (ArrayList) o().y0();
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        Object previous = listIterator.previous();
                        if (b.b((zif0) previous)) {
                            obj = previous;
                            break;
                        }
                    }
                    zif0 zif0Var2 = (zif0) obj;
                    view.setBackground(dhr0.t.a(zif0Var2 != null ? zif0Var.equals(zif0Var2) : false ? R.drawable.vk_highlight_radius_20_bottom : R.drawable.vk_highlight));
                    return;
                }
                i5 = 0;
                if (recyclerView.getLayoutDirection() == 0) {
                }
                if (z) {
                }
                if (zif0Var.b() != R.layout.vk_super_app_showcase_footer_menu_item) {
                }
            }
            i3 = 0;
            if (!z2) {
            }
            i5 = 0;
            if (recyclerView.getLayoutDirection() == 0) {
            }
            if (z) {
            }
            if (zif0Var.b() != R.layout.vk_super_app_showcase_footer_menu_item) {
            }
        }
    }

    public final int l(int i) {
        float f = ((Boolean) n.getValue()).booleanValue() ? 10.0f : 2.0f;
        return (i - o().R0()) % n() == 0 ? iah0.a(f) : iah0.a((1.0f - (((i - o().R0()) % n()) / (n() - 1))) * f);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(RecyclerView recyclerView, Canvas canvas, int i, int i2, int i3, int i4, a aVar) {
        Integer valueOf;
        Rect rect;
        int i5;
        Drawable drawable;
        Rect rect2 = this.k;
        int i6 = this.j;
        Integer num = null;
        if (i <= i4) {
            if (i >= i3) {
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition == null) {
                    rect = null;
                } else {
                    recyclerView.getDecoratedBoundsWithMargins(findViewHolderForAdapterPosition.itemView, rect2);
                    rect = rect2;
                }
                if (rect != null) {
                    int i7 = rect.top;
                    if (aVar == a.MENU) {
                        uuk uukVar = o().c;
                        zif0 zif0Var = ((ListDataSet) uukVar).d.size() <= 0 ? null : (zif0) uukVar.c(0);
                        if (zif0Var != null && b.b(zif0Var)) {
                            i5 = iah0.a(8);
                            valueOf = Integer.valueOf(i7 + i5);
                        }
                    }
                    i5 = 0;
                    valueOf = Integer.valueOf(i7 + i5);
                }
            } else {
                valueOf = Integer.valueOf(-i6);
            }
            if (i2 >= i3) {
                if (i2 <= i4) {
                    RecyclerView.e0 findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i2);
                    if (findViewHolderForAdapterPosition2 == null) {
                        rect2 = null;
                    } else {
                        recyclerView.getDecoratedBoundsWithMargins(findViewHolderForAdapterPosition2.itemView, rect2);
                    }
                    if (rect2 != null) {
                        num = Integer.valueOf(rect2.bottom - (aVar == a.MENU ? o : 0));
                    }
                } else {
                    num = Integer.valueOf(recyclerView.getMeasuredHeight() + i6);
                }
            }
            if (valueOf != null || num == null) {
            }
            int i8 = c.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i8 == 1) {
                drawable = (Drawable) this.g.getValue();
            } else if (i8 == 2) {
                drawable = (Drawable) this.h.getValue();
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                drawable = (Drawable) this.i.getValue();
            }
            drawable.setBounds(0, valueOf.intValue(), recyclerView.getMeasuredWidth(), num.intValue());
            drawable.draw(canvas);
            return;
        }
        valueOf = null;
        if (i2 >= i3) {
        }
        if (valueOf != null) {
        }
    }

    public final int n() {
        return ((Number) this.f.invoke()).intValue();
    }

    public final c7n0 o() {
        return (c7n0) this.e.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        MenuBackgroundType menuBackgroundType = MenuBackgroundType.NONE;
        MenuBackgroundType menuBackgroundType2 = this.d;
        if (menuBackgroundType2 == menuBackgroundType) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        Iterator it = ((ArrayList) o().y0()).iterator();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            zif0 zif0Var = (zif0) next;
            if (b.b(zif0Var)) {
                if (i2 == -1) {
                    i2 = i;
                }
                i3 = i;
            } else if ((zif0Var instanceof den0) || (zif0Var instanceof xdn0) || (zif0Var instanceof jdn0)) {
                if (i4 == -1) {
                    i4 = i;
                }
                i5 = i;
            }
            i = i6;
        }
        if (i2 != -1 && i3 != -1 && menuBackgroundType2 == MenuBackgroundType.ROUND_RECT) {
            m(recyclerView, canvas, i2, i3, v, x, a.MENU);
        }
        if (i4 == -1 || i5 == -1) {
            return;
        }
        m(recyclerView, canvas, i4, i5, v, x, a.SECTION);
    }

    public final boolean p(int i) {
        int i2 = i + 1;
        uuk uukVar = o().c;
        zif0 zif0Var = (i2 < 0 || i2 >= ((ListDataSet) uukVar).d.size()) ? null : (zif0) uukVar.c(i2);
        eqy<bek0> eqyVar = d.a;
        SmbFeatures smbFeatures = SmbFeatures.MARKET_TILE;
        smbFeatures.getClass();
        if (!com.vk.toggle.b.A.a(smbFeatures) || zif0Var == null) {
            return false;
        }
        return (zif0Var instanceof mcn0) || (zif0Var instanceof qdn0) || (zif0Var instanceof ldn0);
    }
}

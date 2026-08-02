package te;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.n0;
import androidx.recyclerview.widget.x0;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.card.MaterialCardView;
import com.sports.insider.R;
import com.sports.insider.ui.support.SupportChat;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends x0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23913a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23914b;

    /* renamed from: c, reason: collision with root package name */
    public Fragment f23915c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23916d;

    public q(SupportChat supportChat) {
        this.f23913a = 0;
        ArrayList elements = new ArrayList();
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f23914b = elements;
        this.f23915c = supportChat;
        he.a aVar = new he.a(1);
        aVar.f10585e = new ArrayList();
        aVar.f10586f = new ArrayList();
        this.f23916d = aVar;
    }

    @Override // te.p
    public void a(String str) {
        SupportChat supportChat = (SupportChat) this.f23915c;
        if (supportChat != null) {
            supportChat.a(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gf.i, java.lang.Object] */
    public void c(ka.a aVar) {
        SupportChat supportChat;
        if (aVar == null || (supportChat = (SupportChat) this.f23915c) == null) {
            return;
        }
        if (aVar == null) {
            supportChat.getClass();
        } else {
            eg.c0.t(d1.g(supportChat), null, null, new m2.f0(aVar, supportChat, (sd.m) supportChat.f7045c.getValue(), (Continuation) null, 15), 3);
        }
    }

    @Override // te.p
    public void d(int i5) {
        SupportChat supportChat = (SupportChat) this.f23915c;
        if (supportChat != null) {
            supportChat.d(i5);
        }
    }

    public xe.g e(Object obj, d2 d2Var) {
        if (obj instanceof jc.c) {
            if (((jc.c) obj).f18428c != 0) {
                return new xe.g(300L, new fg.d(16, obj, d2Var));
            }
            return null;
        }
        if (obj instanceof jc.d) {
            return new xe.g(600L, new fg.d(17, this, obj));
        }
        return null;
    }

    public void f(List list) {
        androidx.recyclerview.widget.h hVar = (androidx.recyclerview.widget.h) this.f23914b;
        androidx.recyclerview.widget.c cVar = hVar.f2402a;
        int i5 = hVar.f2408g + 1;
        hVar.f2408g = i5;
        List list2 = hVar.f2406e;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            hVar.f2406e = null;
            hVar.f2407f = Collections.EMPTY_LIST;
            cVar.c(0, size);
            hVar.a();
            return;
        }
        if (list2 != null) {
            ((Executor) hVar.f2403b.f2472a).execute(new androidx.recyclerview.widget.f(hVar, list2, list, i5));
            return;
        }
        hVar.f2406e = list;
        hVar.f2407f = DesugarCollections.unmodifiableList(list);
        cVar.b(0, list.size());
        hVar.a();
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemCount() {
        switch (this.f23913a) {
            case 0:
                return ((ArrayList) this.f23914b).size();
            default:
                return ((androidx.recyclerview.widget.h) this.f23914b).f2407f.size();
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemViewType(int i5) {
        switch (this.f23913a) {
            case 0:
                Object obj = ((ArrayList) this.f23914b).get(i5);
                if (obj instanceof lc.a) {
                    return 10;
                }
                if (!(obj instanceof ka.a)) {
                    return super.getItemViewType(i5);
                }
                ka.a aVar = (ka.a) obj;
                String str = aVar.f18954k;
                String str2 = aVar.j;
                String str3 = aVar.f18952h;
                if (aVar.f18951g == null) {
                    if (str2 == null || str == null) {
                        return 0;
                    }
                    if (str3 == null && CollectionsKt.A(lc.d.f19672b, str2)) {
                        return 3;
                    }
                    if (str3 == null || !CollectionsKt.A(lc.d.f19672b, str2)) {
                        return str3 != null ? 2 : 4;
                    }
                    return 1;
                }
                int i10 = aVar.f18953i;
                if (i10 == 2) {
                    return 12;
                }
                if (i10 == 1) {
                    return 11;
                }
                if (str2 == null || str == null) {
                    return 5;
                }
                if (str3 == null && CollectionsKt.A(lc.d.f19672b, str2)) {
                    return 6;
                }
                if (str3 == null || !CollectionsKt.A(lc.d.f19672b, str2)) {
                    return str3 != null ? 9 : 8;
                }
                return 7;
            default:
                Object obj2 = ((androidx.recyclerview.widget.h) this.f23914b).f2407f.get(i5);
                if (obj2 instanceof jc.c) {
                    return 0;
                }
                if (obj2 instanceof jc.d) {
                    return 2;
                }
                return obj2 instanceof jc.e ? 3 : 1;
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onBindViewHolder(d2 holder, int i5) {
        switch (this.f23913a) {
            case 0:
                Intrinsics.checkNotNullParameter(holder, "holder");
                if (i5 != -1 && i5 < ((ArrayList) this.f23914b).size()) {
                    Object obj = ((ArrayList) this.f23914b).get(i5);
                    if (!(holder instanceof b) || !(obj instanceof lc.a)) {
                        if (!(holder instanceof c) || !(obj instanceof ka.a)) {
                            if (!(holder instanceof e) || !(obj instanceof ka.a)) {
                                if (!(holder instanceof j) || !(obj instanceof ka.a)) {
                                    if (!(holder instanceof o) || !(obj instanceof ka.a)) {
                                        if (!(holder instanceof k) || !(obj instanceof ka.a)) {
                                            if (!(holder instanceof f) || !(obj instanceof ka.a)) {
                                                if (!(holder instanceof l) || !(obj instanceof ka.a)) {
                                                    if (!(holder instanceof g) || !(obj instanceof ka.a)) {
                                                        if (!(holder instanceof h) || !(obj instanceof ka.a)) {
                                                            if (!(holder instanceof i) || !(obj instanceof ka.a)) {
                                                                if (!(holder instanceof m) || !(obj instanceof ka.a)) {
                                                                    if ((holder instanceof n) && (obj instanceof ka.a)) {
                                                                        n nVar = (n) holder;
                                                                        ka.a aVar = (ka.a) obj;
                                                                        ec.r rVar = (ec.r) ((b3.a) nVar.f9975a);
                                                                        LinearLayout root = rVar.f8999d;
                                                                        Intrinsics.checkNotNullExpressionValue(root, "root");
                                                                        nVar.c(aVar, root);
                                                                        AppCompatImageView image = rVar.f8997b;
                                                                        Intrinsics.checkNotNullExpressionValue(image, "image");
                                                                        nVar.e(aVar, image);
                                                                        TextView textView = rVar.f8998c;
                                                                        String a7 = aVar.a(30);
                                                                        textView.setText(a7 != null ? a7 : "");
                                                                        ge.i.g(aVar, rVar.f9000e);
                                                                        String str = aVar.f18954k;
                                                                        if (str != null) {
                                                                            AppCompatImageView appCompatImageView = rVar.f8997b;
                                                                            c4.o a10 = c4.y.a(appCompatImageView.getContext());
                                                                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                                                                            eVar.f21940c = str;
                                                                            q4.j.d(eVar, appCompatImageView);
                                                                            ((c4.v) a10).a(eVar.a());
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    m mVar = (m) holder;
                                                                    ka.a aVar2 = (ka.a) obj;
                                                                    mVar.m(aVar2);
                                                                    String str2 = aVar2.f18954k;
                                                                    if (str2 != null) {
                                                                        AppCompatImageView appCompatImageView2 = ((ec.q) ((b3.a) mVar.f9975a)).f8990c;
                                                                        c4.o a11 = c4.y.a(appCompatImageView2.getContext());
                                                                        q4.e eVar2 = new q4.e(appCompatImageView2.getContext());
                                                                        eVar2.f21940c = str2;
                                                                        q4.j.d(eVar2, appCompatImageView2);
                                                                        ((c4.v) a11).a(eVar2.a());
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                i iVar = (i) holder;
                                                                ka.a aVar3 = (ka.a) obj;
                                                                ec.m mVar2 = (ec.m) ((b3.a) iVar.f9975a);
                                                                LinearLayout root2 = mVar2.f8971c;
                                                                Intrinsics.checkNotNullExpressionValue(root2, "root");
                                                                iVar.c(aVar3, root2);
                                                                AppCompatImageView image2 = mVar2.f8970b;
                                                                Intrinsics.checkNotNullExpressionValue(image2, "image");
                                                                iVar.e(aVar3, image2);
                                                                String str3 = aVar3.f18954k;
                                                                if (str3 != null) {
                                                                    AppCompatImageView appCompatImageView3 = mVar2.f8970b;
                                                                    c4.o a12 = c4.y.a(appCompatImageView3.getContext());
                                                                    q4.e eVar3 = new q4.e(appCompatImageView3.getContext());
                                                                    eVar3.f21940c = str3;
                                                                    q4.j.d(eVar3, appCompatImageView3);
                                                                    ((c4.v) a12).a(eVar3.a());
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            h hVar = (h) holder;
                                                            ka.a aVar4 = (ka.a) obj;
                                                            hVar.m(aVar4);
                                                            String str4 = aVar4.f18954k;
                                                            if (str4 != null) {
                                                                AppCompatImageView appCompatImageView4 = ((ec.l) ((b3.a) hVar.f9975a)).f8965c;
                                                                c4.o a13 = c4.y.a(appCompatImageView4.getContext());
                                                                q4.e eVar4 = new q4.e(appCompatImageView4.getContext());
                                                                eVar4.f21940c = str4;
                                                                q4.j.d(eVar4, appCompatImageView4);
                                                                ((c4.v) a13).a(eVar4.a());
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        g gVar = (g) holder;
                                                        LinearLayout root3 = ((ec.k) ((b3.a) gVar.f9975a)).f8962b;
                                                        Intrinsics.checkNotNullExpressionValue(root3, "root");
                                                        gVar.c((ka.a) obj, root3);
                                                        break;
                                                    }
                                                } else {
                                                    l lVar = (l) holder;
                                                    ka.a aVar5 = (ka.a) obj;
                                                    ec.p pVar = (ec.p) ((b3.a) lVar.f9975a);
                                                    LinearLayout root4 = pVar.f8986c;
                                                    Intrinsics.checkNotNullExpressionValue(root4, "root");
                                                    lVar.c(aVar5, root4);
                                                    TextView textView2 = pVar.f8985b;
                                                    String a14 = aVar5.a(14);
                                                    textView2.setText(a14 != null ? a14 : "");
                                                    ge.i.g(aVar5, pVar.f8987d);
                                                    break;
                                                }
                                            } else {
                                                ((f) holder).m((ka.a) obj);
                                                break;
                                            }
                                        } else {
                                            ((k) holder).m((ka.a) obj);
                                            break;
                                        }
                                    } else {
                                        o oVar = (o) holder;
                                        ka.a aVar6 = (ka.a) obj;
                                        ec.s sVar = (ec.s) ((b3.a) oVar.f9975a);
                                        LinearLayout root5 = sVar.f9003c;
                                        Intrinsics.checkNotNullExpressionValue(root5, "root");
                                        oVar.c(aVar6, root5);
                                        TextView textView3 = sVar.f9002b;
                                        String a15 = aVar6.a(14);
                                        textView3.setText(a15 != null ? a15 : "");
                                        ge.i.g(aVar6, sVar.f9004d);
                                        break;
                                    }
                                } else {
                                    j jVar = (j) holder;
                                    ka.a aVar7 = (ka.a) obj;
                                    ec.n nVar2 = (ec.n) ((b3.a) jVar.f9975a);
                                    LinearLayout frameMsg = nVar2.f8973b;
                                    Intrinsics.checkNotNullExpressionValue(frameMsg, "frameMsg");
                                    jVar.c(aVar7, frameMsg);
                                    TextView textView4 = nVar2.f8975d;
                                    String a16 = aVar7.a(14);
                                    textView4.setText(a16 != null ? a16 : "");
                                    ge.i.g(aVar7, nVar2.f8976e);
                                    ge.i.d(aVar7, nVar2.f8974c);
                                    break;
                                }
                            } else {
                                ((e) holder).m((ka.a) obj);
                                break;
                            }
                        } else {
                            ((c) holder).m((ka.a) obj);
                            break;
                        }
                    } else {
                        String date = ((lc.a) obj).f19667a;
                        Intrinsics.checkNotNullParameter(date, "date");
                        ((TextView) ((b) holder).f23865a.f19315c).setText(date);
                        break;
                    }
                }
                break;
            default:
                androidx.recyclerview.widget.h hVar2 = (androidx.recyclerview.widget.h) this.f23914b;
                Intrinsics.checkNotNullParameter(holder, "holder");
                if (!(holder instanceof ud.c)) {
                    if (!(holder instanceof ud.b)) {
                        if (!(holder instanceof ud.d)) {
                            if (holder instanceof ud.e) {
                                Object obj2 = hVar2.f2407f.get(i5);
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.sports.insider.domain.entity.faq.FaqSeparator");
                                jc.f item = (jc.f) obj2;
                                ud.e eVar5 = (ud.e) holder;
                                Intrinsics.checkNotNullParameter(item, "item");
                                androidx.appcompat.widget.a0 a0Var = eVar5.f24240a;
                                TextView textView5 = (TextView) a0Var.f684f;
                                Context context = textView5.getContext();
                                int i10 = item.f18436a;
                                int i11 = item.f18437b;
                                int i12 = item.f18438c;
                                jc.a aVar8 = item.f18439d;
                                textView5.setText(context.getText(i10));
                                LinearLayout linearLayout = (LinearLayout) a0Var.f682d;
                                Integer num = item.f18440e;
                                linearLayout.setBackground(new ColorDrawable(num != null ? num.intValue() : 0));
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) a0Var.f681c;
                                ViewGroup.LayoutParams layoutParams = appCompatImageView5.getLayoutParams();
                                layoutParams.width = aVar8.f18417b;
                                layoutParams.height = aVar8.f18418c;
                                if (layoutParams instanceof LinearLayout.LayoutParams) {
                                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                    layoutParams2.setMarginEnd(aVar8.f18420e);
                                    layoutParams2.setMarginStart(aVar8.f18419d);
                                }
                                appCompatImageView5.setLayoutParams(layoutParams);
                                Intrinsics.checkNotNull(appCompatImageView5);
                                Integer valueOf = Integer.valueOf(aVar8.f18416a);
                                c4.o a17 = c4.y.a(appCompatImageView5.getContext());
                                q4.e eVar6 = new q4.e(appCompatImageView5.getContext());
                                eVar6.f21940c = valueOf;
                                q4.j.d(eVar6, appCompatImageView5);
                                ((c4.v) a17).a(eVar6.a());
                                TextView textView6 = (TextView) a0Var.f685g;
                                if (i12 <= 0) {
                                    textView6.setVisibility(8);
                                    textView6.setText((CharSequence) null);
                                } else {
                                    textView6.setVisibility(0);
                                    textView6.setText(i12);
                                }
                                TextView textView7 = (TextView) a0Var.f683e;
                                textView7.setBackground(new ColorDrawable(num != null ? num.intValue() : 0));
                                if (i11 <= 0) {
                                    textView7.setVisibility(8);
                                    textView7.setText((CharSequence) null);
                                } else {
                                    textView7.setVisibility(0);
                                    textView7.setText(i11);
                                }
                                eVar5.itemView.setTag(item);
                                break;
                            }
                        } else {
                            Object obj3 = hVar2.f2407f.get(i5);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.sports.insider.domain.entity.faq.FaqModelRG");
                            jc.d item2 = (jc.d) obj3;
                            ud.d dVar = (ud.d) holder;
                            xe.g e7 = e(item2, holder);
                            Intrinsics.checkNotNullParameter(item2, "item");
                            c4.d dVar2 = dVar.f24239a;
                            TextView textView8 = (TextView) dVar2.f3579d;
                            Context context2 = textView8.getContext();
                            int i13 = item2.f18432a;
                            int i14 = item2.f18433b;
                            textView8.setText(context2.getString(i13));
                            ((LinearLayout) dVar2.f3581f).setOnClickListener(e7);
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) dVar2.f3580e;
                            ViewGroup.LayoutParams layoutParams3 = appCompatImageView6.getLayoutParams();
                            jc.b bVar = item2.f18435d;
                            layoutParams3.width = bVar.f18422b;
                            layoutParams3.height = bVar.f18423c;
                            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                                layoutParams4.setMarginStart(bVar.f18424d);
                                layoutParams4.setMarginEnd(bVar.f18425e);
                            }
                            appCompatImageView6.setLayoutParams(layoutParams3);
                            appCompatImageView6.setVisibility(0);
                            Intrinsics.checkNotNull(appCompatImageView6);
                            Integer valueOf2 = Integer.valueOf(bVar.f18421a);
                            c4.o a18 = c4.y.a(appCompatImageView6.getContext());
                            q4.e eVar7 = new q4.e(appCompatImageView6.getContext());
                            eVar7.f21940c = valueOf2;
                            q4.j.d(eVar7, appCompatImageView6);
                            ((c4.v) a18).a(eVar7.a());
                            TextView textView9 = (TextView) dVar2.f3578c;
                            if (i14 <= 0) {
                                textView9.setVisibility(8);
                                textView9.setText((CharSequence) null);
                            } else {
                                textView9.setVisibility(0);
                                textView9.setText(i14);
                            }
                            dVar.itemView.setTag(item2);
                            break;
                        }
                    } else {
                        Object obj4 = hVar2.f2407f.get(i5);
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.sports.insider.domain.entity.faq.FaqModel");
                        jc.c item3 = (jc.c) obj4;
                        ud.b bVar2 = (ud.b) holder;
                        xe.g e9 = e(item3, holder);
                        Intrinsics.checkNotNullParameter(item3, "item");
                        ec.y yVar = bVar2.f24237a;
                        ((LinearLayout) yVar.f9066c).setOnClickListener(e9);
                        TextView textView10 = (TextView) yVar.f9071h;
                        Context context3 = textView10.getContext();
                        int i15 = item3.f18426a;
                        int i16 = item3.f18431f;
                        int i17 = item3.f18428c;
                        textView10.setText(context3.getString(i15));
                        TextView textView11 = (TextView) yVar.f9070g;
                        textView11.setText(textView11.getContext().getString(item3.f18427b));
                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) yVar.f9067d;
                        appCompatImageView7.setRotation(item3.f18429d ? 180.0f : 0.0f);
                        appCompatImageView7.setColorFilter(-1);
                        appCompatImageView7.setVisibility(i17 == 0 ? 8 : 0);
                        ((LinearLayout) yVar.f9065b).setVisibility(item3.f18429d ? 0 : 8);
                        TextView textView12 = (TextView) yVar.f9069f;
                        if (i17 <= 0) {
                            textView12.setVisibility(8);
                            textView12.setText((CharSequence) null);
                        } else {
                            textView12.setVisibility(0);
                            textView12.setText(i17);
                        }
                        TextView textView13 = (TextView) yVar.f9068e;
                        if (i16 <= 0) {
                            textView13.setVisibility(8);
                            textView13.setText((CharSequence) null);
                        } else {
                            textView13.setVisibility(0);
                            textView13.setText(i16);
                        }
                        bVar2.itemView.setTag(item3);
                        break;
                    }
                } else {
                    Object obj5 = hVar2.f2407f.get(i5);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type com.sports.insider.domain.entity.faq.FaqPlace");
                    jc.e item4 = (jc.e) obj5;
                    ud.c cVar = (ud.c) holder;
                    Intrinsics.checkNotNullParameter(item4, "item");
                    LinearLayout linearLayout2 = (LinearLayout) cVar.f24238a.f8269c;
                    ViewGroup.LayoutParams layoutParams5 = linearLayout2.getLayoutParams();
                    item4.getClass();
                    layoutParams5.height = 0;
                    linearLayout2.setLayoutParams(layoutParams5);
                    cVar.itemView.setTag(item4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.x0
    public final d2 onCreateViewHolder(ViewGroup parent, int i5) {
        int i10;
        ge.i iVar;
        d2 bVar;
        boolean z5 = false;
        switch (this.f23913a) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                int i11 = R.id.mouse;
                int i12 = R.id.ic_state;
                int i13 = R.id.cart_data;
                switch (i5) {
                    case 1:
                        int i14 = m.f23910c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k6 = r4.k.k(parent, R.layout.holder_support_msg_img, parent, false);
                        if (((MaterialCardView) y3.j(R.id.card, k6)) == null) {
                            i13 = R.id.card;
                        } else if (((FrameLayout) y3.j(R.id.cart_data, k6)) != null) {
                            ImageView imageView = (ImageView) y3.j(R.id.ic_state, k6);
                            if (imageView != null) {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.image, k6);
                                if (appCompatImageView != null) {
                                    TextView textView = (TextView) y3.j(R.id.message, k6);
                                    if (textView != null) {
                                        i13 = R.id.progress;
                                        TextView textView2 = (TextView) y3.j(R.id.progress, k6);
                                        if (textView2 != null) {
                                            LinearLayout linearLayout = (LinearLayout) k6;
                                            TextView textView3 = (TextView) y3.j(R.id.time, k6);
                                            if (textView3 != null) {
                                                i13 = R.id.type;
                                                TextView textView4 = (TextView) y3.j(R.id.type, k6);
                                                if (textView4 != null) {
                                                    ec.q binding = new ec.q(linearLayout, imageView, appCompatImageView, textView, textView2, linearLayout, textView3, textView4);
                                                    Intrinsics.checkNotNullExpressionValue(binding, "inflate(...)");
                                                    Intrinsics.checkNotNullParameter(binding, "binding");
                                                    ge.i mVar = new m(binding, 1);
                                                    mVar.f9976b = this;
                                                    iVar = mVar;
                                                    return iVar;
                                                }
                                            } else {
                                                i13 = R.id.time;
                                            }
                                        }
                                    } else {
                                        i13 = R.id.message;
                                    }
                                } else {
                                    i13 = R.id.image;
                                }
                            } else {
                                i13 = R.id.ic_state;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k6.getResources().getResourceName(i13)));
                    case 2:
                        int i15 = k.f23893c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k9 = r4.k.k(parent, R.layout.holder_support_msg_file, parent, false);
                        if (((MaterialCardView) y3.j(R.id.card, k9)) == null) {
                            i13 = R.id.card;
                        } else if (((FrameLayout) y3.j(R.id.cart_data, k9)) != null) {
                            ImageView imageView2 = (ImageView) y3.j(R.id.ic_state, k9);
                            if (imageView2 != null) {
                                TextView textView5 = (TextView) y3.j(R.id.message, k9);
                                if (textView5 != null) {
                                    TextView textView6 = (TextView) y3.j(R.id.progress, k9);
                                    if (textView6 != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) k9;
                                        TextView textView7 = (TextView) y3.j(R.id.time, k9);
                                        if (textView7 != null) {
                                            TextView textView8 = (TextView) y3.j(R.id.type, k9);
                                            if (textView8 != null) {
                                                ec.o binding2 = new ec.o(linearLayout2, imageView2, textView5, textView6, linearLayout2, textView7, textView8);
                                                Intrinsics.checkNotNullExpressionValue(binding2, "inflate(...)");
                                                Intrinsics.checkNotNullParameter(binding2, "binding");
                                                ge.i kVar = new k(binding2, 1);
                                                kVar.f9976b = this;
                                                iVar = kVar;
                                                return iVar;
                                            }
                                            i13 = R.id.type;
                                        } else {
                                            i13 = R.id.time;
                                        }
                                    } else {
                                        i13 = R.id.progress;
                                    }
                                } else {
                                    i13 = R.id.message;
                                }
                            } else {
                                i13 = R.id.ic_state;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k9.getResources().getResourceName(i13)));
                    case 3:
                        int i16 = h.f23880c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k10 = r4.k.k(parent, R.layout.holder_support_img, parent, false);
                        if (((MaterialCardView) y3.j(R.id.card, k10)) == null) {
                            i10 = R.id.card;
                        } else if (((LinearLayout) y3.j(R.id.cart_data, k10)) != null) {
                            ImageView imageView3 = (ImageView) y3.j(R.id.ic_state, k10);
                            if (imageView3 != null) {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.image, k10);
                                if (appCompatImageView2 != null) {
                                    TextView textView9 = (TextView) y3.j(R.id.progress, k10);
                                    if (textView9 != null) {
                                        LinearLayout linearLayout3 = (LinearLayout) k10;
                                        TextView textView10 = (TextView) y3.j(R.id.time, k10);
                                        if (textView10 != null) {
                                            ec.l binding3 = new ec.l(linearLayout3, imageView3, appCompatImageView2, textView9, linearLayout3, textView10);
                                            Intrinsics.checkNotNullExpressionValue(binding3, "inflate(...)");
                                            Intrinsics.checkNotNullParameter(binding3, "binding");
                                            ge.i hVar = new h(binding3, 1);
                                            hVar.f9976b = this;
                                            iVar = hVar;
                                            return iVar;
                                        }
                                        i10 = R.id.time;
                                    } else {
                                        i10 = R.id.progress;
                                    }
                                } else {
                                    i10 = R.id.image;
                                }
                            } else {
                                i10 = R.id.ic_state;
                            }
                        } else {
                            i10 = R.id.cart_data;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k10.getResources().getResourceName(i10)));
                    case 4:
                        int i17 = f.f23873c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k11 = r4.k.k(parent, R.layout.holder_support_file, parent, false);
                        if (((MaterialCardView) y3.j(R.id.card, k11)) == null) {
                            i13 = R.id.card;
                        } else if (((LinearLayout) y3.j(R.id.cart_data, k11)) != null) {
                            ImageView imageView4 = (ImageView) y3.j(R.id.ic_state, k11);
                            if (imageView4 != null) {
                                TextView textView11 = (TextView) y3.j(R.id.message, k11);
                                if (textView11 != null) {
                                    TextView textView12 = (TextView) y3.j(R.id.progress, k11);
                                    if (textView12 != null) {
                                        LinearLayout linearLayout4 = (LinearLayout) k11;
                                        TextView textView13 = (TextView) y3.j(R.id.time, k11);
                                        if (textView13 != null) {
                                            TextView textView14 = (TextView) y3.j(R.id.type, k11);
                                            if (textView14 != null) {
                                                ec.j binding4 = new ec.j(linearLayout4, imageView4, textView11, textView12, linearLayout4, textView13, textView14);
                                                Intrinsics.checkNotNullExpressionValue(binding4, "inflate(...)");
                                                Intrinsics.checkNotNullParameter(binding4, "binding");
                                                ge.i fVar = new f(binding4, 1);
                                                fVar.f9976b = this;
                                                iVar = fVar;
                                                return iVar;
                                            }
                                            i13 = R.id.type;
                                        } else {
                                            i13 = R.id.time;
                                        }
                                    } else {
                                        i13 = R.id.progress;
                                    }
                                } else {
                                    i13 = R.id.message;
                                }
                            } else {
                                i13 = R.id.ic_state;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k11.getResources().getResourceName(i13)));
                    case 5:
                        int i18 = o.f23912c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k12 = r4.k.k(parent, R.layout.holder_support_msg_operator, parent, false);
                        if (((FrameLayout) y3.j(R.id.cart_data, k12)) != null) {
                            TextView textView15 = (TextView) y3.j(R.id.message, k12);
                            if (textView15 == null) {
                                i11 = R.id.message;
                            } else if (((FrameLayout) y3.j(R.id.mouse, k12)) != null) {
                                LinearLayout linearLayout5 = (LinearLayout) k12;
                                TextView textView16 = (TextView) y3.j(R.id.time, k12);
                                if (textView16 != null) {
                                    ec.s binding5 = new ec.s(linearLayout5, textView15, linearLayout5, textView16);
                                    Intrinsics.checkNotNullExpressionValue(binding5, "inflate(...)");
                                    Intrinsics.checkNotNullParameter(binding5, "binding");
                                    ge.i oVar = new o(binding5, 1);
                                    oVar.f9976b = this;
                                    iVar = oVar;
                                    return iVar;
                                }
                                i11 = R.id.time;
                            }
                        } else {
                            i11 = R.id.cart_data;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k12.getResources().getResourceName(i11)));
                    case 6:
                        int i19 = i.f23883c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k13 = r4.k.k(parent, R.layout.holder_support_img_operator, parent, false);
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) y3.j(R.id.image, k13);
                        if (appCompatImageView3 == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(k13.getResources().getResourceName(R.id.image)));
                        }
                        LinearLayout linearLayout6 = (LinearLayout) k13;
                        ec.m binding6 = new ec.m(linearLayout6, appCompatImageView3, linearLayout6);
                        Intrinsics.checkNotNullExpressionValue(binding6, "inflate(...)");
                        Intrinsics.checkNotNullParameter(binding6, "binding");
                        ge.i iVar2 = new i(binding6, 1);
                        iVar2.f9976b = this;
                        iVar = iVar2;
                        return iVar;
                    case 7:
                        int i20 = n.f23911c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k14 = r4.k.k(parent, R.layout.holder_support_msg_img_operator, parent, false);
                        if (((FrameLayout) y3.j(R.id.cart_data, k14)) != null) {
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) y3.j(R.id.image, k14);
                            if (appCompatImageView4 != null) {
                                TextView textView17 = (TextView) y3.j(R.id.message, k14);
                                if (textView17 == null) {
                                    i11 = R.id.message;
                                } else if (((FrameLayout) y3.j(R.id.mouse, k14)) != null) {
                                    LinearLayout linearLayout7 = (LinearLayout) k14;
                                    TextView textView18 = (TextView) y3.j(R.id.time, k14);
                                    if (textView18 != null) {
                                        ec.r binding7 = new ec.r(linearLayout7, appCompatImageView4, textView17, linearLayout7, textView18);
                                        Intrinsics.checkNotNullExpressionValue(binding7, "inflate(...)");
                                        Intrinsics.checkNotNullParameter(binding7, "binding");
                                        ge.i nVar = new n(binding7, 1);
                                        nVar.f9976b = this;
                                        iVar = nVar;
                                        return iVar;
                                    }
                                    i11 = R.id.time;
                                }
                            } else {
                                i11 = R.id.image;
                            }
                        } else {
                            i11 = R.id.cart_data;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k14.getResources().getResourceName(i11)));
                    case 8:
                        int i21 = g.f23879c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k15 = r4.k.k(parent, R.layout.holder_support_file_operator, parent, false);
                        if (((ImageView) y3.j(R.id.image, k15)) == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(k15.getResources().getResourceName(R.id.image)));
                        }
                        LinearLayout linearLayout8 = (LinearLayout) k15;
                        ec.k binding8 = new ec.k(linearLayout8, linearLayout8);
                        Intrinsics.checkNotNullExpressionValue(binding8, "inflate(...)");
                        Intrinsics.checkNotNullParameter(binding8, "binding");
                        ge.i gVar = new g(binding8, 1);
                        gVar.f9976b = this;
                        iVar = gVar;
                        return iVar;
                    case 9:
                        int i22 = l.f23897c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k16 = r4.k.k(parent, R.layout.holder_support_msg_file_operator, parent, false);
                        if (((FrameLayout) y3.j(R.id.cart_data, k16)) == null) {
                            i11 = R.id.cart_data;
                        } else if (((ImageView) y3.j(R.id.image, k16)) != null) {
                            TextView textView19 = (TextView) y3.j(R.id.message, k16);
                            if (textView19 == null) {
                                i11 = R.id.message;
                            } else if (((FrameLayout) y3.j(R.id.mouse, k16)) != null) {
                                LinearLayout linearLayout9 = (LinearLayout) k16;
                                TextView textView20 = (TextView) y3.j(R.id.time, k16);
                                if (textView20 != null) {
                                    ec.p binding9 = new ec.p(linearLayout9, textView19, linearLayout9, textView20);
                                    Intrinsics.checkNotNullExpressionValue(binding9, "inflate(...)");
                                    Intrinsics.checkNotNullParameter(binding9, "binding");
                                    ge.i lVar = new l(binding9, 1);
                                    lVar.f9976b = this;
                                    iVar = lVar;
                                    return iVar;
                                }
                                i11 = R.id.time;
                            }
                        } else {
                            i11 = R.id.image;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k16.getResources().getResourceName(i11)));
                    case 10:
                        int i23 = b.f23864b;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k17 = r4.k.k(parent, R.layout.holder_support_date, parent, false);
                        TextView textView21 = (TextView) y3.j(R.id.tv_date_live, k17);
                        if (textView21 == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(k17.getResources().getResourceName(R.id.tv_date_live)));
                        }
                        FrameLayout frameLayout = (FrameLayout) k17;
                        l1.a binding10 = new l1.a(15, frameLayout, textView21, z5);
                        Intrinsics.checkNotNullExpressionValue(binding10, "inflate(...)");
                        Intrinsics.checkNotNullParameter(binding10, "binding");
                        b bVar2 = new b(frameLayout);
                        bVar2.f23865a = binding10;
                        iVar = bVar2;
                        return iVar;
                    case 11:
                        int i24 = e.f23871c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k18 = r4.k.k(parent, R.layout.holder_support_faq_panel, parent, false);
                        if (((LinearLayout) y3.j(R.id.cart_data, k18)) != null) {
                            i13 = R.id.flex_box;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) y3.j(R.id.flex_box, k18);
                            if (flexboxLayout != null) {
                                TextView textView22 = (TextView) y3.j(R.id.message, k18);
                                if (textView22 == null) {
                                    i11 = R.id.message;
                                } else if (((FrameLayout) y3.j(R.id.mouse, k18)) != null) {
                                    ec.i binding11 = new ec.i((LinearLayout) k18, flexboxLayout, textView22);
                                    Intrinsics.checkNotNullExpressionValue(binding11, "inflate(...)");
                                    Intrinsics.checkNotNullParameter(binding11, "binding");
                                    ge.i eVar = new e(binding11, 1);
                                    eVar.f9976b = this;
                                    iVar = eVar;
                                    return iVar;
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(k18.getResources().getResourceName(i11)));
                            }
                        }
                        i11 = i13;
                        throw new NullPointerException("Missing required view with ID: ".concat(k18.getResources().getResourceName(i11)));
                    case 12:
                        int i25 = c.f23867c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k19 = r4.k.k(parent, R.layout.holder_support_faq_answer, parent, false);
                        if (((FrameLayout) y3.j(R.id.cart_data, k19)) != null) {
                            TextView textView23 = (TextView) y3.j(R.id.message, k19);
                            if (textView23 == null) {
                                i11 = R.id.message;
                            } else if (((FrameLayout) y3.j(R.id.mouse, k19)) != null) {
                                LinearLayout linearLayout10 = (LinearLayout) k19;
                                TextView textView24 = (TextView) y3.j(R.id.time, k19);
                                if (textView24 != null) {
                                    ec.h binding12 = new ec.h(linearLayout10, textView23, linearLayout10, textView24);
                                    Intrinsics.checkNotNullExpressionValue(binding12, "inflate(...)");
                                    Intrinsics.checkNotNullParameter(binding12, "binding");
                                    ge.i cVar = new c(binding12, 1);
                                    cVar.f9976b = this;
                                    iVar = cVar;
                                    return iVar;
                                }
                                i11 = R.id.time;
                            }
                        } else {
                            i11 = R.id.cart_data;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k19.getResources().getResourceName(i11)));
                    default:
                        int i26 = j.f23889c;
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        View k20 = r4.k.k(parent, R.layout.holder_support_msg, parent, false);
                        if (((MaterialCardView) y3.j(R.id.card, k20)) == null) {
                            i12 = R.id.card;
                        } else if (((FrameLayout) y3.j(R.id.cart_data, k20)) != null) {
                            LinearLayout linearLayout11 = (LinearLayout) k20;
                            ImageView imageView5 = (ImageView) y3.j(R.id.ic_state, k20);
                            if (imageView5 != null) {
                                TextView textView25 = (TextView) y3.j(R.id.message, k20);
                                if (textView25 != null) {
                                    TextView textView26 = (TextView) y3.j(R.id.time, k20);
                                    if (textView26 != null) {
                                        ec.n binding13 = new ec.n(linearLayout11, linearLayout11, imageView5, textView25, textView26);
                                        Intrinsics.checkNotNullExpressionValue(binding13, "inflate(...)");
                                        Intrinsics.checkNotNullParameter(binding13, "binding");
                                        ge.i jVar = new j(binding13, 1);
                                        jVar.f9976b = this;
                                        iVar = jVar;
                                        return iVar;
                                    }
                                    i12 = R.id.time;
                                } else {
                                    i12 = R.id.message;
                                }
                            }
                        } else {
                            i12 = R.id.cart_data;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(k20.getResources().getResourceName(i12)));
                }
            default:
                zc.k kVar2 = (zc.k) this.f23916d;
                Intrinsics.checkNotNullParameter(parent, "parent");
                int i27 = R.id.panelItem;
                if (i5 == 0) {
                    View k21 = r4.k.k(parent, R.layout.row_faq_item, parent, false);
                    int i28 = R.id.arrow_view;
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) y3.j(R.id.arrow_view, k21);
                    if (appCompatImageView5 != null) {
                        i28 = R.id.faq_description_italic;
                        TextView textView27 = (TextView) y3.j(R.id.faq_description_italic, k21);
                        if (textView27 != null) {
                            int i29 = R.id.faq_description_layout;
                            LinearLayout linearLayout12 = (LinearLayout) y3.j(R.id.faq_description_layout, k21);
                            if (linearLayout12 != null) {
                                i29 = R.id.faq_description_tv;
                                TextView textView28 = (TextView) y3.j(R.id.faq_description_tv, k21);
                                if (textView28 != null) {
                                    TextView textView29 = (TextView) y3.j(R.id.faq_text_tv, k21);
                                    if (textView29 != null) {
                                        TextView textView30 = (TextView) y3.j(R.id.faq_title_tv, k21);
                                        if (textView30 != null) {
                                            LinearLayout linearLayout13 = (LinearLayout) y3.j(R.id.panelItem, k21);
                                            if (linearLayout13 != null) {
                                                ec.y yVar = new ec.y((LinearLayout) k21, appCompatImageView5, textView27, linearLayout12, textView28, textView29, textView30, linearLayout13);
                                                Intrinsics.checkNotNullExpressionValue(yVar, "inflate(...)");
                                                bVar = new ud.b(yVar);
                                                kVar2.getClass();
                                                Typeface a7 = zc.k.a();
                                                if (a7 != null) {
                                                    ((TextView) bVar.itemView.findViewById(R.id.faq_title_tv)).setTypeface(a7);
                                                }
                                                Typeface c2 = zc.k.c();
                                                if (c2 != null) {
                                                    ((TextView) bVar.itemView.findViewById(R.id.faq_text_tv)).setTypeface(c2);
                                                    ((TextView) bVar.itemView.findViewById(R.id.faq_description_tv)).setTypeface(c2);
                                                    ((TextView) bVar.itemView.findViewById(R.id.faq_description_italic)).setTypeface(c2);
                                                }
                                            }
                                        } else {
                                            i27 = R.id.faq_title_tv;
                                        }
                                    } else {
                                        i27 = R.id.faq_text_tv;
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(k21.getResources().getResourceName(i27)));
                                }
                            }
                            i27 = i29;
                            throw new NullPointerException("Missing required view with ID: ".concat(k21.getResources().getResourceName(i27)));
                        }
                    }
                    i27 = i28;
                    throw new NullPointerException("Missing required view with ID: ".concat(k21.getResources().getResourceName(i27)));
                }
                if (i5 == 1) {
                    View k22 = r4.k.k(parent, R.layout.row_faq_separator, parent, false);
                    int i30 = R.id.ic_separator_text;
                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) y3.j(R.id.ic_separator_text, k22);
                    if (appCompatImageView6 != null) {
                        i30 = R.id.root_separator_text;
                        LinearLayout linearLayout14 = (LinearLayout) y3.j(R.id.root_separator_text, k22);
                        if (linearLayout14 != null) {
                            i30 = R.id.separator_description;
                            TextView textView31 = (TextView) y3.j(R.id.separator_description, k22);
                            if (textView31 != null) {
                                TextView textView32 = (TextView) y3.j(R.id.separator_text, k22);
                                if (textView32 != null) {
                                    TextView textView33 = (TextView) y3.j(R.id.separator_textRight, k22);
                                    if (textView33 != null) {
                                        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0((LinearLayout) k22, appCompatImageView6, linearLayout14, textView31, textView32, textView33, 10);
                                        Intrinsics.checkNotNullExpressionValue(a0Var, "inflate(...)");
                                        bVar = new ud.e(a0Var);
                                        kVar2.getClass();
                                        Typeface a10 = zc.k.a();
                                        if (a10 != null) {
                                            ((TextView) bVar.itemView.findViewById(R.id.separator_text)).setTypeface(a10);
                                        }
                                        Typeface c8 = zc.k.c();
                                        if (c8 != null) {
                                            ((TextView) bVar.itemView.findViewById(R.id.separator_textRight)).setTypeface(c8);
                                            ((TextView) bVar.itemView.findViewById(R.id.separator_description)).setTypeface(c8);
                                        }
                                    } else {
                                        i30 = R.id.separator_textRight;
                                    }
                                } else {
                                    i30 = R.id.separator_text;
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(k22.getResources().getResourceName(i30)));
                }
                if (i5 == 2) {
                    View k23 = r4.k.k(parent, R.layout.row_faq_rg_item, parent, false);
                    TextView textView34 = (TextView) y3.j(R.id.faq_text_tv, k23);
                    if (textView34 != null) {
                        TextView textView35 = (TextView) y3.j(R.id.faq_title_tv, k23);
                        if (textView35 != null) {
                            AppCompatImageView appCompatImageView7 = (AppCompatImageView) y3.j(R.id.ic_fi_academy, k23);
                            if (appCompatImageView7 != null) {
                                LinearLayout linearLayout15 = (LinearLayout) y3.j(R.id.panelItem, k23);
                                if (linearLayout15 != null) {
                                    c4.d dVar = new c4.d((LinearLayout) k23, textView34, textView35, appCompatImageView7, linearLayout15, 4);
                                    Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                                    bVar = new ud.d(dVar);
                                    kVar2.getClass();
                                    Typeface c10 = zc.k.c();
                                    if (c10 != null) {
                                        ((TextView) bVar.itemView.findViewById(R.id.faq_title_tv)).setTypeface(c10);
                                        ((TextView) bVar.itemView.findViewById(R.id.faq_text_tv)).setTypeface(c10);
                                    }
                                }
                            } else {
                                i27 = R.id.ic_fi_academy;
                            }
                        } else {
                            i27 = R.id.faq_title_tv;
                        }
                    } else {
                        i27 = R.id.faq_text_tv;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(k23.getResources().getResourceName(i27)));
                }
                View k24 = r4.k.k(parent, R.layout.row_faq_place, parent, false);
                if (k24 == null) {
                    throw new NullPointerException("rootView");
                }
                LinearLayout linearLayout16 = (LinearLayout) k24;
                d7.e eVar2 = new d7.e(6, linearLayout16, linearLayout16);
                Intrinsics.checkNotNullExpressionValue(eVar2, "inflate(...)");
                bVar = new ud.c(eVar2);
                return bVar;
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public void onViewRecycled(d2 holder) {
        switch (this.f23913a) {
            case 0:
                Intrinsics.checkNotNullParameter(holder, "holder");
                super.onViewRecycled(holder);
                if (holder instanceof n) {
                    AppCompatImageView image = ((ec.r) ((b3.a) ((n) holder).f9975a)).f8997b;
                    Intrinsics.checkNotNullExpressionValue(image, "image");
                    a.a.p(image);
                }
                if (holder instanceof m) {
                    AppCompatImageView image2 = ((ec.q) ((b3.a) ((m) holder).f9975a)).f8990c;
                    Intrinsics.checkNotNullExpressionValue(image2, "image");
                    a.a.p(image2);
                }
                if (holder instanceof i) {
                    AppCompatImageView image3 = ((ec.m) ((b3.a) ((i) holder).f9975a)).f8970b;
                    Intrinsics.checkNotNullExpressionValue(image3, "image");
                    a.a.p(image3);
                }
                if (holder instanceof h) {
                    AppCompatImageView image4 = ((ec.l) ((b3.a) ((h) holder).f9975a)).f8965c;
                    Intrinsics.checkNotNullExpressionValue(image4, "image");
                    a.a.p(image4);
                    break;
                }
                break;
            default:
                super.onViewRecycled(holder);
                break;
        }
    }

    public q() {
        this.f23913a = 1;
        s7.s sVar = new s7.s(20);
        this.f23913a = 1;
        n0 n0Var = new n0(this);
        androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(this);
        synchronized (androidx.recyclerview.widget.d.f2362a) {
            try {
                if (androidx.recyclerview.widget.d.f2363b == null) {
                    androidx.recyclerview.widget.d.f2363b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ExecutorService executorService = androidx.recyclerview.widget.d.f2363b;
        l2 l2Var = new l2();
        l2Var.f2472a = executorService;
        l2Var.f2473b = sVar;
        androidx.recyclerview.widget.h hVar = new androidx.recyclerview.widget.h(cVar, l2Var);
        this.f23914b = hVar;
        hVar.f2405d.add(n0Var);
        this.f23916d = new zc.k();
    }

    @Override // androidx.recyclerview.widget.x0
    public void onBindViewHolder(d2 holder, int i5, List payloads) {
        switch (this.f23913a) {
            case 0:
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(payloads, "payloads");
                if (payloads.isEmpty()) {
                    super.onBindViewHolder(holder, i5, payloads);
                    break;
                } else {
                    for (Object obj : payloads) {
                        if (obj instanceof Pair) {
                            Pair pair = (Pair) obj;
                            if (Intrinsics.areEqual(pair.f19192a, "progress")) {
                                Object obj2 = ((ArrayList) this.f23914b).get(i5);
                                ka.a aVar = obj2 instanceof ka.a ? (ka.a) obj2 : null;
                                if (aVar != null) {
                                    Object obj3 = pair.f19193b;
                                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                                    int intValue = ((Integer) obj3).intValue();
                                    if (aVar.f18948d < 1 && intValue >= 100) {
                                        aVar.f18948d = 1;
                                    }
                                    aVar.f18955l = intValue;
                                    if (holder instanceof f) {
                                        ((f) holder).m(aVar);
                                    } else if (holder instanceof k) {
                                        ((k) holder).m(aVar);
                                    } else if (holder instanceof h) {
                                        ((h) holder).m(aVar);
                                    } else if (holder instanceof m) {
                                        ((m) holder).m(aVar);
                                    } else if (holder instanceof e) {
                                        ((e) holder).m(aVar);
                                    } else if (holder instanceof c) {
                                        ((c) holder).m(aVar);
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
            default:
                super.onBindViewHolder(holder, i5, payloads);
                break;
        }
    }
}

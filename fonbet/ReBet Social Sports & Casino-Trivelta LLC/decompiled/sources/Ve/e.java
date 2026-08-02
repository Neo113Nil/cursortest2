package Ve;

import L4.g;
import M4.j;
import ag.C1955a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.q;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.utils.AbstractC3943l;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n.AbstractC5596a;
import od.AbstractC5886l;
import og.AbstractC5890b;
import og.AbstractC5892d;
import og.i;
import og.m;
import og.p;
import xe.C6822a;

/* loaded from: classes4.dex */
public abstract class e extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    public final View f12882a;

    /* renamed from: b, reason: collision with root package name */
    public SalesIQChat f12883b;

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12884a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f12885b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageView f12886c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Drawable f12887d;

        public a(String str, Object obj, ImageView imageView, Drawable drawable) {
            this.f12884a = str;
            this.f12885b = obj;
            this.f12886c = imageView;
            this.f12887d = drawable;
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            if (!Intrinsics.areEqual(model, this.f12884a) && !Intrinsics.areEqual(model, this.f12885b)) {
                return true;
            }
            this.f12886c.setImageDrawable(resource);
            return true;
        }

        @Override // L4.g
        public boolean k(q qVar, Object obj, j target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            if (!Intrinsics.areEqual(obj, this.f12884a) && !Intrinsics.areEqual(obj, this.f12885b)) {
                return true;
            }
            this.f12886c.setImageDrawable(this.f12887d);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView) {
        super(itemView);
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f12882a = itemView;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            p.v(itemView, AbstractC5892d.h(d(), Integer.valueOf(AbstractC5886l.f59699B1), 0.0f, 2, null), null, null, false, 0, 30, null);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public void b(SalesIQChat salesIQChat) {
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        this.f12883b = salesIQChat;
    }

    public final boolean c() {
        Channel.Chat chat;
        Channel m10 = C6822a.m();
        return ((m10 == null || (chat = m10.getChat()) == null) ? false : Intrinsics.areEqual(chat.getShowOperatorImage(), Boolean.TRUE)) && (((this instanceof C1955a) && LiveChatUtil.canShowOperatorImageInChat()) || ((this instanceof d) && Ye.d.e(De.a.CallsOperatorImageVisibility, true)));
    }

    public final Context d() {
        Context context = this.f12882a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0089, code lost:
    
        if (og.i.f(r1 != null ? r1.getAttenderid() : null) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ImageView userDpView) {
        int i10;
        SalesIQChat salesIQChat;
        SalesIQChat salesIQChat2;
        Pe.b g02;
        String g10;
        String d10;
        Object g11;
        SalesIQChat.Extras extras;
        SalesIQChat.Extras extras2;
        SalesIQChat.Extras.a aVar;
        String str;
        SalesIQChat salesIQChat3;
        SalesIQChat salesIQChat4;
        SalesIQChat salesIQChat5;
        String str2;
        SalesIQChat salesIQChat6;
        SalesIQChat salesIQChat7;
        Intrinsics.checkNotNullParameter(userDpView, "userDpView");
        Context d11 = d();
        SalesIQChat salesIQChat8 = this.f12883b;
        if (salesIQChat8 != null && salesIQChat8.isBotAttender()) {
            SalesIQChat salesIQChat9 = this.f12883b;
            if ((salesIQChat9 != null ? Integer.valueOf(salesIQChat9.getStatus()) : null) != null && ((salesIQChat7 = this.f12883b) == null || salesIQChat7.getStatus() != 3)) {
                i10 = od.p.f60143o3;
                Drawable b10 = AbstractC5596a.b(d11, i10);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                userDpView.setBackground(gradientDrawable);
                userDpView.setImageDrawable(b10);
                if (Td.e.H()) {
                    SalesIQChat salesIQChat10 = this.f12883b;
                    if ((salesIQChat10 != null ? salesIQChat10.getType() : null) == SalesIQChat.c.Call) {
                        SalesIQChat salesIQChat11 = this.f12883b;
                        if (salesIQChat11 == null || salesIQChat11.getStatus() != 1) {
                            SalesIQChat salesIQChat12 = this.f12883b;
                        }
                        g11 = null;
                        if (!c() || ((salesIQChat6 = this.f12883b) != null && salesIQChat6.isBotAttender())) {
                            salesIQChat3 = this.f12883b;
                            if ((salesIQChat3 == null ? Integer.valueOf(salesIQChat3.getStatus()) : null) != null && ((salesIQChat4 = this.f12883b) == null || salesIQChat4.getStatus() != 3)) {
                                salesIQChat5 = this.f12883b;
                                if (i.f(salesIQChat5 == null ? salesIQChat5.getAttenderImgkey() : null)) {
                                    SalesIQChat salesIQChat13 = this.f12883b;
                                    if (i.f(salesIQChat13 != null ? salesIQChat13.getAttenderid() : null)) {
                                        SalesIQChat salesIQChat14 = this.f12883b;
                                        r5 = salesIQChat14 != null ? salesIQChat14.getAttenderid() : null;
                                        SalesIQChat salesIQChat15 = this.f12883b;
                                        r5 = sd.d.b(r5, salesIQChat15 != null && salesIQChat15.isBotAttender());
                                    }
                                } else {
                                    SalesIQChat salesIQChat16 = this.f12883b;
                                    r5 = salesIQChat16 != null ? salesIQChat16.getAttenderImgkey() : null;
                                    SalesIQChat salesIQChat17 = this.f12883b;
                                    r5 = sd.d.b(r5, salesIQChat17 != null && salesIQChat17.isBotAttender());
                                }
                            }
                        }
                        str2 = r5;
                        if (i.f(str2) && g11 == null) {
                            return;
                        }
                        wd.d.K(userDpView, g11 != null ? str2 : g11, null, false, true, new a(str2, g11, userDpView, b10), null, b10, str2, null, false, null, 3584, null);
                    }
                }
                salesIQChat = this.f12883b;
                if (salesIQChat != null || (extras2 = salesIQChat.getExtras()) == null || (aVar = extras2.attributes) == null || (str = aVar.displayPicture) == null || (g11 = m.d(str)) == null) {
                    salesIQChat2 = this.f12883b;
                    if (salesIQChat2 != null && (extras = salesIQChat2.getExtras()) != null) {
                        extras.getCall();
                    }
                    g02 = Te.a.g0();
                    if (g02 != null && (g10 = g02.g()) != null && (d10 = m.d(g10)) != null) {
                        g11 = AbstractC5890b.g(d10);
                    }
                    g11 = null;
                }
                if (!c()) {
                }
                salesIQChat3 = this.f12883b;
                if ((salesIQChat3 == null ? Integer.valueOf(salesIQChat3.getStatus()) : null) != null) {
                    salesIQChat5 = this.f12883b;
                    if (i.f(salesIQChat5 == null ? salesIQChat5.getAttenderImgkey() : null)) {
                    }
                }
                str2 = r5;
                if (i.f(str2)) {
                }
                wd.d.K(userDpView, g11 != null ? str2 : g11, null, false, true, new a(str2, g11, userDpView, b10), null, b10, str2, null, false, null, 3584, null);
            }
        }
        i10 = StringsKt.equals("DARK", P.j(d()), true) ? od.p.f60127l2 : od.p.f60132m2;
        Drawable b102 = AbstractC5596a.b(d11, i10);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        userDpView.setBackground(gradientDrawable2);
        userDpView.setImageDrawable(b102);
        if (Td.e.H()) {
        }
        salesIQChat = this.f12883b;
        if (salesIQChat != null) {
        }
        salesIQChat2 = this.f12883b;
        if (salesIQChat2 != null) {
            extras.getCall();
        }
        g02 = Te.a.g0();
        if (g02 != null) {
            g11 = AbstractC5890b.g(d10);
            if (!c()) {
            }
            salesIQChat3 = this.f12883b;
            if ((salesIQChat3 == null ? Integer.valueOf(salesIQChat3.getStatus()) : null) != null) {
            }
            str2 = r5;
            if (i.f(str2)) {
            }
            wd.d.K(userDpView, g11 != null ? str2 : g11, null, false, true, new a(str2, g11, userDpView, b102), null, b102, str2, null, false, null, 3584, null);
        }
        g11 = null;
        if (!c()) {
        }
        salesIQChat3 = this.f12883b;
        if ((salesIQChat3 == null ? Integer.valueOf(salesIQChat3.getStatus()) : null) != null) {
        }
        str2 = r5;
        if (i.f(str2)) {
        }
        wd.d.K(userDpView, g11 != null ? str2 : g11, null, false, true, new a(str2, g11, userDpView, b102), null, b102, str2, null, false, null, 3584, null);
    }

    public final void g(TextView timeView) {
        Intrinsics.checkNotNullParameter(timeView, "timeView");
        SalesIQChat salesIQChat = this.f12883b;
        if (i.r(salesIQChat != null ? Long.valueOf(salesIQChat.getLastmsgtime()) : null) > 0) {
            SalesIQChat salesIQChat2 = this.f12883b;
            Long valueOf = salesIQChat2 != null ? Long.valueOf(salesIQChat2.getLastmsgtime()) : null;
            Intrinsics.checkNotNull(valueOf);
            String b10 = AbstractC3943l.b(valueOf.longValue());
            Intrinsics.checkNotNullExpressionValue(b10, "getTimeDifference(...)");
            timeView.setText(StringsKt.trim((CharSequence) b10).toString());
        }
    }
}

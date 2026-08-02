package qe;

import android.R;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.AbstractC2074d;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.salesiqembed.ZohoSalesIQ;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import n.AbstractC5596a;
import od.AbstractC5886l;
import od.u;
import og.AbstractC5892d;
import og.i;
import og.k;
import og.p;
import rd.C6218a;
import ta.C6454b;
import ud.j;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f63485a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f63486b = LazyKt.lazy(a.f63487d);

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f63487d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final float[] invoke() {
            float[] fArr = new float[8];
            for (int i10 = 0; i10 < 8; i10++) {
                fArr[i10] = k.a(20.0f);
            }
            return fArr;
        }
    }

    public static final androidx.appcompat.app.a e(Context context, CharSequence charSequence, CharSequence charSequence2, String str, DialogInterface.OnClickListener onClickListener, Integer num, String str2) {
        return i(context, charSequence, charSequence2, str, onClickListener, num, str2, null, null, null, null, false, false, null, 16256, null);
    }

    public static final androidx.appcompat.app.a f(Context context, CharSequence charSequence, CharSequence charSequence2, String str, DialogInterface.OnClickListener onClickListener, Integer num, String str2, DialogInterface.OnClickListener onClickListener2) {
        return i(context, charSequence, charSequence2, str, onClickListener, num, str2, onClickListener2, null, null, null, false, false, null, 16128, null);
    }

    public static final androidx.appcompat.app.a g(Context context, CharSequence charSequence, CharSequence charSequence2, String str, DialogInterface.OnClickListener onClickListener, Integer num, String str2, DialogInterface.OnClickListener onClickListener2, Integer num2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnDismissListener onDismissListener, boolean z10) {
        return i(context, charSequence, charSequence2, str, onClickListener, num, str2, onClickListener2, num2, onCancelListener, onDismissListener, z10, false, null, 12288, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x0027, B:8:0x002a, B:10:0x003e, B:11:0x0062, B:13:0x006b, B:15:0x0072, B:16:0x0079, B:17:0x0089, B:19:0x00ba, B:22:0x00c1, B:23:0x00cc, B:27:0x00d7, B:28:0x00e3, B:32:0x00ee, B:34:0x00fc, B:37:0x0103, B:39:0x0112, B:42:0x011a, B:45:0x0121, B:46:0x0129, B:49:0x0133, B:52:0x013a, B:54:0x0147, B:57:0x014e, B:58:0x0159, B:60:0x0177, B:62:0x0181, B:64:0x0187, B:66:0x018f, B:68:0x019c, B:69:0x01a1, B:71:0x01ab, B:72:0x01ae, B:83:0x019f, B:84:0x0154, B:85:0x0140, B:87:0x012c, B:90:0x00c7), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.appcompat.app.a h(Context context, CharSequence charSequence, CharSequence charSequence2, String str, final DialogInterface.OnClickListener onClickListener, Integer num, String str2, final DialogInterface.OnClickListener onClickListener2, Integer num2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnDismissListener onDismissListener, boolean z10, boolean z11, ViewGroup viewGroup) {
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        a.C0340a m10;
        j c10;
        Window window;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        d dVar = f63485a;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(context);
            m10 = m(context);
            if (onCancelListener != null) {
                m10.j(onCancelListener);
            }
            if (onDismissListener != null) {
                m10.k(onDismissListener);
            }
            m10.b(z10);
            c10 = j.c(LayoutInflater.from(context));
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
            if (z11) {
                ConstraintLayout b10 = c10.b();
                Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
                p.d(b10, k.b(28), Integer.valueOf(P.e(context, AbstractC5886l.f59743M1)), 0, null, false, 28, null);
            }
            c10.f66319b.setEmptyVisibility(8);
            if (viewGroup != null) {
                if (viewGroup.getId() == -1) {
                    viewGroup.setId(View.generateViewId());
                }
                c10.b().addView(viewGroup);
                c10.f66319b.setContentId(viewGroup.getId());
            }
            c10.f66322e.setTextColor(P.e(context, AbstractC5886l.f59763R1));
            c10.f66323f.setTypeface(C6218a.P());
            c10.f66323f.setMovementMethod(LinkMovementMethod.getInstance());
            c10.f66322e.setTypeface(C6218a.P());
            c10.f66322e.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (charSequence != null && charSequence.length() != 0) {
            c10.f66323f.setText(charSequence);
            if ((!i.e(num) ? dVar : null) != null) {
                MobilistenTextView mobilistenTextView = c10.f66321d;
                Intrinsics.checkNotNull(num);
                mobilistenTextView.setTextColor(num.intValue());
            }
            if ((!i.e(num2) ? dVar : null) != null) {
                MobilistenTextView mobilistenTextView2 = c10.f66320c;
                Intrinsics.checkNotNull(num2);
                mobilistenTextView2.setTextColor(num2.intValue());
            }
            if (charSequence2 != null && charSequence2.length() != 0) {
                c10.f66322e.setText(charSequence2);
                ViewGroup.LayoutParams layoutParams = c10.f66322e.getLayoutParams();
                marginLayoutParams = !(layoutParams instanceof ViewGroup.MarginLayoutParams) ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    if (charSequence != null && charSequence.length() != 0) {
                        i10 = k.b(16);
                        marginLayoutParams.topMargin = i10;
                    }
                    i10 = 0;
                    marginLayoutParams.topMargin = i10;
                }
                if (str != null && str.length() != 0) {
                    c10.f66321d.setText(str);
                    if (str2 != null && str2.length() != 0) {
                        c10.f66320c.setText(str2);
                        MobilistenTextView siqPositiveButton = c10.f66321d;
                        Intrinsics.checkNotNullExpressionValue(siqPositiveButton, "siqPositiveButton");
                        dVar.d(siqPositiveButton, num, AbstractC5886l.f59755P1);
                        MobilistenTextView siqNegativeButton = c10.f66320c;
                        Intrinsics.checkNotNullExpressionValue(siqNegativeButton, "siqNegativeButton");
                        dVar.d(siqNegativeButton, num2, AbstractC5886l.f59747N1);
                        if (z11) {
                            ViewGroup.LayoutParams layoutParams2 = c10.f66321d.getLayoutParams();
                            ConstraintLayout.b bVar = layoutParams2 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams2 : null;
                            if (bVar != null) {
                                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = k.b(24);
                            }
                        }
                        m10.setView(c10.b());
                        final androidx.appcompat.app.a create = m10.create();
                        Drawable b11 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
                        window = create.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(b11);
                        }
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                d.j(Ref.ObjectRef.this, dialogInterface);
                            }
                        });
                        c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                d.k(onClickListener, objectRef, create, view);
                            }
                        });
                        c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                d.l(onClickListener2, objectRef, create, view);
                            }
                        });
                        create.show();
                        m147constructorimpl = Result.m147constructorimpl(create);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
                    }
                    p.n(c10.f66320c);
                    MobilistenTextView siqPositiveButton2 = c10.f66321d;
                    Intrinsics.checkNotNullExpressionValue(siqPositiveButton2, "siqPositiveButton");
                    dVar.d(siqPositiveButton2, num, AbstractC5886l.f59755P1);
                    MobilistenTextView siqNegativeButton2 = c10.f66320c;
                    Intrinsics.checkNotNullExpressionValue(siqNegativeButton2, "siqNegativeButton");
                    dVar.d(siqNegativeButton2, num2, AbstractC5886l.f59747N1);
                    if (z11) {
                    }
                    m10.setView(c10.b());
                    final androidx.appcompat.app.a create2 = m10.create();
                    Drawable b112 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
                    window = create2.getWindow();
                    if (window != null) {
                    }
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    create2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            d.j(Ref.ObjectRef.this, dialogInterface);
                        }
                    });
                    c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.k(onClickListener, objectRef2, create2, view);
                        }
                    });
                    c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.l(onClickListener2, objectRef2, create2, view);
                        }
                    });
                    create2.show();
                    m147constructorimpl = Result.m147constructorimpl(create2);
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                    }
                    return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
                }
                p.n(c10.f66321d);
                if (str2 != null) {
                    c10.f66320c.setText(str2);
                    MobilistenTextView siqPositiveButton22 = c10.f66321d;
                    Intrinsics.checkNotNullExpressionValue(siqPositiveButton22, "siqPositiveButton");
                    dVar.d(siqPositiveButton22, num, AbstractC5886l.f59755P1);
                    MobilistenTextView siqNegativeButton22 = c10.f66320c;
                    Intrinsics.checkNotNullExpressionValue(siqNegativeButton22, "siqNegativeButton");
                    dVar.d(siqNegativeButton22, num2, AbstractC5886l.f59747N1);
                    if (z11) {
                    }
                    m10.setView(c10.b());
                    final androidx.appcompat.app.a create22 = m10.create();
                    Drawable b1122 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
                    window = create22.getWindow();
                    if (window != null) {
                    }
                    final Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                    create22.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            d.j(Ref.ObjectRef.this, dialogInterface);
                        }
                    });
                    c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.k(onClickListener, objectRef22, create22, view);
                        }
                    });
                    c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.l(onClickListener2, objectRef22, create22, view);
                        }
                    });
                    create22.show();
                    m147constructorimpl = Result.m147constructorimpl(create22);
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                    }
                    return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
                }
                p.n(c10.f66320c);
                MobilistenTextView siqPositiveButton222 = c10.f66321d;
                Intrinsics.checkNotNullExpressionValue(siqPositiveButton222, "siqPositiveButton");
                dVar.d(siqPositiveButton222, num, AbstractC5886l.f59755P1);
                MobilistenTextView siqNegativeButton222 = c10.f66320c;
                Intrinsics.checkNotNullExpressionValue(siqNegativeButton222, "siqNegativeButton");
                dVar.d(siqNegativeButton222, num2, AbstractC5886l.f59747N1);
                if (z11) {
                }
                m10.setView(c10.b());
                final androidx.appcompat.app.a create222 = m10.create();
                Drawable b11222 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
                window = create222.getWindow();
                if (window != null) {
                }
                final Ref.ObjectRef objectRef222 = new Ref.ObjectRef();
                create222.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        d.j(Ref.ObjectRef.this, dialogInterface);
                    }
                });
                c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.k(onClickListener, objectRef222, create222, view);
                    }
                });
                c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.l(onClickListener2, objectRef222, create222, view);
                    }
                });
                create222.show();
                m147constructorimpl = Result.m147constructorimpl(create222);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                }
                return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
            }
            p.n(c10.f66322e);
            if (str != null) {
                c10.f66321d.setText(str);
                if (str2 != null) {
                }
                p.n(c10.f66320c);
                MobilistenTextView siqPositiveButton2222 = c10.f66321d;
                Intrinsics.checkNotNullExpressionValue(siqPositiveButton2222, "siqPositiveButton");
                dVar.d(siqPositiveButton2222, num, AbstractC5886l.f59755P1);
                MobilistenTextView siqNegativeButton2222 = c10.f66320c;
                Intrinsics.checkNotNullExpressionValue(siqNegativeButton2222, "siqNegativeButton");
                dVar.d(siqNegativeButton2222, num2, AbstractC5886l.f59747N1);
                if (z11) {
                }
                m10.setView(c10.b());
                final androidx.appcompat.app.a create2222 = m10.create();
                Drawable b112222 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
                window = create2222.getWindow();
                if (window != null) {
                }
                final Ref.ObjectRef objectRef2222 = new Ref.ObjectRef();
                create2222.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        d.j(Ref.ObjectRef.this, dialogInterface);
                    }
                });
                c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.k(onClickListener, objectRef2222, create2222, view);
                    }
                });
                c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.l(onClickListener2, objectRef2222, create2222, view);
                    }
                });
                create2222.show();
                m147constructorimpl = Result.m147constructorimpl(create2222);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                }
                return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
            }
            p.n(c10.f66321d);
            if (str2 != null) {
            }
            p.n(c10.f66320c);
            MobilistenTextView siqPositiveButton22222 = c10.f66321d;
            Intrinsics.checkNotNullExpressionValue(siqPositiveButton22222, "siqPositiveButton");
            dVar.d(siqPositiveButton22222, num, AbstractC5886l.f59755P1);
            MobilistenTextView siqNegativeButton22222 = c10.f66320c;
            Intrinsics.checkNotNullExpressionValue(siqNegativeButton22222, "siqNegativeButton");
            dVar.d(siqNegativeButton22222, num2, AbstractC5886l.f59747N1);
            if (z11) {
            }
            m10.setView(c10.b());
            final androidx.appcompat.app.a create22222 = m10.create();
            Drawable b1122222 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
            window = create22222.getWindow();
            if (window != null) {
            }
            final Ref.ObjectRef objectRef22222 = new Ref.ObjectRef();
            create22222.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    d.j(Ref.ObjectRef.this, dialogInterface);
                }
            });
            c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.k(onClickListener, objectRef22222, create22222, view);
                }
            });
            c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.l(onClickListener2, objectRef22222, create22222, view);
                }
            });
            create22222.show();
            m147constructorimpl = Result.m147constructorimpl(create22222);
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
            }
            return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        }
        p.n(c10.f66323f);
        if ((!i.e(num) ? dVar : null) != null) {
        }
        if ((!i.e(num2) ? dVar : null) != null) {
        }
        if (charSequence2 != null) {
            c10.f66322e.setText(charSequence2);
            ViewGroup.LayoutParams layoutParams3 = c10.f66322e.getLayoutParams();
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
            }
            if (marginLayoutParams != null) {
            }
            if (str != null) {
            }
            p.n(c10.f66321d);
            if (str2 != null) {
            }
            p.n(c10.f66320c);
            MobilistenTextView siqPositiveButton222222 = c10.f66321d;
            Intrinsics.checkNotNullExpressionValue(siqPositiveButton222222, "siqPositiveButton");
            dVar.d(siqPositiveButton222222, num, AbstractC5886l.f59755P1);
            MobilistenTextView siqNegativeButton222222 = c10.f66320c;
            Intrinsics.checkNotNullExpressionValue(siqNegativeButton222222, "siqNegativeButton");
            dVar.d(siqNegativeButton222222, num2, AbstractC5886l.f59747N1);
            if (z11) {
            }
            m10.setView(c10.b());
            final androidx.appcompat.app.a create222222 = m10.create();
            Drawable b11222222 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
            window = create222222.getWindow();
            if (window != null) {
            }
            final Ref.ObjectRef objectRef222222 = new Ref.ObjectRef();
            create222222.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    d.j(Ref.ObjectRef.this, dialogInterface);
                }
            });
            c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.k(onClickListener, objectRef222222, create222222, view);
                }
            });
            c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.l(onClickListener2, objectRef222222, create222222, view);
                }
            });
            create222222.show();
            m147constructorimpl = Result.m147constructorimpl(create222222);
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
            }
            return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        }
        p.n(c10.f66322e);
        if (str != null) {
        }
        p.n(c10.f66321d);
        if (str2 != null) {
        }
        p.n(c10.f66320c);
        MobilistenTextView siqPositiveButton2222222 = c10.f66321d;
        Intrinsics.checkNotNullExpressionValue(siqPositiveButton2222222, "siqPositiveButton");
        dVar.d(siqPositiveButton2222222, num, AbstractC5886l.f59755P1);
        MobilistenTextView siqNegativeButton2222222 = c10.f66320c;
        Intrinsics.checkNotNullExpressionValue(siqNegativeButton2222222, "siqNegativeButton");
        dVar.d(siqNegativeButton2222222, num2, AbstractC5886l.f59747N1);
        if (z11) {
        }
        m10.setView(c10.b());
        final androidx.appcompat.app.a create2222222 = m10.create();
        Drawable b112222222 = AbstractC5596a.b(context, !z11 ? od.p.f60037S3 : od.p.f60032R3);
        window = create2222222.getWindow();
        if (window != null) {
        }
        final Ref.ObjectRef objectRef2222222 = new Ref.ObjectRef();
        create2222222.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qe.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                d.j(Ref.ObjectRef.this, dialogInterface);
            }
        });
        c10.f66321d.setOnClickListener(new View.OnClickListener() { // from class: qe.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.k(onClickListener, objectRef2222222, create2222222, view);
            }
        });
        c10.f66320c.setOnClickListener(new View.OnClickListener() { // from class: qe.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.l(onClickListener2, objectRef2222222, create2222222, view);
            }
        });
        create2222222.show();
        m147constructorimpl = Result.m147constructorimpl(create2222222);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
        }
        return (androidx.appcompat.app.a) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
    }

    public static /* synthetic */ androidx.appcompat.app.a i(Context context, CharSequence charSequence, CharSequence charSequence2, String str, DialogInterface.OnClickListener onClickListener, Integer num, String str2, DialogInterface.OnClickListener onClickListener2, Integer num2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnDismissListener onDismissListener, boolean z10, boolean z11, ViewGroup viewGroup, int i10, Object obj) {
        return h(context, (i10 & 2) != 0 ? null : charSequence, (i10 & 4) != 0 ? null : charSequence2, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : onClickListener, (i10 & 32) != 0 ? context != null ? Integer.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59759Q1), 0.0f, 2, null)) : null : num, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? null : onClickListener2, (i10 & 256) != 0 ? context != null ? Integer.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59751O1), 0.0f, 2, null)) : null : num2, (i10 & 512) != 0 ? null : onCancelListener, (i10 & 1024) != 0 ? null : onDismissListener, (i10 & 2048) != 0 ? true : z10, (i10 & 4096) == 0 ? z11 : true, (i10 & 8192) != 0 ? null : viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Ref.ObjectRef dialogInterface, DialogInterface dialogInterface2) {
        Intrinsics.checkNotNullParameter(dialogInterface, "$dialogInterface");
        dialogInterface.element = dialogInterface2;
    }

    public static final void k(DialogInterface.OnClickListener onClickListener, Ref.ObjectRef dialogInterface, androidx.appcompat.app.a this_apply, View view) {
        Intrinsics.checkNotNullParameter(dialogInterface, "$dialogInterface");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (onClickListener != null) {
            onClickListener.onClick((DialogInterface) dialogInterface.element, -1);
        }
        this_apply.dismiss();
    }

    public static final void l(DialogInterface.OnClickListener onClickListener, Ref.ObjectRef dialogInterface, androidx.appcompat.app.a this_apply, View view) {
        Intrinsics.checkNotNullParameter(dialogInterface, "$dialogInterface");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (onClickListener != null) {
            onClickListener.onClick((DialogInterface) dialogInterface.element, -2);
        }
        this_apply.dismiss();
    }

    public static final a.C0340a m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C6454b(context);
    }

    public static final int n(Context context) {
        SharedPreferences M10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i10 = u.f61155a;
        if (ZohoLiveChat.getApplicationManager() != null && (M10 = C6218a.M()) != null) {
            if (!M10.getBoolean("SYNC_WITH_OS", true)) {
                return ZohoSalesIQ.getTheme();
            }
            String j10 = P.j(context);
            if (!Intrinsics.areEqual("null", j10)) {
                Intrinsics.areEqual("Dark", j10);
                return i10;
            }
            MobilistenInitProvider.Companion companion = MobilistenInitProvider.INSTANCE;
            if (companion.e() != null) {
                Application e10 = companion.e();
                Intrinsics.checkNotNull(e10);
                int i11 = e10.getResources().getConfiguration().uiMode;
                return i10;
            }
        }
        return i10;
    }

    public static final float[] o() {
        return (float[]) f63486b.getValue();
    }

    public final void d(TextView textView, Integer num, int i10) {
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p.v(textView, AbstractC5892d.h(context, Integer.valueOf(i10), 0.0f, 2, null), o(), null, false, AbstractC2074d.k(num != null ? num.intValue() : androidx.core.content.res.k.d(textView.getContext().getResources(), R.color.black, textView.getContext().getTheme()), 30), 12, null);
    }
}

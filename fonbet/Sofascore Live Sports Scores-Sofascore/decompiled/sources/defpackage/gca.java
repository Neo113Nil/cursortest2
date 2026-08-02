package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.textview.MaterialTextView;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.results.R;
import com.sofascore.results.chat.view.ChatActionsModal;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gca extends bca {
    public final Activity d;
    public ChatUser e;
    public final Function2 f;
    public final Function0 g;
    public final Function0 h;
    public final Function1 i;
    public final boolean j;
    public final boolean k;
    public boolean l;
    public Float m;
    public final joa n;
    public final int o;
    public final joa p;
    public final joa q;
    public final joa r;
    public final joa s;

    public gca(Activity activity, ChatUser chatUser, Function2 function2, Function0 function0, Function0 function02, Function1 function1, boolean z, boolean z2) {
        activity.getClass();
        this.d = activity;
        this.e = chatUser;
        this.f = function2;
        this.g = function0;
        this.h = function02;
        this.i = function1;
        this.j = z;
        this.k = z2;
        final int i = 0;
        Function0 function03 = new Function0(this) { // from class: fca
            public final /* synthetic */ gca b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                gca gcaVar = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(ao2.u(12, gcaVar.d));
                    case 1:
                        View inflate = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView = (MaterialTextView) inflate;
                        materialTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView.setText(materialTextView.getContext().getString(R.string.reply));
                        materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView.getContext().getDrawable(R.drawable.reply_action), (Drawable) null, (Drawable) null);
                        materialTextView.setTextColor(ColorStateList.valueOf(materialTextView.getContext().getColor(R.color.primary_default)));
                        materialTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView.layout(0, 0, materialTextView.getMeasuredWidth(), materialTextView.getMeasuredHeight());
                        return materialTextView;
                    case 2:
                        View inflate2 = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView2 = (MaterialTextView) inflate2;
                        materialTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView2.setText(materialTextView2.getContext().getString((gcaVar.j || !(gcaVar.e.isAdmin() || gcaVar.e.isModerator())) ? gcaVar.k ? R.string.chat_remove : R.string.chat_report : R.string.chat_actions));
                        materialTextView2.setTextColor(ColorStateList.valueOf(materialTextView2.getContext().getColor(R.color.live)));
                        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView2.getContext().getDrawable(R.drawable.report_action), (Drawable) null, (Drawable) null);
                        materialTextView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView2.layout(0, 0, materialTextView2.getMeasuredWidth(), materialTextView2.getMeasuredHeight());
                        return materialTextView2;
                    case 3:
                        Bitmap createBitmap = Bitmap.createBitmap(gcaVar.w().getMeasuredWidth(), gcaVar.w().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        gcaVar.w().draw(new Canvas(createBitmap));
                        return createBitmap;
                    default:
                        Bitmap createBitmap2 = Bitmap.createBitmap(gcaVar.x().getMeasuredWidth(), gcaVar.x().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        gcaVar.x().draw(new Canvas(createBitmap2));
                        return createBitmap2;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.n = ypa.a(ysaVar, function03);
        final int i2 = 3;
        this.o = 3;
        final int i3 = 1;
        this.p = ypa.a(ysaVar, new Function0(this) { // from class: fca
            public final /* synthetic */ gca b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                gca gcaVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(ao2.u(12, gcaVar.d));
                    case 1:
                        View inflate = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView = (MaterialTextView) inflate;
                        materialTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView.setText(materialTextView.getContext().getString(R.string.reply));
                        materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView.getContext().getDrawable(R.drawable.reply_action), (Drawable) null, (Drawable) null);
                        materialTextView.setTextColor(ColorStateList.valueOf(materialTextView.getContext().getColor(R.color.primary_default)));
                        materialTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView.layout(0, 0, materialTextView.getMeasuredWidth(), materialTextView.getMeasuredHeight());
                        return materialTextView;
                    case 2:
                        View inflate2 = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView2 = (MaterialTextView) inflate2;
                        materialTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView2.setText(materialTextView2.getContext().getString((gcaVar.j || !(gcaVar.e.isAdmin() || gcaVar.e.isModerator())) ? gcaVar.k ? R.string.chat_remove : R.string.chat_report : R.string.chat_actions));
                        materialTextView2.setTextColor(ColorStateList.valueOf(materialTextView2.getContext().getColor(R.color.live)));
                        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView2.getContext().getDrawable(R.drawable.report_action), (Drawable) null, (Drawable) null);
                        materialTextView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView2.layout(0, 0, materialTextView2.getMeasuredWidth(), materialTextView2.getMeasuredHeight());
                        return materialTextView2;
                    case 3:
                        Bitmap createBitmap = Bitmap.createBitmap(gcaVar.w().getMeasuredWidth(), gcaVar.w().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        gcaVar.w().draw(new Canvas(createBitmap));
                        return createBitmap;
                    default:
                        Bitmap createBitmap2 = Bitmap.createBitmap(gcaVar.x().getMeasuredWidth(), gcaVar.x().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        gcaVar.x().draw(new Canvas(createBitmap2));
                        return createBitmap2;
                }
            }
        });
        final int i4 = 2;
        this.q = ypa.a(ysaVar, new Function0(this) { // from class: fca
            public final /* synthetic */ gca b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                gca gcaVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(ao2.u(12, gcaVar.d));
                    case 1:
                        View inflate = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView = (MaterialTextView) inflate;
                        materialTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView.setText(materialTextView.getContext().getString(R.string.reply));
                        materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView.getContext().getDrawable(R.drawable.reply_action), (Drawable) null, (Drawable) null);
                        materialTextView.setTextColor(ColorStateList.valueOf(materialTextView.getContext().getColor(R.color.primary_default)));
                        materialTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView.layout(0, 0, materialTextView.getMeasuredWidth(), materialTextView.getMeasuredHeight());
                        return materialTextView;
                    case 2:
                        View inflate2 = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView2 = (MaterialTextView) inflate2;
                        materialTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView2.setText(materialTextView2.getContext().getString((gcaVar.j || !(gcaVar.e.isAdmin() || gcaVar.e.isModerator())) ? gcaVar.k ? R.string.chat_remove : R.string.chat_report : R.string.chat_actions));
                        materialTextView2.setTextColor(ColorStateList.valueOf(materialTextView2.getContext().getColor(R.color.live)));
                        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView2.getContext().getDrawable(R.drawable.report_action), (Drawable) null, (Drawable) null);
                        materialTextView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView2.layout(0, 0, materialTextView2.getMeasuredWidth(), materialTextView2.getMeasuredHeight());
                        return materialTextView2;
                    case 3:
                        Bitmap createBitmap = Bitmap.createBitmap(gcaVar.w().getMeasuredWidth(), gcaVar.w().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        gcaVar.w().draw(new Canvas(createBitmap));
                        return createBitmap;
                    default:
                        Bitmap createBitmap2 = Bitmap.createBitmap(gcaVar.x().getMeasuredWidth(), gcaVar.x().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        gcaVar.x().draw(new Canvas(createBitmap2));
                        return createBitmap2;
                }
            }
        });
        this.r = ypa.a(ysaVar, new Function0(this) { // from class: fca
            public final /* synthetic */ gca b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                gca gcaVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(ao2.u(12, gcaVar.d));
                    case 1:
                        View inflate = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView = (MaterialTextView) inflate;
                        materialTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView.setText(materialTextView.getContext().getString(R.string.reply));
                        materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView.getContext().getDrawable(R.drawable.reply_action), (Drawable) null, (Drawable) null);
                        materialTextView.setTextColor(ColorStateList.valueOf(materialTextView.getContext().getColor(R.color.primary_default)));
                        materialTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView.layout(0, 0, materialTextView.getMeasuredWidth(), materialTextView.getMeasuredHeight());
                        return materialTextView;
                    case 2:
                        View inflate2 = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView2 = (MaterialTextView) inflate2;
                        materialTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView2.setText(materialTextView2.getContext().getString((gcaVar.j || !(gcaVar.e.isAdmin() || gcaVar.e.isModerator())) ? gcaVar.k ? R.string.chat_remove : R.string.chat_report : R.string.chat_actions));
                        materialTextView2.setTextColor(ColorStateList.valueOf(materialTextView2.getContext().getColor(R.color.live)));
                        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView2.getContext().getDrawable(R.drawable.report_action), (Drawable) null, (Drawable) null);
                        materialTextView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView2.layout(0, 0, materialTextView2.getMeasuredWidth(), materialTextView2.getMeasuredHeight());
                        return materialTextView2;
                    case 3:
                        Bitmap createBitmap = Bitmap.createBitmap(gcaVar.w().getMeasuredWidth(), gcaVar.w().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        gcaVar.w().draw(new Canvas(createBitmap));
                        return createBitmap;
                    default:
                        Bitmap createBitmap2 = Bitmap.createBitmap(gcaVar.x().getMeasuredWidth(), gcaVar.x().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        gcaVar.x().draw(new Canvas(createBitmap2));
                        return createBitmap2;
                }
            }
        });
        final int i5 = 4;
        this.s = ypa.a(ysaVar, new Function0(this) { // from class: fca
            public final /* synthetic */ gca b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                gca gcaVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(ao2.u(12, gcaVar.d));
                    case 1:
                        View inflate = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView = (MaterialTextView) inflate;
                        materialTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView.setText(materialTextView.getContext().getString(R.string.reply));
                        materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView.getContext().getDrawable(R.drawable.reply_action), (Drawable) null, (Drawable) null);
                        materialTextView.setTextColor(ColorStateList.valueOf(materialTextView.getContext().getColor(R.color.primary_default)));
                        materialTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView.layout(0, 0, materialTextView.getMeasuredWidth(), materialTextView.getMeasuredHeight());
                        return materialTextView;
                    case 2:
                        View inflate2 = LayoutInflater.from(gcaVar.d).inflate(R.layout.chat_action_icon, (ViewGroup) null, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        MaterialTextView materialTextView2 = (MaterialTextView) inflate2;
                        materialTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        materialTextView2.setText(materialTextView2.getContext().getString((gcaVar.j || !(gcaVar.e.isAdmin() || gcaVar.e.isModerator())) ? gcaVar.k ? R.string.chat_remove : R.string.chat_report : R.string.chat_actions));
                        materialTextView2.setTextColor(ColorStateList.valueOf(materialTextView2.getContext().getColor(R.color.live)));
                        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, materialTextView2.getContext().getDrawable(R.drawable.report_action), (Drawable) null, (Drawable) null);
                        materialTextView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        materialTextView2.layout(0, 0, materialTextView2.getMeasuredWidth(), materialTextView2.getMeasuredHeight());
                        return materialTextView2;
                    case 3:
                        Bitmap createBitmap = Bitmap.createBitmap(gcaVar.w().getMeasuredWidth(), gcaVar.w().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        gcaVar.w().draw(new Canvas(createBitmap));
                        return createBitmap;
                    default:
                        Bitmap createBitmap2 = Bitmap.createBitmap(gcaVar.x().getMeasuredWidth(), gcaVar.x().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        gcaVar.x().draw(new Canvas(createBitmap2));
                        return createBitmap2;
                }
            }
        });
    }

    @Override // defpackage.bca
    public final int d(int i, int i2) {
        if (!this.l) {
            return super.d(i, i2);
        }
        this.l = false;
        return 0;
    }

    @Override // defpackage.bca
    public final int i(RecyclerView recyclerView, u uVar) {
        recyclerView.getClass();
        uVar.getClass();
        return bca.n(0, this.i == null ? 16 : 48);
    }

    @Override // defpackage.bca
    public final void o(Canvas canvas, RecyclerView recyclerView, u uVar, float f, float f2, int i, boolean z) {
        recyclerView.getClass();
        uVar.getClass();
        if ((uVar instanceof nr2) && this.e.isLoggedIn()) {
            nr2 nr2Var = (nr2) uVar;
            if (s9a.y(nr2Var.d())) {
                return;
            }
            View view = uVar.itemView;
            view.getClass();
            recyclerView.setOnTouchListener(new jm1(1, view, this, recyclerView));
            Float f3 = this.m;
            if (f3 == null && z) {
                f3 = Float.valueOf(f);
            }
            this.m = f3;
            boolean u = u(nr2Var.d());
            boolean c0 = hkg.c0(this.d);
            int i2 = this.o;
            if (z && (u || ((f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !c0) || (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && c0)))) {
                Float f4 = this.m;
                float floatValue = (f - (f4 != null ? f4.floatValue() : 0.0f)) / i2;
                float v = v() + w().getMeasuredWidth();
                if (floatValue > v) {
                    floatValue = v;
                }
                float v2 = (-x().getMeasuredWidth()) - v();
                if (floatValue >= v2) {
                    v2 = floatValue;
                }
                super.o(canvas, recyclerView, uVar, v2, f2, i, true);
            }
            View view2 = uVar.itemView;
            view2.getClass();
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float height = ((view2.getHeight() - w().getMeasuredHeight()) / 2) + view2.getTop();
                float translationX = view2.getTranslationX() - w().getMeasuredWidth();
                Paint paint = new Paint();
                paint.setAlpha((int) ((Math.abs(f / i2) / (v() + w().getMeasuredWidth())) * 255.0f));
                canvas.drawBitmap((Bitmap) this.r.getValue(), translationX, height, paint);
                return;
            }
            float height2 = ((view2.getHeight() - x().getMeasuredHeight()) / 2) + view2.getTop();
            float translationX2 = view2.getTranslationX() + recyclerView.getWidth();
            Paint paint2 = new Paint();
            paint2.setAlpha((int) ((Math.abs(f / i2) / (v() + x().getMeasuredWidth())) * 255.0f));
            canvas.drawBitmap((Bitmap) this.s.getValue(), translationX2, height2, paint2);
        }
    }

    @Override // defpackage.bca
    public final boolean q(RecyclerView recyclerView, u uVar, u uVar2) {
        recyclerView.getClass();
        uVar.getClass();
        return false;
    }

    @Override // defpackage.bca
    public final void t(u uVar, int i) {
        Function1 function1;
        uVar.getClass();
        if ((uVar instanceof nr2) && this.e.isLoggedIn()) {
            nr2 nr2Var = (nr2) uVar;
            if (s9a.y(nr2Var.d())) {
                return;
            }
            if (u(nr2Var.d()) || i != 16) {
                if (((Boolean) this.g.invoke()).booleanValue()) {
                    this.h.invoke();
                    return;
                }
                if (i != 16) {
                    if (i == 32 && (function1 = this.i) != null) {
                        function1.invoke(nr2Var.d());
                        return;
                    }
                    return;
                }
                boolean z = this.j;
                if (z || !(this.e.isAdmin() || this.e.isModerator())) {
                    boolean z2 = this.k;
                    Function2 function2 = this.f;
                    if (z2) {
                        function2.invoke(nr2Var.d(), bq2.b);
                        return;
                    } else {
                        if (z) {
                            return;
                        }
                        function2.invoke(nr2Var.d(), bq2.a);
                        return;
                    }
                }
                ChatUser user = nr2Var.d().getUser();
                if (user == null) {
                    return;
                }
                ChatActionsModal chatActionsModal = new ChatActionsModal(false, this.e.isAdmin(), nr2Var.d().getIsSystem(), Intrinsics.c(user.getId(), this.e.getId()), user, false, new uf8(13, this, uVar));
                Activity activity = this.d;
                activity.getClass();
                rq3 rq3Var = null;
                AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(chatActionsModal, appCompatActivity, rq3Var, 3));
                }
            }
        }
    }

    public final boolean u(Message message) {
        ChatUser user = message.getUser();
        if (user == null || s9a.y(message)) {
            return false;
        }
        boolean z = this.j;
        if ((z || !this.e.isAdmin()) && !this.k) {
            return (z || !this.e.isModerator()) ? (z || user.isModerator() || user.isAdmin() || Intrinsics.c(user.getId(), this.e.getId())) ? false : true : !user.isAdmin();
        }
        return true;
    }

    public final float v() {
        return ((Number) this.n.getValue()).floatValue();
    }

    public final MaterialTextView w() {
        return (MaterialTextView) this.p.getValue();
    }

    public final MaterialTextView x() {
        return (MaterialTextView) this.q.getValue();
    }

    public /* synthetic */ gca(FragmentActivity fragmentActivity, ChatUser chatUser, Function2 function2, Function0 function0, Function0 function02, Function1 function1, int i) {
        this(fragmentActivity, chatUser, function2, function0, function02, function1, (i & 64) == 0, false);
    }
}

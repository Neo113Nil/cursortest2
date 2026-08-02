package com.vk.overlaymenu.feature.report.screenshot;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photo.editor.PhotoEditorView;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b6l;
import xsna.ba00;
import xsna.f5p;
import xsna.g4p;
import xsna.g5z;
import xsna.gzs;
import xsna.hjo;
import xsna.hqu0;
import xsna.l370;
import xsna.lbc0;
import xsna.ld7;
import xsna.lsr;
import xsna.m4p;
import xsna.myc0;
import xsna.n4p;
import xsna.ovj;
import xsna.ozl;
import xsna.qv20;
import xsna.r4p;
import xsna.rte0;
import xsna.s3q0;
import xsna.s3r0;
import xsna.spj;
import xsna.ttk0;
import xsna.wio;
import xsna.wzs;
import xsna.x290;
import xsna.xdl;
import xsna.yvj;

/* compiled from: ScreenshotEditorActivity.kt */
/* loaded from: classes4.dex */
public final class ScreenshotEditorActivity extends ThemableActivity {
    public PhotoEditorView l;
    public com.vk.core.view.components.spinner.c m;
    public final a n = new a();
    public final b o = new b();

    /* compiled from: ScreenshotEditorActivity.kt */
    public static final class b implements n4p {
        @Override // xsna.n4p
        public final void a(Throwable th) {
            l370 l370Var = x290.k;
            if (l370Var == null) {
                l370Var = null;
            }
            l370Var.v(th);
        }

        @Override // xsna.n4p
        public final void b(Object... objArr) {
            l370 l370Var = x290.k;
            if (l370Var == null) {
                l370Var = null;
            }
            l370Var.I(new lbc0(objArr, 12));
        }

        @Override // xsna.n4p
        public final void d(String str) {
            l370 l370Var = x290.k;
            if (l370Var == null) {
                l370Var = null;
            }
            l370Var.getClass();
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"OverlayMenu", str});
        }
    }

    /* compiled from: ScreenshotEditorActivity.kt */
    @b6l(c = "com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$onCreate$1", f = "ScreenshotEditorActivity.kt", l = {SQLiteStatementType.STATEMENT_OTHER}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ PhotoEditorView $editorView;
        int label;

        /* compiled from: ScreenshotEditorActivity.kt */
        @b6l(c = "com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$onCreate$1$1", f = "ScreenshotEditorActivity.kt", l = {100}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ PhotoEditorView $editorView;
            int label;
            final /* synthetic */ ScreenshotEditorActivity this$0;

            /* compiled from: ScreenshotEditorActivity.kt */
            /* renamed from: com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$c$a$a, reason: collision with other inner class name */
            public static final class C1452a<T> implements lsr {
                public final /* synthetic */ ScreenshotEditorActivity b;

                /* compiled from: ScreenshotEditorActivity.kt */
                @b6l(c = "com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$onCreate$1$1$1", f = "ScreenshotEditorActivity.kt", l = {101}, m = "emit")
                /* renamed from: com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$c$a$a$a, reason: collision with other inner class name */
                public static final class C1453a extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C1452a<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C1453a(C1452a<? super T> c1452a, spj<? super C1453a> spjVar) {
                        super(spjVar);
                        this.this$0 = c1452a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                /* compiled from: ScreenshotEditorActivity.kt */
                @b6l(c = "com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$onCreate$1$1$1$path$1", f = "ScreenshotEditorActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$c$a$a$b */
                public static final class b extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
                    final /* synthetic */ ld7 $bitmapWrapper;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(ld7 ld7Var, spj<? super b> spjVar) {
                        super(2, spjVar);
                        this.$bitmapWrapper = ld7Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                        return new b(this.$bitmapWrapper, spjVar);
                    }

                    @Override // xsna.wzs
                    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
                        return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Bitmap bitmap;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        ld7 ld7Var = this.$bitmapWrapper;
                        if (ld7Var == null || (bitmap = ld7Var.a) == null) {
                            return null;
                        }
                        return s3r0.a(bitmap).getPath();
                    }
                }

                public C1452a(ScreenshotEditorActivity screenshotEditorActivity) {
                    this.b = screenshotEditorActivity;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(ld7 ld7Var, spj<? super s3q0> spjVar) {
                    C1453a c1453a;
                    int i;
                    String str;
                    if (spjVar instanceof C1453a) {
                        c1453a = (C1453a) spjVar;
                        int i2 = c1453a.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c1453a.label = i2 - Integer.MIN_VALUE;
                            Object obj = c1453a.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = c1453a.label;
                            if (i != 0) {
                                kotlin.a.a(obj);
                                ovj b2 = hqu0.b();
                                b bVar = new b(ld7Var, null);
                                c1453a.L$0 = null;
                                c1453a.label = 1;
                                obj = myc0.k(b2, bVar, c1453a);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.a.a(obj);
                            }
                            str = (String) obj;
                            if (str != null) {
                                ScreenshotEditorActivity.R1(this.b, str);
                            }
                            return s3q0.a;
                        }
                    }
                    c1453a = new C1453a(this, spjVar);
                    Object obj2 = c1453a.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c1453a.label;
                    if (i != 0) {
                    }
                    str = (String) obj2;
                    if (str != null) {
                    }
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ScreenshotEditorActivity screenshotEditorActivity, PhotoEditorView photoEditorView, spj spjVar) {
                super(2, spjVar);
                this.$editorView = photoEditorView;
                this.this$0 = screenshotEditorActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.this$0, this.$editorView, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    ttk0<ld7> resultBitmap = this.$editorView.getResultBitmap();
                    C1452a c1452a = new C1452a(this.this$0);
                    this.label = 1;
                    if (resultBitmap.collect(c1452a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PhotoEditorView photoEditorView, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$editorView = photoEditorView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ScreenshotEditorActivity.this.new c(this.$editorView, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ScreenshotEditorActivity screenshotEditorActivity = ScreenshotEditorActivity.this;
                Lifecycle.State state = Lifecycle.State.CREATED;
                a aVar = new a(screenshotEditorActivity, this.$editorView, null);
                this.label = 1;
                if (u.a(screenshotEditorActivity, state, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public static final void R1(ScreenshotEditorActivity screenshotEditorActivity, String str) {
        screenshotEditorActivity.getClass();
        Intent intent = new Intent();
        if (str != null) {
            intent.putExtra("edited_screenshot_path", str);
        }
        screenshotEditorActivity.setResult(998128457, intent);
        screenshotEditorActivity.finish();
    }

    @Override // com.vk.core.ui.themes.ThemableActivity
    public final boolean Q1() {
        return true;
    }

    @Override // android.app.Activity
    public final void finish() {
        qv20.b(this.m);
        this.m = null;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onBackPressed() {
        PhotoEditorView photoEditorView = this.l;
        if (photoEditorView == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (photoEditorView.w()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PhotoEditorView photoEditorView = new PhotoEditorView(new ContextThemeWrapper(this, R.style.EditorThemeDark), null, 6);
        photoEditorView.G(new wio.b(0));
        hjo hjoVar = hjo.a;
        PhotoEditorView.n(photoEditorView, hjoVar, new f5p[0]);
        photoEditorView.setListener(this.n);
        b bVar = this.o;
        photoEditorView.setLogger(bVar);
        photoEditorView.r(getViewModelStore(), new xdl(bVar), ba00.b.a, hjoVar);
        Bundle extras = getIntent().getExtras();
        CharSequence charSequence = extras != null ? extras.getCharSequence("screenshot_path") : null;
        if (charSequence == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PhotoEditorView.J(photoEditorView, new g4p(charSequence.toString()));
        this.l = photoEditorView;
        setContentView(photoEditorView);
        getWindow().getDecorView().setTag(37742015, rte0.n);
        myc0.h(g5z.a(this), null, null, new c(photoEditorView, null), 3);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        PhotoEditorView photoEditorView = this.l;
        if (photoEditorView == null) {
            throw new IllegalStateException("Required value was null.");
        }
        photoEditorView.y();
        super.onPause();
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        PhotoEditorView photoEditorView = this.l;
        if (photoEditorView == null) {
            throw new IllegalStateException("Required value was null.");
        }
        photoEditorView.z();
    }

    /* compiled from: ScreenshotEditorActivity.kt */
    public static final class a implements m4p {

        /* compiled from: ScreenshotEditorActivity.kt */
        /* renamed from: com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1451a extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((PhotoEditorView) this.receiver).H();
                return s3q0.a;
            }
        }

        public a() {
        }

        @Override // xsna.m4p
        public final void a(r4p r4pVar) {
            ScreenshotEditorActivity screenshotEditorActivity = ScreenshotEditorActivity.this;
            PhotoEditorView photoEditorView = screenshotEditorActivity.l;
            if (photoEditorView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (!photoEditorView.o()) {
                ScreenshotEditorActivity.R1(screenshotEditorActivity, null);
                return;
            }
            C1451a c1451a = new C1451a(0, photoEditorView, PhotoEditorView.class, "renderResultImage", "renderResultImage()V", 0);
            com.vk.core.view.components.spinner.c e = qv20.e(screenshotEditorActivity, null);
            e.setCanceledOnTouchOutside(false);
            e.show();
            screenshotEditorActivity.m = e;
            c1451a.invoke();
        }

        @Override // xsna.m4p
        public final void c() {
            ScreenshotEditorActivity.R1(ScreenshotEditorActivity.this, null);
        }

        @Override // xsna.m4p
        public final void onLowMemory() {
        }

        @Override // xsna.m4p
        public final void b(boolean z) {
        }
    }
}

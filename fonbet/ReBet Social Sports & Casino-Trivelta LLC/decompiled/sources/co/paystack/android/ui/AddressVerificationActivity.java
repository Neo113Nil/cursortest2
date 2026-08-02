package co.paystack.android.ui;

import Ph.A;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.G0;
import Ph.P;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListPopupWindow;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import co.paystack.android.ui.a;
import com.facebook.react.modules.dialog.AlertFragment;
import i3.AbstractC4522c;
import i3.AbstractC4523d;
import i3.AbstractC4524e;
import i3.AbstractC4525f;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import l3.InterfaceC5397b;
import m.AbstractActivityC5481c;
import p3.C6042a;
import q3.AbstractC6109a;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0001pB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010+\u001a\n $*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R#\u00106\u001a\n $*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R#\u00109\u001a\n $*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00105R#\u0010<\u001a\n $*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u00105R#\u0010?\u001a\n $*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00105R#\u0010D\u001a\n $*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bB\u0010CR#\u0010I\u001a\n $*\u0004\u0018\u00010E0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u0010HR#\u0010L\u001a\n $*\u0004\u0018\u00010E0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\bK\u0010HR#\u0010Q\u001a\n $*\u0004\u0018\u00010M0M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010.\u001a\u0004\bO\u0010PR#\u0010V\u001a\n $*\u0004\u0018\u00010R0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010.\u001a\u0004\bT\u0010UR#\u0010[\u001a\n $*\u0004\u0018\u00010W0W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010.\u001a\u0004\bY\u0010ZR7\u0010d\u001a\b\u0012\u0004\u0012\u00020\\0\u00172\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR/\u0010j\u001a\u0004\u0018\u00010\\2\b\u0010]\u001a\u0004\u0018\u00010\\8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006q"}, d2 = {"Lco/paystack/android/ui/AddressVerificationActivity;", "Lm/c;", "LPh/P;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "h0", "j0", "", "countryCode", "e0", "(Ljava/lang/String;)V", "Lco/paystack/android/ui/a$a;", "address", "i0", "(Lco/paystack/android/ui/a$a;)V", "Landroid/view/View;", "anchorView", "", AlertFragment.ARG_ITEMS, "Lkotlin/Function1;", "", "onItemClickListener", "Landroid/widget/ListPopupWindow;", "d0", "(Landroid/view/View;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Landroid/widget/ListPopupWindow;", "LPh/C0;", "f", "LPh/C0;", "job", "Lco/paystack/android/ui/a;", "kotlin.jvm.PlatformType", "g", "Lco/paystack/android/ui/a;", "addressHolder", "", C4527h.f48087o, "Ljava/lang/Object;", "lock", "Ll3/b;", com.google.android.material.shape.i.f35755A, "Lkotlin/Lazy;", "Z", "()Ll3/b;", "paystackApiService", "Landroid/widget/EditText;", "j", "W", "()Landroid/widget/EditText;", "etState", "k", "X", "etStreet", "l", "V", "etCity", X9.m.f13664a, "Y", "etZipCode", "Landroid/widget/TextView;", "n", "c0", "()Landroid/widget/TextView;", "tvError", "Landroid/widget/Button;", "o", "T", "()Landroid/widget/Button;", "btnRetry", "p", "S", "btnConfirm", "Landroid/widget/LinearLayout;", "q", "U", "()Landroid/widget/LinearLayout;", "errorContainer", "Landroid/widget/ScrollView;", "r", "R", "()Landroid/widget/ScrollView;", "avsForm", "Landroid/widget/ProgressBar;", "s", "a0", "()Landroid/widget/ProgressBar;", "pbLoadingStates", "Lq3/a;", "<set-?>", "t", "Lkotlin/properties/ReadWriteProperty;", "getStates", "()Ljava/util/List;", "g0", "(Ljava/util/List;)V", "states", "u", "b0", "()Lq3/a;", "f0", "(Lq3/a;)V", "selectedState", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "v", "c", "paystack_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AddressVerificationActivity extends AbstractActivityC5481c implements P {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(AddressVerificationActivity.class), "states", "getStates()Ljava/util/List;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(AddressVerificationActivity.class), "selectedState", "getSelectedState()Lco/paystack/android/model/AvsState;"))};

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public C0 job;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final co.paystack.android.ui.a addressHolder = co.paystack.android.ui.a.b();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Object lock = co.paystack.android.ui.a.c();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Lazy paystackApiService = LazyKt.lazy(n.f28058d);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Lazy etState = LazyKt.lazy(new i());

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final Lazy etStreet = LazyKt.lazy(new j());

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Lazy etCity = LazyKt.lazy(new h());

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final Lazy etZipCode = LazyKt.lazy(new k());

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Lazy tvError = LazyKt.lazy(new s());

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final Lazy btnRetry = LazyKt.lazy(new f());

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Lazy btnConfirm = LazyKt.lazy(new e());

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final Lazy errorContainer = LazyKt.lazy(new g());

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final Lazy avsForm = LazyKt.lazy(new d());

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final Lazy pbLoadingStates = LazyKt.lazy(new o());

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final ReadWriteProperty states;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final ReadWriteProperty selectedState;

    public static final class a extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f28035a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AddressVerificationActivity f28036b;

        /* renamed from: co.paystack.android.ui.AddressVerificationActivity$a$a, reason: collision with other inner class name */
        public static final class C0452a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List f28037d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f28038e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0452a(List list, a aVar) {
                super(1);
                this.f28037d = list;
                this.f28038e = aVar;
            }

            public final void a(int i10) {
                AddressVerificationActivity addressVerificationActivity = this.f28038e.f28036b;
                android.support.v4.media.session.b.a(this.f28037d.get(i10));
                addressVerificationActivity.f0(null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).intValue());
                return Unit.INSTANCE;
            }
        }

        public static final class b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ListPopupWindow f28039a;

            public b(ListPopupWindow listPopupWindow) {
                this.f28039a = listPopupWindow;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28039a.show();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, AddressVerificationActivity addressVerificationActivity) {
            super(obj2);
            this.f28035a = obj;
            this.f28036b = addressVerificationActivity;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkParameterIsNotNull(property, "property");
            List list = (List) obj2;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            AddressVerificationActivity addressVerificationActivity = this.f28036b;
            EditText etState = addressVerificationActivity.W();
            Intrinsics.checkExpressionValueIsNotNull(etState, "etState");
            this.f28036b.W().setOnClickListener(new b(addressVerificationActivity.d0(etState, arrayList, new C0452a(list, this))));
        }
    }

    public static final class b extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f28040a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AddressVerificationActivity f28041b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, AddressVerificationActivity addressVerificationActivity) {
            super(obj2);
            this.f28040a = obj;
            this.f28041b = addressVerificationActivity;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkParameterIsNotNull(property, "property");
            android.support.v4.media.session.b.a(obj2);
            android.support.v4.media.session.b.a(obj);
            this.f28041b.W().setText((CharSequence) null);
            this.f28041b.j0();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ScrollView invoke() {
            return (ScrollView) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48061a);
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Button invoke() {
            return (Button) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48062b);
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Button invoke() {
            return (Button) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48063c);
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinearLayout invoke() {
            return (LinearLayout) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48069i);
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48070j);
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48071k);
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48072l);
        }
    }

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48073m);
        }
    }

    public static final class l implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f28050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ListPopupWindow f28051b;

        public l(Function1 function1, ListPopupWindow listPopupWindow) {
            this.f28050a = function1;
            this.f28051b = listPopupWindow;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            this.f28050a.invoke(Integer.valueOf(i10));
            this.f28051b.dismiss();
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public P f28052n;

        /* renamed from: o, reason: collision with root package name */
        public Object f28053o;

        /* renamed from: p, reason: collision with root package name */
        public Object f28054p;

        /* renamed from: q, reason: collision with root package name */
        public int f28055q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f28057s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, Continuation continuation) {
            super(2, continuation);
            this.f28057s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            m mVar = AddressVerificationActivity.this.new m(this.f28057s, completion);
            mVar.f28052n = (P) obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((m) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AddressVerificationActivity addressVerificationActivity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f28055q;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    P p10 = this.f28052n;
                    AddressVerificationActivity addressVerificationActivity2 = AddressVerificationActivity.this;
                    InterfaceC5397b Z10 = addressVerificationActivity2.Z();
                    String str = this.f28057s;
                    this.f28053o = p10;
                    this.f28054p = addressVerificationActivity2;
                    this.f28055q = 1;
                    obj = Z10.a(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    addressVerificationActivity = addressVerificationActivity2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    addressVerificationActivity = (AddressVerificationActivity) this.f28054p;
                    ResultKt.throwOnFailure(obj);
                }
                addressVerificationActivity.g0((List) obj);
                LinearLayout errorContainer = AddressVerificationActivity.this.U();
                Intrinsics.checkExpressionValueIsNotNull(errorContainer, "errorContainer");
                errorContainer.setVisibility(8);
                ScrollView avsForm = AddressVerificationActivity.this.R();
                Intrinsics.checkExpressionValueIsNotNull(avsForm, "avsForm");
                avsForm.setVisibility(0);
                ProgressBar pbLoadingStates = AddressVerificationActivity.this.a0();
                Intrinsics.checkExpressionValueIsNotNull(pbLoadingStates, "pbLoadingStates");
                pbLoadingStates.setVisibility(8);
            } catch (Throwable th2) {
                Log.e("AddressVerificationActi", th2.getMessage(), th2);
                TextView tvError = AddressVerificationActivity.this.c0();
                Intrinsics.checkExpressionValueIsNotNull(tvError, "tvError");
                tvError.setText(AddressVerificationActivity.this.getString(AbstractC4525f.f48084a));
                LinearLayout errorContainer2 = AddressVerificationActivity.this.U();
                Intrinsics.checkExpressionValueIsNotNull(errorContainer2, "errorContainer");
                errorContainer2.setVisibility(0);
                ScrollView avsForm2 = AddressVerificationActivity.this.R();
                Intrinsics.checkExpressionValueIsNotNull(avsForm2, "avsForm");
                avsForm2.setVisibility(8);
                ProgressBar pbLoadingStates2 = AddressVerificationActivity.this.a0();
                Intrinsics.checkExpressionValueIsNotNull(pbLoadingStates2, "pbLoadingStates");
                pbLoadingStates2.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final n f28058d = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5397b invoke() {
            return C6042a.f63028a.a();
        }
    }

    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProgressBar invoke() {
            return (ProgressBar) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48074n);
        }
    }

    public static final class p implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28061b;

        public p(String str) {
            this.f28061b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AddressVerificationActivity.this.e0(this.f28061b);
        }
    }

    public static final class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.C0453a c0453a = new a.C0453a();
            EditText etStreet = AddressVerificationActivity.this.X();
            Intrinsics.checkExpressionValueIsNotNull(etStreet, "etStreet");
            c0453a.c(etStreet.getText().toString());
            EditText etCity = AddressVerificationActivity.this.V();
            Intrinsics.checkExpressionValueIsNotNull(etCity, "etCity");
            c0453a.a(etCity.getText().toString());
            EditText etZipCode = AddressVerificationActivity.this.Y();
            Intrinsics.checkExpressionValueIsNotNull(etZipCode, "etZipCode");
            c0453a.d(etZipCode.getText().toString());
            AddressVerificationActivity.I(AddressVerificationActivity.this);
            c0453a.b(null);
            AddressVerificationActivity.this.i0(c0453a);
        }
    }

    public static final class r implements TextWatcher {
        public r() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AddressVerificationActivity.this.j0();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) AddressVerificationActivity.this.findViewById(AbstractC4523d.f48076p);
        }
    }

    public AddressVerificationActivity() {
        Delegates delegates = Delegates.INSTANCE;
        List emptyList = CollectionsKt.emptyList();
        this.states = new a(emptyList, emptyList, this);
        this.selectedState = new b(null, null, this);
    }

    public static final /* synthetic */ AbstractC6109a I(AddressVerificationActivity addressVerificationActivity) {
        addressVerificationActivity.b0();
        return null;
    }

    public final ScrollView R() {
        return (ScrollView) this.avsForm.getValue();
    }

    public final Button S() {
        return (Button) this.btnConfirm.getValue();
    }

    public final Button T() {
        return (Button) this.btnRetry.getValue();
    }

    public final LinearLayout U() {
        return (LinearLayout) this.errorContainer.getValue();
    }

    public final EditText V() {
        return (EditText) this.etCity.getValue();
    }

    public final EditText W() {
        return (EditText) this.etState.getValue();
    }

    public final EditText X() {
        return (EditText) this.etStreet.getValue();
    }

    public final EditText Y() {
        return (EditText) this.etZipCode.getValue();
    }

    public final InterfaceC5397b Z() {
        return (InterfaceC5397b) this.paystackApiService.getValue();
    }

    public final ProgressBar a0() {
        return (ProgressBar) this.pbLoadingStates.getValue();
    }

    public final AbstractC6109a b0() {
        android.support.v4.media.session.b.a(this.selectedState.getValue(this, $$delegatedProperties[1]));
        return null;
    }

    public final TextView c0() {
        return (TextView) this.tvError.getValue();
    }

    public final ListPopupWindow d0(View anchorView, List items, Function1 onItemClickListener) {
        ListPopupWindow listPopupWindow = new ListPopupWindow(this, null, AbstractC4522c.f48060a);
        listPopupWindow.setAdapter(new ArrayAdapter(this, AbstractC4524e.f48083f, items));
        listPopupWindow.setAnchorView(anchorView);
        listPopupWindow.setOnItemClickListener(new l(onItemClickListener, listPopupWindow));
        return listPopupWindow;
    }

    public final void e0(String countryCode) {
        LinearLayout errorContainer = U();
        Intrinsics.checkExpressionValueIsNotNull(errorContainer, "errorContainer");
        errorContainer.setVisibility(8);
        ScrollView avsForm = R();
        Intrinsics.checkExpressionValueIsNotNull(avsForm, "avsForm");
        avsForm.setVisibility(8);
        ProgressBar pbLoadingStates = a0();
        Intrinsics.checkExpressionValueIsNotNull(pbLoadingStates, "pbLoadingStates");
        pbLoadingStates.setVisibility(0);
        AbstractC1459k.d(this, getCoroutineContext(), null, new m(countryCode, null), 2, null);
    }

    public final void f0(AbstractC6109a abstractC6109a) {
        this.selectedState.setValue(this, $$delegatedProperties[1], abstractC6109a);
    }

    public final void g0(List list) {
        this.states.setValue(this, $$delegatedProperties[0], list);
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        C0 c02 = this.job;
        if (c02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("job");
        }
        return c02.plus(C1452g0.c());
    }

    public final void h0() {
        r rVar = new r();
        X().addTextChangedListener(rVar);
        V().addTextChangedListener(rVar);
        Y().addTextChangedListener(rVar);
        String stringExtra = getIntent().getStringExtra("country_code");
        if (stringExtra == null) {
            Intrinsics.throwNpe();
        }
        T().setOnClickListener(new p(stringExtra));
        e0(stringExtra);
        S().setOnClickListener(new q());
    }

    public final void i0(a.C0453a address) {
        Object lock = this.lock;
        Intrinsics.checkExpressionValueIsNotNull(lock, "lock");
        synchronized (lock) {
            co.paystack.android.ui.a addressHolder = this.addressHolder;
            Intrinsics.checkExpressionValueIsNotNull(addressHolder, "addressHolder");
            addressHolder.d(address);
            Object obj = this.lock;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
            }
            obj.notify();
            Unit unit = Unit.INSTANCE;
        }
        finish();
    }

    public final void j0() {
        EditText etStreet = X();
        Intrinsics.checkExpressionValueIsNotNull(etStreet, "etStreet");
        Editable text = etStreet.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "etStreet.text");
        if (!StringsKt.isBlank(text)) {
            EditText etCity = V();
            Intrinsics.checkExpressionValueIsNotNull(etCity, "etCity");
            if (!StringsKt.isBlank(etCity.getText().toString())) {
                EditText etZipCode = Y();
                Intrinsics.checkExpressionValueIsNotNull(etZipCode, "etZipCode");
                if (!StringsKt.isBlank(etZipCode.getText().toString())) {
                    b0();
                }
            }
        }
        Button btnConfirm = S();
        Intrinsics.checkExpressionValueIsNotNull(btnConfirm, "btnConfirm");
        btnConfirm.setEnabled(false);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        A b10;
        super.onCreate(savedInstanceState);
        b10 = G0.b(null, 1, null);
        this.job = b10;
        setContentView(AbstractC4524e.f48079b);
        getWindow().addFlags(128);
        h0();
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i0(null);
        C0 c02 = this.job;
        if (c02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("job");
        }
        C0.a.b(c02, null, 1, null);
    }
}

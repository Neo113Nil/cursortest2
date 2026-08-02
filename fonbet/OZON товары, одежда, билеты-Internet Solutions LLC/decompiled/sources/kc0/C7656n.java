package kc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import android.widget.TextView;
import kc0.InterfaceC7641O;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$lambda$10$$inlined$collectFlow$4", f = "EntryCredentialsFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: kc0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7656n extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71358d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f71359e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7645c f71360f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.m f71361g;

    /* renamed from: kc0.n$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7645c f71362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Jb0.m f71363b;

        public a(C7645c c7645c, Jb0.m mVar) {
            this.f71362a = c7645c;
            this.f71363b = mVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            String str;
            EntryDTO.InputDTO.ErrorButton a11;
            InterfaceC7641O interfaceC7641O = (InterfaceC7641O) t2;
            C7645c c7645c = this.f71362a;
            if (interfaceC7641O instanceof InterfaceC7641O.c) {
                a11 = null;
                str = null;
            } else if (interfaceC7641O instanceof InterfaceC7641O.a) {
                InterfaceC7641O.a aVar = (InterfaceC7641O.a) interfaceC7641O;
                str = aVar.b();
                a11 = aVar.a();
            } else {
                if (!(interfaceC7641O instanceof InterfaceC7641O.b)) {
                    throw new Sc.o();
                }
                InterfaceC7641O.b bVar = (InterfaceC7641O.b) interfaceC7641O;
                String b11 = bVar.b();
                if (b11 == null) {
                    str = c7645c.getString(R.string.ozonid_error_technical_error_title);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                } else {
                    str = b11;
                }
                a11 = bVar.a();
            }
            Jb0.m mVar = this.f71363b;
            TextFieldCellView textFieldCellView = mVar.f14504e;
            textFieldCellView.setLabelText(str);
            textFieldCellView.setInputStatus(str == null ? OzonTextInputLayoutModel.Status.NEUTRAL : OzonTextInputLayoutModel.Status.ERROR);
            String title = a11 != null ? a11.getTitle() : null;
            TextView textView = mVar.f14506g;
            textView.setText(title);
            textView.setVisibility(a11 != null ? 0 : 8);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7656n(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C7645c c7645c, Jb0.m mVar) {
        super(2, dVar);
        this.f71359e = interfaceC2395h;
        this.f71360f = c7645c;
        this.f71361g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7656n(this.f71359e, dVar, this.f71360f, this.f71361g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7656n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71358d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f71360f, this.f71361g);
            this.f71358d = 1;
            if (this.f71359e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}

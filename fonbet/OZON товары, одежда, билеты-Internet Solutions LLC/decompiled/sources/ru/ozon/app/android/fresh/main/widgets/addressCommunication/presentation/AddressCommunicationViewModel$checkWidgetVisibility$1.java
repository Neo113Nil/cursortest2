package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import Sc.s;
import Wc.a;
import android.location.Location;
import androidx.lifecycle.V;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.AddressCommunicationApi;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.AddressCommunicationResponse;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.LocationInfo;
import ru.ozon.app.android.location.LocationRepository;
import sc.C9656b;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewModel$checkWidgetVisibility$1", f = "AddressCommunicationViewModel.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressCommunicationViewModel$checkWidgetVisibility$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AddressCommunicationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCommunicationViewModel$checkWidgetVisibility$1(AddressCommunicationViewModel addressCommunicationViewModel, d<? super AddressCommunicationViewModel$checkWidgetVisibility$1> dVar) {
        super(2, dVar);
        this.this$0 = addressCommunicationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressCommunicationViewModel$checkWidgetVisibility$1(this.this$0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V v11;
        LocationRepository locationRepository;
        LocationRepository locationRepository2;
        LocationInfo createLocationInfo;
        V v12;
        AddressCommunicationApi addressCommunicationApi;
        V v13;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                locationRepository = this.this$0.locationRepository;
                if (locationRepository.hasLocationPermission()) {
                    locationRepository2 = this.this$0.locationRepository;
                    y lastLocation$default = LocationRepository.DefaultImpls.getLastLocation$default(locationRepository2, false, 1, null);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    lastLocation$default.getClass();
                    x a11 = Mc.a.a();
                    C9656b.c(timeUnit, "unit is null");
                    C9656b.c(a11, "scheduler is null");
                    Location location = (Location) new Bc.x(lastLocation$default, 5000L, a11).d();
                    createLocationInfo = this.this$0.createLocationInfo(location.getLatitude(), location.getLongitude());
                } else {
                    createLocationInfo = this.this$0.createLocationInfo(0.0d, 0.0d);
                }
                v12 = this.this$0._shouldShow;
                addressCommunicationApi = this.this$0.api;
                this.L$0 = v12;
                this.label = 1;
                obj = addressCommunicationApi.shouldShowWidget(createLocationInfo, this);
                if (obj == aVar) {
                    return aVar;
                }
                v13 = v12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v13 = (V) this.L$0;
                s.b(obj);
            }
            v13.postValue(Boolean.valueOf(((AddressCommunicationResponse) obj).getShow()));
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            v11 = this.this$0._shouldShow;
            v11.postValue(Boolean.FALSE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressCommunicationViewModel$checkWidgetVisibility$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

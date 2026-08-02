package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B90.C2618u;
import Sc.o;
import Sc.r;
import Sc.s;
import Xc.a;
import Xc.b;
import android.os.Parcelable;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data.AdditionalServicesDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data.AdditionalServicesMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesControlActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesInfoActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0096\u0001\u0097\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u000eJ#\u0010\u001c\u001a\u00020\n2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b\u001c\u0010!J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001c\u0010#J;\u0010,\u001a\u00020\n*\u00020$2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0006\u0010)\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J/\u0010,\u001a\u00020\n*\u00020.2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b,\u0010/J/\u0010,\u001a\u00020\n*\u0002002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b,\u00101J;\u0010,\u001a\u00020\n*\u00020\u00132\b\u00102\u001a\u0004\u0018\u00010&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b,\u00103J#\u0010,\u001a\u00020\n*\u00020\u00162\u0006\u0010)\u001a\u00020&2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b,\u00106JJ\u0010<\u001a\u00020\n2\u0006\u0010)\u001a\u00020&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0006\u00107\u001a\u00020\u001f2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08H\u0082@¢\u0006\u0004\b<\u0010=J`\u0010C\u001a\u00020\n2\u0006\u0010)\u001a\u00020&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0006\u0010?\u001a\u00020>2\u0006\u00107\u001a\u00020\u001f2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0AH\u0082@¢\u0006\u0004\bC\u0010DJ$\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0EH\u0082@¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020L2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ#\u0010S\u001a\u00020P2\u0006\u0010Q\u001a\u00020P2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010Y\u001a\u00020U2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ'\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010[\u001a\u00020IH\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u0004\u0018\u00010^2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u001eH\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020^2\u0006\u0010b\u001a\u00020^H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020^2\u0006\u0010b\u001a\u00020^H\u0002¢\u0006\u0004\be\u0010dJ3\u0010h\u001a\b\u0012\u0004\u0012\u00020^0\u001e2\u0006\u0010f\u001a\u00020^2\u0006\u0010g\u001a\u00020^2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u001eH\u0002¢\u0006\u0004\bh\u0010iJ\u001f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\bj\u0010kJ1\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010n\u001a\u000209H\u0002¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR \u0010s\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010u\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010tR \u0010v\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010tR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\b0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR \u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0{0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R&\u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0{0~8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\n0z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010}R\"\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001f088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010tR*\u0010\u0086\u0001\u001a\u0011\u0012\u0004\u0012\u000209\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0001088\u0006¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010t\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010[\u001a\t\u0012\u0004\u0012\u00020\b0\u0089\u00018F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R(\u0010\u0092\u0001\u001a\u00020\b2\u0006\u0010[\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\u000f\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0005\b\u0091\u0001\u0010\fR\u0017\u0010\u0095\u0001\u001a\u00020I8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0098\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesMapper;", "mapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesMapper;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "vo", "", "onBindWidgetViewHolder", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;)V", "onShowMoreButtonClicked", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper;", "actionWrapper", "onControlActionWrapperClicked", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;", "onTariffActionWrapperClicked", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesInfoActionWrapper;", "onInfoActionWrapperClicked", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesInfoActionWrapper;)V", "onModalDismiss", "Lkotlin/Function1;", "reducer", "setState", "(Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "newCells", "(Ljava/util/List;)V", "newCell", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper$Button;", "", "", "", "params", "asyncData", "", "withWaitingModalDismiss", "handleAction", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper$Button;Ljava/util/Map;Ljava/lang/String;Z)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper$Toggle;", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper$Toggle;Ljava/util/Map;Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper$Counter;", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper$Counter;Ljava/util/Map;Ljava/lang/String;)V", "actionId", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "controlType", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesInfoActionWrapper;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;)V", "oldCellVO", "", "", "Lxe/B0;", "jobs", "fetchWithJobsMap", "(Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lxe/M;", "scope", "onSuccess", "Lkotlin/Function0;", "onFailure", "handleFetchResult", "(Ljava/lang/String;Ljava/util/Map;Lxe/M;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO;", "response", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "mapAsyncWidgetResponse", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;", "button", "getNewButton", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;", "toggle", "isSelected", "getNewToggle", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;Ljava/lang/Boolean;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;", "counter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTO", "getNewCounterInput", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;", "state", "getNewCells", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "tariffs", "findSelectedTariff", "(Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "tariff", "getSelectedTariff", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "getEnabledTariff", "oldTariff", "newTariff", "getNewTariffs", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;Ljava/util/List;)Ljava/util/List;", "cacheCells", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "showMoreButton", "cellsCount", "updateSeparatorsVisibility", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;I)Ljava/util/List;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesMapper;", "controlsFetchJobs", "Ljava/util/Map;", "tariffsFetchJobs", "modalDismissFetchJobs", "LAe/x0;", "stateFlow", "LAe/x0;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;", "eventFlow", "LAe/w0;", "LAe/B0;", "event", "LAe/B0;", "getEvent", "()LAe/B0;", "modalDismissFlow", "cachedCells", "Landroid/os/Parcelable;", "tariffScrollStates", "getTariffScrollStates", "()Ljava/util/Map;", "LAe/M0;", "getState", "()LAe/M0;", "getHasRunningJobs", "()Z", "hasRunningJobs", "getViewState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "setViewState", "viewState", "getLoadedState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "loadedState", "ActionId", "Event", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesViewModel extends w0 {

    @NotNull
    private final Map<Integer, AdditionalServicesCellVO> cachedCells;

    @NotNull
    private final Map<Integer, B0> controlsFetchJobs;

    @NotNull
    private final Ae.B0<Event<AdditionalServicesVO.State.Loaded>> event;

    @NotNull
    private final Ae.w0<Event<AdditionalServicesVO.State.Loaded>> eventFlow;

    @NotNull
    private final AdditionalServicesMapper mapper;

    @NotNull
    private final Map<Integer, B0> modalDismissFetchJobs;

    @NotNull
    private final Ae.w0<Unit> modalDismissFlow;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final x0<AdditionalServicesVO> stateFlow;

    @NotNull
    private final Map<Integer, Parcelable> tariffScrollStates;

    @NotNull
    private final Map<Integer, B0> tariffsFetchJobs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$ActionId;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "FETCH_ASYNC_STATE", "SHOW_MORE_SERVICES", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionId {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionId[] $VALUES;
        public static final ActionId FETCH_ASYNC_STATE = new ActionId("FETCH_ASYNC_STATE", 0, "fetchAsyncState");
        public static final ActionId SHOW_MORE_SERVICES = new ActionId("SHOW_MORE_SERVICES", 1, "showMoreServices");

        @NotNull
        private final String id;

        private static final /* synthetic */ ActionId[] $values() {
            return new ActionId[]{FETCH_ASYNC_STATE, SHOW_MORE_SERVICES};
        }

        static {
            ActionId[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ActionId(String str, int i11, String str2) {
            this.id = str2;
        }

        public static ActionId valueOf(String str) {
            return (ActionId) Enum.valueOf(ActionId.class, str);
        }

        public static ActionId[] values() {
            return (ActionId[]) $VALUES.clone();
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;", "VO", "", "OnWidgetJobsCountChanged", "OnWidgetFetched", "OnWidgetFetchingFailed", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event$OnWidgetFetchingFailed;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event$OnWidgetJobsCountChanged;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Event<VO> {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event$OnWidgetFetched;", "VO", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "getFetchedModel", "()Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetFetched<VO> implements Event<VO> {

            @NotNull
            private final AsyncWidgetFetchedModel<VO> fetchedModel;

            public OnWidgetFetched(@NotNull AsyncWidgetFetchedModel<VO> fetchedModel) {
                Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
                this.fetchedModel = fetchedModel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnWidgetFetched) && Intrinsics.d(this.fetchedModel, ((OnWidgetFetched) other).fetchedModel);
            }

            @NotNull
            public final AsyncWidgetFetchedModel<VO> getFetchedModel() {
                return this.fetchedModel;
            }

            public int hashCode() {
                return this.fetchedModel.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnWidgetFetched(fetchedModel=" + this.fetchedModel + ")";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event$OnWidgetFetchingFailed;", "VO", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetFetchingFailed<VO> implements Event<VO> {

            @NotNull
            private final Throwable throwable;

            public OnWidgetFetchingFailed(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnWidgetFetchingFailed) && Intrinsics.d(this.throwable, ((OnWidgetFetchingFailed) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return D40.a.c("OnWidgetFetchingFailed(throwable=", ")", this.throwable);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event$OnWidgetJobsCountChanged;", "VO", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;", "", "hasRunningJobs", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasRunningJobs", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetJobsCountChanged<VO> implements Event<VO> {
            private final boolean hasRunningJobs;

            public OnWidgetJobsCountChanged(boolean z11) {
                this.hasRunningJobs = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnWidgetJobsCountChanged) && this.hasRunningJobs == ((OnWidgetJobsCountChanged) other).hasRunningJobs;
            }

            public final boolean getHasRunningJobs() {
                return this.hasRunningJobs;
            }

            public int hashCode() {
                return Boolean.hashCode(this.hasRunningJobs);
            }

            @NotNull
            public String toString() {
                return C2618u.g("OnWidgetJobsCountChanged(hasRunningJobs=", ")", this.hasRunningJobs);
            }
        }
    }

    public AdditionalServicesViewModel(@NotNull ComposerAsyncWidgetRepository repository, @NotNull AdditionalServicesMapper mapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.repository = repository;
        this.mapper = mapper;
        this.controlsFetchJobs = new LinkedHashMap();
        this.tariffsFetchJobs = new LinkedHashMap();
        this.modalDismissFetchJobs = new LinkedHashMap();
        this.stateFlow = O0.a(AdditionalServicesVO.INSTANCE.getInitialVO());
        C0 b11 = E0.b(0, 0, null, 7);
        this.eventFlow = b11;
        this.event = C2399j.a(b11);
        this.modalDismissFlow = E0.b(0, 0, null, 7);
        this.cachedCells = new LinkedHashMap();
        this.tariffScrollStates = new LinkedHashMap();
    }

    private final List<AdditionalServicesCellVO> cacheCells(List<AdditionalServicesCellVO> list) {
        for (AdditionalServicesCellVO additionalServicesCellVO : list) {
            this.cachedCells.put(Integer.valueOf(additionalServicesCellVO.getId()), additionalServicesCellVO);
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWithJobsMap(String str, Map<String, ? extends Object> map, AdditionalServicesCellVO additionalServicesCellVO, Map<Integer, B0> map2, d<? super Unit> dVar) {
        AdditionalServicesViewModel$fetchWithJobsMap$1 additionalServicesViewModel$fetchWithJobsMap$1;
        int i11;
        B0 c11;
        AdditionalServicesCellVO additionalServicesCellVO2;
        AdditionalServicesViewModel additionalServicesViewModel;
        Map<Integer, B0> map3 = map2;
        if (dVar instanceof AdditionalServicesViewModel$fetchWithJobsMap$1) {
            additionalServicesViewModel$fetchWithJobsMap$1 = (AdditionalServicesViewModel$fetchWithJobsMap$1) dVar;
            int i12 = additionalServicesViewModel$fetchWithJobsMap$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                additionalServicesViewModel$fetchWithJobsMap$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = additionalServicesViewModel$fetchWithJobsMap$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = additionalServicesViewModel$fetchWithJobsMap$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    B0 b02 = map3.get(new Integer(additionalServicesCellVO.getId()));
                    if (b02 != null) {
                        b02.j(null);
                    }
                    c11 = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$fetchWithJobsMap$2$1(this, str, map, additionalServicesCellVO, additionalServicesCellVO, null), 3);
                    map3.put(new Integer(additionalServicesCellVO.getId()), c11);
                    Ae.w0<Event<AdditionalServicesVO.State.Loaded>> w0Var = this.eventFlow;
                    Event.OnWidgetJobsCountChanged onWidgetJobsCountChanged = new Event.OnWidgetJobsCountChanged(getHasRunningJobs());
                    additionalServicesViewModel$fetchWithJobsMap$1.L$0 = this;
                    additionalServicesViewModel$fetchWithJobsMap$1.L$1 = map3;
                    additionalServicesCellVO2 = additionalServicesCellVO;
                    additionalServicesViewModel$fetchWithJobsMap$1.L$2 = additionalServicesCellVO2;
                    additionalServicesViewModel$fetchWithJobsMap$1.L$3 = c11;
                    additionalServicesViewModel$fetchWithJobsMap$1.L$4 = c11;
                    additionalServicesViewModel$fetchWithJobsMap$1.label = 1;
                    if (w0Var.emit(onWidgetJobsCountChanged, additionalServicesViewModel$fetchWithJobsMap$1) == aVar) {
                        return aVar;
                    }
                    additionalServicesViewModel = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c11 = (B0) additionalServicesViewModel$fetchWithJobsMap$1.L$4;
                    AdditionalServicesCellVO additionalServicesCellVO3 = (AdditionalServicesCellVO) additionalServicesViewModel$fetchWithJobsMap$1.L$2;
                    map3 = (Map) additionalServicesViewModel$fetchWithJobsMap$1.L$1;
                    additionalServicesViewModel = (AdditionalServicesViewModel) additionalServicesViewModel$fetchWithJobsMap$1.L$0;
                    s.b(obj);
                    additionalServicesCellVO2 = additionalServicesCellVO3;
                }
                c11.y(new AdditionalServicesViewModel$fetchWithJobsMap$2$2$1(map3, additionalServicesCellVO2, additionalServicesViewModel));
                return Unit.f71690a;
            }
        }
        additionalServicesViewModel$fetchWithJobsMap$1 = new AdditionalServicesViewModel$fetchWithJobsMap$1(this, dVar);
        Object obj2 = additionalServicesViewModel$fetchWithJobsMap$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = additionalServicesViewModel$fetchWithJobsMap$1.label;
        if (i11 != 0) {
        }
        c11.y(new AdditionalServicesViewModel$fetchWithJobsMap$2$2$1(map3, additionalServicesCellVO2, additionalServicesViewModel));
        return Unit.f71690a;
    }

    private final AdditionalServicesTariffAspectVO findSelectedTariff(List<AdditionalServicesTariffAspectVO> tariffs) {
        Object obj;
        Iterator<T> it = tariffs.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AdditionalServicesTariffAspectVO) obj).getAspect().getState() == AspectDTO.AspectState.SELECTED) {
                break;
            }
        }
        return (AdditionalServicesTariffAspectVO) obj;
    }

    private final AdditionalServicesTariffAspectVO getEnabledTariff(AdditionalServicesTariffAspectVO tariff) {
        return AdditionalServicesTariffAspectVO.copy$default(tariff, 0, AspectDTO.copy$default(tariff.getAspect(), null, AspectDTO.AspectState.ENABLED, null, null, null, 29, null), null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasRunningJobs() {
        return this.modalDismissFetchJobs.size() + (this.tariffsFetchJobs.size() + this.controlsFetchJobs.size()) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdditionalServicesVO.State.Loaded getLoadedState() {
        AdditionalServicesVO.State state = getViewState().getState();
        Intrinsics.g(state, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO.State.Loaded");
        return (AdditionalServicesVO.State.Loaded) state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdditionalServicesCellVO.ControlType.Button getNewButton(AdditionalServicesCellVO.ControlType.Button button) {
        return AdditionalServicesCellVO.ControlType.Button.copy$default(button, null, !button.getIsLoading(), 1, null);
    }

    private final List<AdditionalServicesCellVO> getNewCells(AdditionalServicesCellVO newCell, AdditionalServicesVO.State.Loaded state) {
        ArrayList W02 = C7714v.W0(state.getCells());
        Iterator it = W02.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((AdditionalServicesCellVO) it.next()).getId() == newCell.getId()) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            return K.f71697a;
        }
        W02.set(i11, newCell);
        return W02;
    }

    static /* synthetic */ List getNewCells$default(AdditionalServicesViewModel additionalServicesViewModel, AdditionalServicesCellVO additionalServicesCellVO, AdditionalServicesVO.State.Loaded loaded, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            loaded = additionalServicesViewModel.getLoadedState();
        }
        return additionalServicesViewModel.getNewCells(additionalServicesCellVO, loaded);
    }

    private final AdditionalServicesCellVO.ControlType.Counter getNewCounterInput(AdditionalServicesCellVO.ControlType.Counter counter, IconButtonV3DTO iconButtonV3DTO) {
        return Intrinsics.d(iconButtonV3DTO, counter.getCounterInputV2DTO().getDecrementButton()) ? AdditionalServicesCellVO.ControlType.Counter.copy$default(counter, null, !counter.getIsDecrementLoading(), false, 5, null) : AdditionalServicesCellVO.ControlType.Counter.copy$default(counter, null, false, !counter.getIsIncrementLoading(), 3, null);
    }

    private final List<AdditionalServicesTariffAspectVO> getNewTariffs(AdditionalServicesTariffAspectVO oldTariff, AdditionalServicesTariffAspectVO newTariff, List<AdditionalServicesTariffAspectVO> tariffs) {
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        for (Object obj : tariffs) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO = (AdditionalServicesTariffAspectVO) obj;
            if (additionalServicesTariffAspectVO.getId() == oldTariff.getId()) {
                i12 = i11;
            }
            if (additionalServicesTariffAspectVO.getId() == newTariff.getId()) {
                i13 = i11;
            }
            i11 = i14;
        }
        if (i12 == -1 || i13 == -1) {
            return K.f71697a;
        }
        ArrayList W02 = C7714v.W0(tariffs);
        W02.set(i12, getEnabledTariff(oldTariff));
        W02.set(i13, getSelectedTariff(newTariff));
        return W02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r12 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AdditionalServicesCellVO.ControlType.Toggle getNewToggle(AdditionalServicesCellVO.ControlType.Toggle toggle, Boolean isSelected) {
        ToggleDTO copy$default;
        if (isSelected != null) {
            ToggleDTO toggleDTO = toggle.getToggleDTO();
            copy$default = toggleDTO != null ? ToggleDTO.copy$default(toggleDTO, isSelected, Boolean.FALSE, null, null, null, null, 60, null) : null;
        }
        ToggleDTO toggleDTO2 = toggle.getToggleDTO();
        copy$default = toggleDTO2 != null ? ToggleDTO.copy$default(toggleDTO2, null, Boolean.FALSE, null, null, null, null, 61, null) : null;
        return AdditionalServicesCellVO.ControlType.Toggle.copy$default(toggle, copy$default, null, 2, null);
    }

    static /* synthetic */ AdditionalServicesCellVO.ControlType.Toggle getNewToggle$default(AdditionalServicesViewModel additionalServicesViewModel, AdditionalServicesCellVO.ControlType.Toggle toggle, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        return additionalServicesViewModel.getNewToggle(toggle, bool);
    }

    private final AdditionalServicesTariffAspectVO getSelectedTariff(AdditionalServicesTariffAspectVO tariff) {
        return AdditionalServicesTariffAspectVO.copy$default(tariff, 0, AspectDTO.copy$default(tariff.getAspect(), null, AspectDTO.AspectState.SELECTED, null, null, null, 29, null), null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdditionalServicesVO getViewState() {
        return getState().getValue();
    }

    private final void handleAction(AdditionalServicesControlActionWrapper.Button button, Map<String, ? extends Object> map, String str, boolean z11) {
        AdditionalServicesCellVO additionalServicesCellVO = this.cachedCells.get(Integer.valueOf(button.getCellId()));
        if (additionalServicesCellVO != null) {
            AdditionalServicesCellVO.ControlType control = additionalServicesCellVO.getControl();
            Intrinsics.g(control, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO.ControlType.Button");
            setState(AdditionalServicesCellVO.copy$default(additionalServicesCellVO, 0, null, null, null, null, false, getNewButton((AdditionalServicesCellVO.ControlType.Button) control), null, false, false, false, null, 4031, null));
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$handleAction$1$1(z11, this, str, additionalServicesCellVO, map, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void handleAction$default(AdditionalServicesViewModel additionalServicesViewModel, AdditionalServicesControlActionWrapper.Button button, Map map, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = null;
        }
        additionalServicesViewModel.handleAction(button, (Map<String, ? extends Object>) map, str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(7:5|6|7|8|(2:80|(1:(1:(1:(1:(3:86|56|57)(2:87|88))(6:89|48|52|(1:54)|56|57))(12:90|91|92|29|30|31|32|(2:34|(7:36|(2:37|(2:39|(1:41)(1:49))(2:50|51))|42|(1:44)|45|(2:47|48)|64))|52|(0)|56|57))(4:93|94|95|23))(4:96|97|98|75))(5:10|11|12|(4:70|71|72|(2:74|75))(6:16|17|18|19|20|(2:22|23))|64)|24|(3:26|(10:28|29|30|31|32|(0)|52|(0)|56|57)|64)(2:62|63)))|8|(0)(0)|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0108, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0109, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x020c, code lost:
    
        if (r3.emit(r4, r11) == r6) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139 A[Catch: CancellationException -> 0x0085, all -> 0x0108, TRY_LEAVE, TryCatch #2 {all -> 0x0108, blocks: (B:23:0x0105, B:24:0x0133, B:26:0x0139, B:62:0x0160, B:63:0x0165, B:75:0x0131), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160 A[Catch: CancellationException -> 0x0085, all -> 0x0108, TRY_ENTER, TryCatch #2 {all -> 0x0108, blocks: (B:23:0x0105, B:24:0x0133, B:26:0x0139, B:62:0x0160, B:63:0x0165, B:75:0x0131), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r22v0, types: [kotlin.jvm.functions.Function1<? super ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r23v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v15, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleFetchResult(String str, Map<String, ? extends Object> map, M m11, AdditionalServicesCellVO additionalServicesCellVO, Function1<? super AdditionalServicesCellVO, Unit> function1, Function0<Unit> function0, d<? super Unit> dVar) {
        AdditionalServicesViewModel$handleFetchResult$1 additionalServicesViewModel$handleFetchResult$1;
        ?? r72;
        Object a11;
        Object obj;
        AdditionalServicesViewModel additionalServicesViewModel;
        ?? r32;
        Object obj2;
        Throwable b11;
        Object obj3;
        AdditionalServicesViewModel additionalServicesViewModel2;
        Object obj4;
        Object obj5;
        AdditionalServicesViewModel additionalServicesViewModel3;
        Object obj6;
        AdditionalServicesViewModel additionalServicesViewModel4;
        Object obj7;
        Object obj8;
        int i11;
        Object obj9;
        Object obj10;
        ComposerAsyncWidgetResponse<AdditionalServicesDTO> composerAsyncWidgetResponse;
        Object obj11;
        M m12 = m11;
        AdditionalServicesCellVO additionalServicesCellVO2 = additionalServicesCellVO;
        AdditionalServicesCellVO additionalServicesCellVO3 = function1;
        M m13 = function0;
        try {
            if (dVar instanceof AdditionalServicesViewModel$handleFetchResult$1) {
                additionalServicesViewModel$handleFetchResult$1 = (AdditionalServicesViewModel$handleFetchResult$1) dVar;
                int i12 = additionalServicesViewModel$handleFetchResult$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    additionalServicesViewModel$handleFetchResult$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    AdditionalServicesViewModel$handleFetchResult$1 additionalServicesViewModel$handleFetchResult$12 = additionalServicesViewModel$handleFetchResult$1;
                    Object obj12 = additionalServicesViewModel$handleFetchResult$12.result;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    r72 = additionalServicesViewModel$handleFetchResult$12.label;
                    ?? r15 = 5;
                    if (r72 != 0) {
                        s.b(obj12);
                        try {
                            r.Companion companion = r.INSTANCE;
                            if (map == null || map.isEmpty()) {
                                i11 = 3;
                                r15 = 0;
                                try {
                                    ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.repository;
                                    additionalServicesViewModel$handleFetchResult$12.L$0 = this;
                                    additionalServicesViewModel$handleFetchResult$12.L$1 = m12;
                                    additionalServicesViewModel$handleFetchResult$12.L$2 = additionalServicesCellVO2;
                                    additionalServicesViewModel$handleFetchResult$12.L$3 = additionalServicesCellVO3;
                                    additionalServicesViewModel$handleFetchResult$12.L$4 = m13;
                                    additionalServicesViewModel$handleFetchResult$12.label = 1;
                                    obj8 = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, AdditionalServicesDTO.class, null, additionalServicesViewModel$handleFetchResult$12, 4, null);
                                    if (obj8 != aVar) {
                                        additionalServicesViewModel4 = this;
                                        obj7 = r15;
                                        composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj8;
                                        obj11 = obj7;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r72 = this;
                                    r.Companion companion2 = r.INSTANCE;
                                    a11 = s.a(th);
                                    additionalServicesViewModel3 = r72;
                                    obj5 = r15;
                                    M m14 = m12;
                                    obj2 = a11;
                                    ?? r16 = additionalServicesCellVO3;
                                    AdditionalServicesCellVO additionalServicesCellVO4 = additionalServicesCellVO2;
                                    Object obj13 = m13;
                                    r32 = obj13;
                                    additionalServicesViewModel = additionalServicesViewModel3;
                                    obj = obj5;
                                    if (!(obj2 instanceof r.b)) {
                                    }
                                    b11 = r.b(obj2);
                                    if (b11 != null) {
                                    }
                                    return Unit.f71690a;
                                }
                            } else {
                                ComposerAsyncWidgetRepository composerAsyncWidgetRepository2 = this.repository;
                                additionalServicesViewModel$handleFetchResult$12.L$0 = this;
                                additionalServicesViewModel$handleFetchResult$12.L$1 = m12;
                                additionalServicesViewModel$handleFetchResult$12.L$2 = additionalServicesCellVO2;
                                additionalServicesViewModel$handleFetchResult$12.L$3 = additionalServicesCellVO3;
                                additionalServicesViewModel$handleFetchResult$12.L$4 = m13;
                                additionalServicesViewModel$handleFetchResult$12.label = 2;
                                r15 = 0;
                                i11 = 3;
                                try {
                                    obj10 = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository2, str, map, AdditionalServicesDTO.class, null, additionalServicesViewModel$handleFetchResult$12, 8, null);
                                    additionalServicesViewModel$handleFetchResult$12 = additionalServicesViewModel$handleFetchResult$12;
                                    if (obj10 != aVar) {
                                        additionalServicesViewModel4 = this;
                                        obj9 = r15;
                                        composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj10;
                                        obj11 = obj9;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    additionalServicesViewModel$handleFetchResult$12 = additionalServicesViewModel$handleFetchResult$12;
                                    r72 = this;
                                    r.Companion companion22 = r.INSTANCE;
                                    a11 = s.a(th);
                                    additionalServicesViewModel3 = r72;
                                    obj5 = r15;
                                    M m142 = m12;
                                    obj2 = a11;
                                    ?? r162 = additionalServicesCellVO3;
                                    AdditionalServicesCellVO additionalServicesCellVO42 = additionalServicesCellVO2;
                                    Object obj132 = m13;
                                    r32 = obj132;
                                    additionalServicesViewModel = additionalServicesViewModel3;
                                    obj = obj5;
                                    if (!(obj2 instanceof r.b)) {
                                    }
                                    b11 = r.b(obj2);
                                    if (b11 != null) {
                                    }
                                    return Unit.f71690a;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r15 = 0;
                        }
                        return aVar;
                    }
                    try {
                    } catch (Throwable th5) {
                        th = th5;
                        m13 = m12;
                        m12 = m13;
                        additionalServicesCellVO3 = additionalServicesCellVO2;
                        additionalServicesCellVO2 = additionalServicesCellVO3;
                        r15 = 0;
                        r.Companion companion222 = r.INSTANCE;
                        a11 = s.a(th);
                        additionalServicesViewModel3 = r72;
                        obj5 = r15;
                        M m1422 = m12;
                        obj2 = a11;
                        ?? r1622 = additionalServicesCellVO3;
                        AdditionalServicesCellVO additionalServicesCellVO422 = additionalServicesCellVO2;
                        Object obj1322 = m13;
                        r32 = obj1322;
                        additionalServicesViewModel = additionalServicesViewModel3;
                        obj = obj5;
                        if (!(obj2 instanceof r.b)) {
                        }
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    if (r72 == 1) {
                        ?? r22 = (Function0) additionalServicesViewModel$handleFetchResult$12.L$4;
                        ?? r33 = (Function1) additionalServicesViewModel$handleFetchResult$12.L$3;
                        AdditionalServicesCellVO additionalServicesCellVO5 = (AdditionalServicesCellVO) additionalServicesViewModel$handleFetchResult$12.L$2;
                        M m15 = (M) additionalServicesViewModel$handleFetchResult$12.L$1;
                        AdditionalServicesViewModel additionalServicesViewModel5 = (AdditionalServicesViewModel) additionalServicesViewModel$handleFetchResult$12.L$0;
                        s.b(obj12);
                        m13 = r22;
                        m12 = m15;
                        additionalServicesCellVO3 = r33;
                        additionalServicesCellVO2 = additionalServicesCellVO5;
                        additionalServicesViewModel4 = additionalServicesViewModel5;
                        obj7 = null;
                        obj8 = obj12;
                        i11 = 3;
                        composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj8;
                        obj11 = obj7;
                    } else {
                        if (r72 != 2) {
                            if (r72 != 3) {
                                if (r72 != 4) {
                                    if (r72 != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj12);
                                    return Unit.f71690a;
                                }
                                obj2 = additionalServicesViewModel$handleFetchResult$12.L$2;
                                Object obj14 = (Function0) additionalServicesViewModel$handleFetchResult$12.L$1;
                                additionalServicesViewModel2 = (AdditionalServicesViewModel) additionalServicesViewModel$handleFetchResult$12.L$0;
                                s.b(obj12);
                                obj3 = null;
                                obj4 = obj14;
                                additionalServicesViewModel = additionalServicesViewModel2;
                                r32 = obj4;
                                obj = obj3;
                                b11 = r.b(obj2);
                                if (b11 != null) {
                                    r32.invoke();
                                    Ae.w0<Event<AdditionalServicesVO.State.Loaded>> w0Var = additionalServicesViewModel.eventFlow;
                                    Event.OnWidgetFetchingFailed onWidgetFetchingFailed = new Event.OnWidgetFetchingFailed(b11);
                                    additionalServicesViewModel$handleFetchResult$12.L$0 = obj2;
                                    additionalServicesViewModel$handleFetchResult$12.L$1 = obj;
                                    additionalServicesViewModel$handleFetchResult$12.L$2 = obj;
                                    additionalServicesViewModel$handleFetchResult$12.L$3 = obj;
                                    additionalServicesViewModel$handleFetchResult$12.L$4 = obj;
                                    additionalServicesViewModel$handleFetchResult$12.label = 5;
                                }
                                return Unit.f71690a;
                            }
                            ?? r23 = (Function0) additionalServicesViewModel$handleFetchResult$12.L$4;
                            ?? r34 = (Function1) additionalServicesViewModel$handleFetchResult$12.L$3;
                            AdditionalServicesCellVO additionalServicesCellVO6 = (AdditionalServicesCellVO) additionalServicesViewModel$handleFetchResult$12.L$2;
                            M m16 = (M) additionalServicesViewModel$handleFetchResult$12.L$1;
                            AdditionalServicesViewModel additionalServicesViewModel6 = (AdditionalServicesViewModel) additionalServicesViewModel$handleFetchResult$12.L$0;
                            s.b(obj12);
                            m13 = r23;
                            m12 = m16;
                            additionalServicesCellVO3 = r34;
                            additionalServicesCellVO2 = additionalServicesCellVO6;
                            r15 = 0;
                            r72 = additionalServicesViewModel6;
                            try {
                                a11 = (AsyncWidgetFetchedModel) obj12;
                                r.Companion companion3 = r.INSTANCE;
                                additionalServicesViewModel3 = r72;
                                obj5 = r15;
                            } catch (Throwable th6) {
                                th = th6;
                                r.Companion companion2222 = r.INSTANCE;
                                a11 = s.a(th);
                                additionalServicesViewModel3 = r72;
                                obj5 = r15;
                                M m14222 = m12;
                                obj2 = a11;
                                ?? r16222 = additionalServicesCellVO3;
                                AdditionalServicesCellVO additionalServicesCellVO4222 = additionalServicesCellVO2;
                                Object obj13222 = m13;
                                r32 = obj13222;
                                additionalServicesViewModel = additionalServicesViewModel3;
                                obj = obj5;
                                if (!(obj2 instanceof r.b)) {
                                }
                                b11 = r.b(obj2);
                                if (b11 != null) {
                                }
                                return Unit.f71690a;
                            }
                            M m142222 = m12;
                            obj2 = a11;
                            ?? r162222 = additionalServicesCellVO3;
                            AdditionalServicesCellVO additionalServicesCellVO42222 = additionalServicesCellVO2;
                            Object obj132222 = m13;
                            r32 = obj132222;
                            additionalServicesViewModel = additionalServicesViewModel3;
                            obj = obj5;
                            if (!(obj2 instanceof r.b)) {
                                AsyncWidgetFetchedModel asyncWidgetFetchedModel = (AsyncWidgetFetchedModel) obj2;
                                r32 = obj132222;
                                additionalServicesViewModel = additionalServicesViewModel3;
                                obj = obj5;
                                if (N.f(m142222)) {
                                    Iterator it = additionalServicesViewModel3.updateSeparatorsVisibility(((AdditionalServicesVO.State.Loaded) asyncWidgetFetchedModel.getFetchedState()).getCells(), additionalServicesViewModel3.getLoadedState().getShowMoreButton(), additionalServicesViewModel3.getLoadedState().getCellsCount()).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj6 = obj5;
                                            break;
                                        }
                                        obj6 = it.next();
                                        if (((AdditionalServicesCellVO) obj6).getId() == additionalServicesCellVO42222.getId()) {
                                            break;
                                        }
                                    }
                                    AdditionalServicesCellVO additionalServicesCellVO7 = (AdditionalServicesCellVO) obj6;
                                    if (additionalServicesCellVO7 != null) {
                                        additionalServicesViewModel3.cachedCells.put(new Integer(additionalServicesCellVO7.getId()), additionalServicesCellVO7);
                                        r162222.invoke(additionalServicesCellVO7);
                                    }
                                    Ae.w0<Event<AdditionalServicesVO.State.Loaded>> w0Var2 = additionalServicesViewModel3.eventFlow;
                                    Event.OnWidgetFetched onWidgetFetched = new Event.OnWidgetFetched(asyncWidgetFetchedModel);
                                    additionalServicesViewModel$handleFetchResult$12.L$0 = additionalServicesViewModel3;
                                    additionalServicesViewModel$handleFetchResult$12.L$1 = obj132222;
                                    additionalServicesViewModel$handleFetchResult$12.L$2 = obj2;
                                    additionalServicesViewModel$handleFetchResult$12.L$3 = obj5;
                                    additionalServicesViewModel$handleFetchResult$12.L$4 = obj5;
                                    additionalServicesViewModel$handleFetchResult$12.label = 4;
                                    if (w0Var2.emit(onWidgetFetched, additionalServicesViewModel$handleFetchResult$12) != aVar) {
                                        additionalServicesViewModel2 = additionalServicesViewModel3;
                                        obj4 = obj132222;
                                        obj3 = obj5;
                                        additionalServicesViewModel = additionalServicesViewModel2;
                                        r32 = obj4;
                                        obj = obj3;
                                    }
                                    return aVar;
                                }
                            }
                            b11 = r.b(obj2);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                        ?? r24 = (Function0) additionalServicesViewModel$handleFetchResult$12.L$4;
                        ?? r35 = (Function1) additionalServicesViewModel$handleFetchResult$12.L$3;
                        AdditionalServicesCellVO additionalServicesCellVO8 = (AdditionalServicesCellVO) additionalServicesViewModel$handleFetchResult$12.L$2;
                        M m17 = (M) additionalServicesViewModel$handleFetchResult$12.L$1;
                        AdditionalServicesViewModel additionalServicesViewModel7 = (AdditionalServicesViewModel) additionalServicesViewModel$handleFetchResult$12.L$0;
                        s.b(obj12);
                        m13 = r24;
                        m12 = m17;
                        additionalServicesCellVO3 = r35;
                        additionalServicesCellVO2 = additionalServicesCellVO8;
                        additionalServicesViewModel4 = additionalServicesViewModel7;
                        obj9 = null;
                        obj10 = obj12;
                        i11 = 3;
                        composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj10;
                        obj11 = obj9;
                    }
                    if (N.f(m12)) {
                        throw new CancellationException();
                    }
                    additionalServicesViewModel$handleFetchResult$12.L$0 = additionalServicesViewModel4;
                    additionalServicesViewModel$handleFetchResult$12.L$1 = m12;
                    additionalServicesViewModel$handleFetchResult$12.L$2 = additionalServicesCellVO2;
                    additionalServicesViewModel$handleFetchResult$12.L$3 = additionalServicesCellVO3;
                    additionalServicesViewModel$handleFetchResult$12.L$4 = m13;
                    additionalServicesViewModel$handleFetchResult$12.label = i11;
                    obj12 = additionalServicesViewModel4.mapAsyncWidgetResponse(composerAsyncWidgetResponse, additionalServicesViewModel$handleFetchResult$12);
                    if (obj12 != aVar) {
                        r72 = additionalServicesViewModel4;
                        r15 = obj11;
                        a11 = (AsyncWidgetFetchedModel) obj12;
                        r.Companion companion32 = r.INSTANCE;
                        additionalServicesViewModel3 = r72;
                        obj5 = r15;
                        M m1422222 = m12;
                        obj2 = a11;
                        ?? r1622222 = additionalServicesCellVO3;
                        AdditionalServicesCellVO additionalServicesCellVO422222 = additionalServicesCellVO2;
                        Object obj1322222 = m13;
                        r32 = obj1322222;
                        additionalServicesViewModel = additionalServicesViewModel3;
                        obj = obj5;
                        if (!(obj2 instanceof r.b)) {
                        }
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    return aVar;
                }
            }
            if (r72 != 0) {
            }
            if (N.f(m12)) {
            }
        } catch (CancellationException e11) {
            throw e11;
        }
        additionalServicesViewModel$handleFetchResult$1 = new AdditionalServicesViewModel$handleFetchResult$1(this, dVar);
        AdditionalServicesViewModel$handleFetchResult$1 additionalServicesViewModel$handleFetchResult$122 = additionalServicesViewModel$handleFetchResult$1;
        Object obj122 = additionalServicesViewModel$handleFetchResult$122.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        r72 = additionalServicesViewModel$handleFetchResult$122.label;
        ?? r152 = 5;
    }

    private final Object mapAsyncWidgetResponse(ComposerAsyncWidgetResponse<AdditionalServicesDTO> composerAsyncWidgetResponse, d<? super AsyncWidgetFetchedModel<AdditionalServicesVO.State.Loaded>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new AdditionalServicesViewModel$mapAsyncWidgetResponse$2(this, composerAsyncWidgetResponse, null), dVar);
    }

    private final void setState(Function1<? super AdditionalServicesVO, AdditionalServicesVO> reducer) {
        setViewState(reducer.invoke(getViewState()));
    }

    private final void setViewState(AdditionalServicesVO additionalServicesVO) {
        this.stateFlow.setValue(additionalServicesVO);
    }

    private final List<AdditionalServicesCellVO> updateSeparatorsVisibility(List<AdditionalServicesCellVO> list, ButtonV3DTO buttonV3DTO, int i11) {
        List<AdditionalServicesCellVO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            AdditionalServicesCellVO additionalServicesCellVO = (AdditionalServicesCellVO) obj;
            if (buttonV3DTO != null && i12 == i11 - 1) {
                additionalServicesCellVO = AdditionalServicesCellVO.copy$default(additionalServicesCellVO, 0, null, null, null, null, false, null, null, false, false, true, null, 3071, null);
            }
            arrayList.add(additionalServicesCellVO);
            i12 = i13;
        }
        return arrayList;
    }

    @NotNull
    public final Ae.B0<Event<AdditionalServicesVO.State.Loaded>> getEvent() {
        return this.event;
    }

    @NotNull
    public final M0<AdditionalServicesVO> getState() {
        return C2399j.b(this.stateFlow);
    }

    @NotNull
    public final Map<Integer, Parcelable> getTariffScrollStates() {
        return this.tariffScrollStates;
    }

    public final void onBindWidgetViewHolder(@NotNull AdditionalServicesVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        if (Intrinsics.d(getViewState().getState(), AdditionalServicesVO.State.Initial.INSTANCE)) {
            AdditionalServicesVO.State state = vo.getState();
            Intrinsics.g(state, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO.State.Loaded");
            AdditionalServicesVO.State.Loaded loaded = (AdditionalServicesVO.State.Loaded) state;
            setState(new AdditionalServicesViewModel$onBindWidgetViewHolder$1$1$1(vo, loaded, cacheCells(updateSeparatorsVisibility(loaded.getCells(), loaded.getShowMoreButton(), loaded.getCellsCount()))));
        }
    }

    public final void onControlActionWrapperClicked(@NotNull AdditionalServicesControlActionWrapper actionWrapper) {
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(actionWrapper, "actionWrapper");
        AtomAction atomAction = actionWrapper.getAtomAction();
        String asyncData = getViewState().getAsyncData();
        if (asyncData == null) {
            return;
        }
        if (Intrinsics.d(atomAction.getId(), ActionId.FETCH_ASYNC_STATE.getId())) {
            AtomAction.Click click = atomAction instanceof AtomAction.Click ? (AtomAction.Click) atomAction : null;
            if (click == null || (params = click.getParams()) == null) {
                return;
            }
            if (actionWrapper instanceof AdditionalServicesControlActionWrapper.Button) {
                handleAction((AdditionalServicesControlActionWrapper.Button) actionWrapper, (Map<String, ? extends Object>) params, asyncData, false);
            } else if (actionWrapper instanceof AdditionalServicesControlActionWrapper.Toggle) {
                handleAction((AdditionalServicesControlActionWrapper.Toggle) actionWrapper, params, asyncData);
            } else {
                if (!(actionWrapper instanceof AdditionalServicesControlActionWrapper.Counter)) {
                    throw new o();
                }
                handleAction((AdditionalServicesControlActionWrapper.Counter) actionWrapper, params, asyncData);
            }
        }
        if ((actionWrapper instanceof AdditionalServicesControlActionWrapper.Button) && (atomAction instanceof AtomAction.OpenComposerNestedPage) && h.t(((AtomAction.OpenComposerNestedPage) atomAction).getLink(), "isRefreshAfterDismissEnabled", false)) {
            handleAction$default(this, (AdditionalServicesControlActionWrapper.Button) actionWrapper, null, asyncData, true, 1, null);
        }
    }

    public final void onInfoActionWrapperClicked(@NotNull AdditionalServicesInfoActionWrapper actionWrapper) {
        Intrinsics.checkNotNullParameter(actionWrapper, "actionWrapper");
        String asyncData = getViewState().getAsyncData();
        if (asyncData == null) {
            return;
        }
        AtomAction atomAction = actionWrapper.getAtomAction();
        if ((atomAction instanceof AtomAction.OpenComposerNestedPage) && h.t(((AtomAction.OpenComposerNestedPage) atomAction).getLink(), "isRefreshAfterDismissEnabled", false)) {
            handleAction(actionWrapper, asyncData, actionWrapper.getControl());
        }
    }

    public final void onModalDismiss() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$onModalDismiss$1(this, null), 3);
    }

    public final void onShowMoreButtonClicked() {
        AdditionalServicesCellVO additionalServicesCellVO = (AdditionalServicesCellVO) C7714v.Q(getLoadedState().getCellsCount() - 1, getLoadedState().getCells());
        if (additionalServicesCellVO == null) {
            setState(new AdditionalServicesViewModel$onShowMoreButtonClicked$2$1(this));
            return;
        }
        AdditionalServicesCellVO copy$default = AdditionalServicesCellVO.copy$default(additionalServicesCellVO, 0, null, null, null, null, false, null, null, false, false, false, null, 3071, null);
        this.cachedCells.put(Integer.valueOf(copy$default.getId()), copy$default);
        setState(new AdditionalServicesViewModel$onShowMoreButtonClicked$1$1(this, getNewCells$default(this, copy$default, null, 2, null)));
    }

    public final void onTariffActionWrapperClicked(@NotNull AdditionalServicesTariffActionWrapper actionWrapper) {
        Intrinsics.checkNotNullParameter(actionWrapper, "actionWrapper");
        AtomAction atomAction = actionWrapper.getAtomAction();
        AtomAction.Click click = atomAction instanceof AtomAction.Click ? (AtomAction.Click) atomAction : null;
        String asyncData = getViewState().getAsyncData();
        if (asyncData == null) {
            return;
        }
        handleAction(actionWrapper, click != null ? click.getId() : null, click != null ? click.getParams() : null, asyncData);
    }

    private final void setState(List<AdditionalServicesCellVO> newCells) {
        setState(new AdditionalServicesViewModel$setState$1(this, newCells));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(AdditionalServicesCellVO newCell) {
        setState(getNewCells$default(this, newCell, null, 2, null));
    }

    private final void handleAction(AdditionalServicesControlActionWrapper.Toggle toggle, Map<String, ? extends Object> map, String str) {
        AdditionalServicesCellVO additionalServicesCellVO = this.cachedCells.get(Integer.valueOf(toggle.getCellId()));
        if (additionalServicesCellVO != null) {
            AdditionalServicesCellVO.ControlType control = additionalServicesCellVO.getControl();
            Intrinsics.g(control, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO.ControlType.Toggle");
            AdditionalServicesCellVO.ControlType.Toggle toggle2 = (AdditionalServicesCellVO.ControlType.Toggle) control;
            boolean z11 = toggle.getIsSelected() && (additionalServicesCellVO.getCellType() instanceof AdditionalServicesCellVO.CellType.WithTariffs);
            setState(AdditionalServicesCellVO.copy$default(additionalServicesCellVO, 0, null, null, null, null, true, getNewToggle(toggle2, Boolean.valueOf(toggle.getIsSelected())), null, z11, z11, false, null, 3231, null));
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$handleAction$2$1(this, str, map, additionalServicesCellVO, null), 3);
        }
    }

    private final void handleAction(AdditionalServicesControlActionWrapper.Counter counter, Map<String, ? extends Object> map, String str) {
        AdditionalServicesCellVO additionalServicesCellVO = this.cachedCells.get(Integer.valueOf(counter.getCellId()));
        if (additionalServicesCellVO != null) {
            AdditionalServicesCellVO.ControlType control = additionalServicesCellVO.getControl();
            Intrinsics.g(control, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO.ControlType.Counter");
            setState(AdditionalServicesCellVO.copy$default(additionalServicesCellVO, 0, null, null, null, null, false, getNewCounterInput((AdditionalServicesCellVO.ControlType.Counter) control, counter.getIconButton()), null, false, false, false, null, 4031, null));
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$handleAction$3$1(this, str, map, additionalServicesCellVO, null), 3);
        }
    }

    private final void handleAction(AdditionalServicesTariffActionWrapper additionalServicesTariffActionWrapper, String str, Map<String, ? extends Object> map, String str2) {
        AdditionalServicesTariffAspectVO findSelectedTariff;
        AdditionalServicesCellVO additionalServicesCellVO = this.cachedCells.get(Integer.valueOf(additionalServicesTariffActionWrapper.getCellId()));
        if (additionalServicesCellVO != null) {
            B0 b02 = this.tariffsFetchJobs.get(Integer.valueOf(additionalServicesTariffActionWrapper.getCellId()));
            if ((b02 == null || !b02.isActive()) && Intrinsics.d(str, ActionId.FETCH_ASYNC_STATE.getId()) && map != null && (!map.isEmpty()) && (additionalServicesCellVO.getControl() instanceof AdditionalServicesCellVO.ControlType.Toggle)) {
                AdditionalServicesCellVO.CellType cellType = additionalServicesCellVO.getCellType();
                List tariffs = cellType instanceof AdditionalServicesCellVO.CellType.WithTariffs ? ((AdditionalServicesCellVO.CellType.WithTariffs) cellType).getTariffs() : null;
                if (tariffs == null || (findSelectedTariff = findSelectedTariff(tariffs)) == null) {
                    return;
                }
                List<AdditionalServicesTariffAspectVO> newTariffs = getNewTariffs(findSelectedTariff, additionalServicesTariffActionWrapper.getTariffAspectVO(), tariffs);
                AtomAction atomAction = additionalServicesTariffActionWrapper.getAtomAction();
                if (atomAction != null) {
                    additionalServicesTariffActionWrapper.getActionHandler().invoke(atomAction);
                }
                setState(AdditionalServicesCellVO.copy$default(additionalServicesCellVO, 0, null, null, null, null, true, getNewToggle$default(this, (AdditionalServicesCellVO.ControlType.Toggle) additionalServicesCellVO.getControl(), null, 2, null), AdditionalServicesCellVO.CellType.WithTariffs.m1101boximpl(AdditionalServicesCellVO.CellType.WithTariffs.m1102constructorimpl(newTariffs)), false, false, false, null, 3871, null));
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$handleAction$4$1(this, str2, map, additionalServicesCellVO, null), 3);
            }
        }
    }

    private final void handleAction(AdditionalServicesInfoActionWrapper additionalServicesInfoActionWrapper, String str, AdditionalServicesCellVO.ControlType controlType) {
        AdditionalServicesCellVO additionalServicesCellVO = this.cachedCells.get(Integer.valueOf(additionalServicesInfoActionWrapper.getCellId()));
        if (additionalServicesCellVO != null) {
            if (controlType instanceof AdditionalServicesCellVO.ControlType.Button) {
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$handleAction$5$1(this, additionalServicesCellVO, controlType, str, null), 3);
            } else if (controlType instanceof AdditionalServicesCellVO.ControlType.Toggle) {
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalServicesViewModel$handleAction$5$2(this, controlType, additionalServicesCellVO, str, null), 3);
            } else if (!(controlType instanceof AdditionalServicesCellVO.ControlType.Counter)) {
                throw new o();
            }
        }
    }
}

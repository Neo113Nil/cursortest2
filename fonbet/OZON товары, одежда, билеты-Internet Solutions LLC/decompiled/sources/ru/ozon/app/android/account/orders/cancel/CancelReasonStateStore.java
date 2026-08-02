package ru.ozon.app.android.account.orders.cancel;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R.\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u000fR.\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\u000fR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u0014\u0010/\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0015R\u0014\u00101\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0015R\u0014\u00103\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0015¨\u00065"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelReasonStateStore;", "", "", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "initialItems", "Lxe/M;", "scope", "<init>", "(Ljava/util/List;Lxe/M;)V", "", "onReasonSelected", "()V", "", "comment", "onCommentChanged", "(Ljava/lang/String;)V", "reasons", "emit", "(Ljava/util/List;)V", "", "isButtonEnabled", "()Z", "LAe/h;", "observeItems", "()LAe/h;", "Lxe/M;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "selectedReasonId", "Ljava/lang/String;", "getSelectedReasonId", "()Ljava/lang/String;", "setSelectedReasonId", "getComment", "setComment", "LAe/x0;", "items", "LAe/x0;", "isCommentShownAlways", "Z", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Checkbox;", "checkbox", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Checkbox;", "getCheckbox", "()Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Checkbox;", "setCheckbox", "(Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Checkbox;)V", "isCommentRequired", "isCommentVisible", "getHasComment", "hasComment", "getHasSelectedReasonId", "hasSelectedReasonId", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonStateStore {

    @NotNull
    private CancelReasonVO.Checkbox checkbox;
    private String comment;
    private final boolean isCommentShownAlways;

    @NotNull
    private final x0<List<CancelReasonVO>> items;

    @NotNull
    private final M scope;
    private String selectedReasonId;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelReasonStateStore$Companion;", "", "<init>", "()V", "COMMENT_REQUIRED_REASON_ID", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CancelReasonStateStore(@NotNull List<? extends CancelReasonVO> initialItems, @NotNull M scope) {
        Object obj;
        Intrinsics.checkNotNullParameter(initialItems, "initialItems");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.items = O0.a(initialItems);
        Iterator<T> it = initialItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof CancelReasonVO.Comment) {
                    break;
                }
            }
        }
        CancelReasonVO.Comment comment = (CancelReasonVO.Comment) obj;
        boolean z11 = false;
        if (comment != null && !comment.getIsHidden()) {
            z11 = true;
        }
        this.isCommentShownAlways = z11;
        this.checkbox = new CancelReasonVO.Checkbox(CheckBoxDTO.CheckboxState.DISABLED, CheckBoxDTO.CheckboxStatus.SELECTED);
    }

    private final void emit(List<? extends CancelReasonVO> reasons) {
        C10727i.c(this.scope, null, null, new CancelReasonStateStore$emit$1(this, reasons, null), 3);
    }

    private final boolean getHasComment() {
        String comment = getComment();
        return !(comment == null || comment.length() == 0);
    }

    private final boolean getHasSelectedReasonId() {
        return this.selectedReasonId != null;
    }

    private final boolean isCommentRequired() {
        return Intrinsics.d(this.selectedReasonId, "other");
    }

    private final boolean isCommentVisible() {
        return this.isCommentShownAlways || isCommentRequired();
    }

    private final void onCommentChanged(String comment) {
        String str;
        List<CancelReasonVO> value = this.items.getValue();
        ArrayList arrayList = new ArrayList(C7714v.z(value, 10));
        for (Object obj : value) {
            if (obj instanceof CancelReasonVO.Comment) {
                str = comment;
                obj = CancelReasonVO.Comment.copy$default((CancelReasonVO.Comment) obj, str, null, false, 6, null);
            } else {
                str = comment;
            }
            arrayList.add(obj);
            comment = str;
        }
        emit(arrayList);
    }

    private final void onReasonSelected() {
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio copy;
        List<CancelReasonVO> value = this.items.getValue();
        ArrayList arrayList = new ArrayList(C7714v.z(value, 10));
        for (Object obj : value) {
            if (obj instanceof CancelReasonVO.Reason) {
                CancelReasonVO.Reason reason = (CancelReasonVO.Reason) obj;
                copy = r4.copy((r32 & 1) != 0 ? r4.isSelected : Intrinsics.d(reason.getReasonId(), this.selectedReasonId), (r32 & 2) != 0 ? r4.isRadio : false, (r32 & 4) != 0 ? r4.isAutoToggleDisabled : false, (r32 & 8) != 0 ? r4.title : null, (r32 & 16) != 0 ? r4.titleColor : null, (r32 & 32) != 0 ? r4.subtitle : null, (r32 & 64) != 0 ? r4.subtitleColor : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.align : null, (r32 & 256) != 0 ? r4.maxLines : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.action : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.hideSeparator : false, (r32 & 2048) != 0 ? r4.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? r4.context : null, (r32 & 8192) != 0 ? r4.testInfo : null, (r32 & 16384) != 0 ? reason.getCell().trackingInfo : null);
                obj = CancelReasonVO.Reason.copy$default(reason, copy, null, 2, null);
            } else if (obj instanceof CancelReasonVO.Comment) {
                obj = CancelReasonVO.Comment.copy$default((CancelReasonVO.Comment) obj, null, null, (this.isCommentShownAlways || isCommentRequired()) ? false : true, 3, null);
            }
            arrayList.add(obj);
        }
        emit(arrayList);
    }

    @NotNull
    public final CancelReasonVO.Checkbox getCheckbox() {
        return this.checkbox;
    }

    public final String getComment() {
        String str = this.comment;
        if (str == null || !isCommentVisible() || h.K(str)) {
            return null;
        }
        return str;
    }

    public final String getSelectedReasonId() {
        return this.selectedReasonId;
    }

    public final boolean isButtonEnabled() {
        if (getHasSelectedReasonId()) {
            return getHasComment() || !isCommentRequired();
        }
        return false;
    }

    @NotNull
    public final InterfaceC2395h<List<CancelReasonVO>> observeItems() {
        final x0<List<CancelReasonVO>> x0Var = this.items;
        return new InterfaceC2395h<List<? extends CancelReasonVO>>() { // from class: ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore$observeItems$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore$observeItems$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore$observeItems$$inlined$map$1$2", f = "CancelReasonStateStore.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore$observeItems$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                ArrayList arrayList = new ArrayList();
                                for (T t2 : (List) obj) {
                                    CancelReasonVO cancelReasonVO = (CancelReasonVO) t2;
                                    if (!(cancelReasonVO instanceof CancelReasonVO.Comment) || !((CancelReasonVO.Comment) cancelReasonVO).getIsHidden()) {
                                        arrayList.add(t2);
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(arrayList, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super List<? extends CancelReasonVO>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    public final void setCheckbox(@NotNull CancelReasonVO.Checkbox checkbox) {
        Intrinsics.checkNotNullParameter(checkbox, "<set-?>");
        this.checkbox = checkbox;
    }

    public final void setComment(String str) {
        this.comment = str;
        onCommentChanged(str);
    }

    public final void setSelectedReasonId(String str) {
        this.selectedReasonId = str;
        onReasonSelected();
    }
}

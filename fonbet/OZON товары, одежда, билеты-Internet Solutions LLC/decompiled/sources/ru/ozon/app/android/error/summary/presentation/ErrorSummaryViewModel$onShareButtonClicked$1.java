package ru.ozon.app.android.error.summary.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryCommand;
import ru.ozon.app.android.error.summary.presentation.shared.ErrorSummaryInvalidWidgetSharedDTOKt;
import ru.ozon.app.android.error.summary.presentation.shared.ErrorSummarySharedDTO;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.error.summary.presentation.ErrorSummaryViewModel$onShareButtonClicked$1", f = "ErrorSummaryViewModel.kt", l = {72, ModuleDescriptor.MODULE_VERSION, 84}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ErrorSummaryViewModel$onShareButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ ErrorSummaryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorSummaryViewModel$onShareButtonClicked$1(ErrorSummaryViewModel errorSummaryViewModel, d<? super ErrorSummaryViewModel$onShareButtonClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = errorSummaryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ErrorSummaryViewModel$onShareButtonClicked$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0237, code lost:
    
        if (r3.emit(r4, r33) != r1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ErrorSummaryState errorSummaryState;
        String url;
        Object featureFlags;
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        Long l11;
        ScreenState.ServerIssue serverIssue;
        ErrorSummaryState errorSummaryState2;
        ScreenState.ServerIssue.ComposerInfo composerInfo;
        String str5;
        ErrorSummaryViewModel errorSummaryViewModel;
        ErrorSummaryState errorSummaryState3;
        String timeStamp;
        Object experiments;
        String str6;
        List list;
        ScreenState.ServerIssue.ComposerInfo composerInfo2;
        ScreenState.ServerIssue serverIssue2;
        ArrayList arrayList;
        w0 w0Var;
        JsonSerializer jsonSerializer;
        List<ScreenState.ServerIssue.ComposerInfo.InvalidWidget> invalidWidgets;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            errorSummaryState = this.this$0.lastState;
            if (errorSummaryState != null) {
                ErrorSummaryViewModel errorSummaryViewModel2 = this.this$0;
                ScreenState.ServerIssue serverIssue3 = errorSummaryState.getServerIssue();
                ScreenState.ServerIssue.HttpInfo httpInfo = serverIssue3 != null ? serverIssue3.getHttpInfo() : null;
                ScreenState.ServerIssue.ComposerInfo composerInfo3 = serverIssue3 != null ? serverIssue3.getComposerInfo() : null;
                String platform = errorSummaryState.getPlatform();
                String appVersion = errorSummaryState.getAppVersion();
                String commitHash = errorSummaryState.getCommitHash();
                String concat = (serverIssue3 == null || (timeStamp = serverIssue3.getTimeStamp()) == null) ? null : timeStamp.concat(" GMT+3");
                Long userId = errorSummaryState.getUserId();
                Integer code = httpInfo != null ? httpInfo.getCode() : null;
                String message = httpInfo != null ? httpInfo.getMessage() : null;
                url = composerInfo3 != null ? composerInfo3.getUrl() : null;
                this.L$0 = errorSummaryState;
                this.L$1 = errorSummaryViewModel2;
                this.L$2 = errorSummaryState;
                this.L$3 = serverIssue3;
                this.L$4 = composerInfo3;
                this.L$5 = platform;
                this.L$6 = appVersion;
                this.L$7 = commitHash;
                this.L$8 = userId;
                this.L$9 = concat;
                this.L$10 = code;
                this.L$11 = message;
                this.L$12 = url;
                this.label = 1;
                featureFlags = errorSummaryViewModel2.getFeatureFlags(this);
                if (featureFlags != aVar) {
                    Integer num2 = code;
                    str = platform;
                    num = num2;
                    str2 = appVersion;
                    str3 = concat;
                    str4 = commitHash;
                    l11 = userId;
                    serverIssue = serverIssue3;
                    errorSummaryState2 = errorSummaryState;
                    composerInfo = composerInfo3;
                    str5 = message;
                    errorSummaryViewModel = errorSummaryViewModel2;
                    errorSummaryState3 = errorSummaryState2;
                    List list2 = (List) featureFlags;
                    this.L$0 = errorSummaryState2;
                    this.L$1 = errorSummaryViewModel;
                    this.L$2 = errorSummaryState3;
                    this.L$3 = serverIssue;
                    this.L$4 = composerInfo;
                    this.L$5 = str;
                    this.L$6 = str2;
                    this.L$7 = str4;
                    this.L$8 = l11;
                    this.L$9 = str3;
                    this.L$10 = num;
                    this.L$11 = str5;
                    this.L$12 = url;
                    this.L$13 = list2;
                    ScreenState.ServerIssue.ComposerInfo composerInfo4 = composerInfo;
                    this.label = 2;
                    experiments = errorSummaryViewModel.getExperiments(this);
                    if (experiments != aVar) {
                    }
                }
                return aVar;
            }
        } else {
            if (i11 == 1) {
                String str7 = (String) this.L$12;
                String str8 = (String) this.L$11;
                Integer num3 = (Integer) this.L$10;
                String str9 = (String) this.L$9;
                Long l12 = (Long) this.L$8;
                String str10 = (String) this.L$7;
                String str11 = (String) this.L$6;
                String str12 = (String) this.L$5;
                ScreenState.ServerIssue.ComposerInfo composerInfo5 = (ScreenState.ServerIssue.ComposerInfo) this.L$4;
                ScreenState.ServerIssue serverIssue4 = (ScreenState.ServerIssue) this.L$3;
                ErrorSummaryState errorSummaryState4 = (ErrorSummaryState) this.L$2;
                ErrorSummaryViewModel errorSummaryViewModel3 = (ErrorSummaryViewModel) this.L$1;
                ErrorSummaryState errorSummaryState5 = (ErrorSummaryState) this.L$0;
                s.b(obj);
                str5 = str8;
                errorSummaryState3 = errorSummaryState4;
                str = str12;
                l11 = l12;
                serverIssue = serverIssue4;
                str2 = str11;
                str3 = str9;
                errorSummaryViewModel = errorSummaryViewModel3;
                url = str7;
                composerInfo = composerInfo5;
                str4 = str10;
                num = num3;
                errorSummaryState2 = errorSummaryState5;
                featureFlags = obj;
                List list22 = (List) featureFlags;
                this.L$0 = errorSummaryState2;
                this.L$1 = errorSummaryViewModel;
                this.L$2 = errorSummaryState3;
                this.L$3 = serverIssue;
                this.L$4 = composerInfo;
                this.L$5 = str;
                this.L$6 = str2;
                this.L$7 = str4;
                this.L$8 = l11;
                this.L$9 = str3;
                this.L$10 = num;
                this.L$11 = str5;
                this.L$12 = url;
                this.L$13 = list22;
                ScreenState.ServerIssue.ComposerInfo composerInfo42 = composerInfo;
                this.label = 2;
                experiments = errorSummaryViewModel.getExperiments(this);
                if (experiments != aVar) {
                    str6 = url;
                    list = list22;
                    composerInfo2 = composerInfo42;
                    serverIssue2 = serverIssue;
                    String str13 = str5;
                    Integer num4 = num;
                    String str14 = str3;
                    Long l13 = l11;
                    String str15 = str4;
                    String str16 = str2;
                    String str17 = str;
                    List list3 = (List) experiments;
                    if (composerInfo2 != null) {
                    }
                    arrayList = null;
                    if (arrayList == null) {
                    }
                    if (serverIssue2 == null) {
                    }
                    String meshVersions = errorSummaryState3.getMeshVersions();
                    if (composerInfo2 == null) {
                    }
                    if (composerInfo2 == null) {
                    }
                    String abVariants = errorSummaryState3.getAbVariants();
                    ErrorSummarySharedDTO errorSummarySharedDTO = new ErrorSummarySharedDTO(str17, str16, str15, str14, r21, l13, num4, str13, str6, meshVersions, r27, r28, list, abVariants == null ? h.m(abVariants, new String[]{", "}, 0, 6) : null, list3, r32);
                    w0Var = errorSummaryViewModel._commandFlow;
                    jsonSerializer = errorSummaryViewModel.jsonSerializer;
                    ErrorSummaryCommand.Share share = new ErrorSummaryCommand.Share(jsonSerializer.toJson((JsonSerializer) errorSummarySharedDTO, (Class<JsonSerializer>) ErrorSummarySharedDTO.class));
                    this.L$0 = errorSummaryState2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = null;
                    this.L$12 = null;
                    this.L$13 = null;
                    this.label = 3;
                }
                return aVar;
            }
            if (i11 == 2) {
                List list4 = (List) this.L$13;
                String str18 = (String) this.L$12;
                str5 = (String) this.L$11;
                num = (Integer) this.L$10;
                str3 = (String) this.L$9;
                l11 = (Long) this.L$8;
                str4 = (String) this.L$7;
                str2 = (String) this.L$6;
                str = (String) this.L$5;
                composerInfo2 = (ScreenState.ServerIssue.ComposerInfo) this.L$4;
                serverIssue2 = (ScreenState.ServerIssue) this.L$3;
                errorSummaryState3 = (ErrorSummaryState) this.L$2;
                errorSummaryViewModel = (ErrorSummaryViewModel) this.L$1;
                errorSummaryState2 = (ErrorSummaryState) this.L$0;
                s.b(obj);
                list = list4;
                str6 = str18;
                experiments = obj;
                String str132 = str5;
                Integer num42 = num;
                String str142 = str3;
                Long l132 = l11;
                String str152 = str4;
                String str162 = str2;
                String str172 = str;
                List list32 = (List) experiments;
                if (composerInfo2 != null || (invalidWidgets = composerInfo2.getInvalidWidgets()) == null) {
                    arrayList = null;
                } else {
                    List<ScreenState.ServerIssue.ComposerInfo.InvalidWidget> list5 = invalidWidgets;
                    arrayList = new ArrayList(C7714v.z(list5, 10));
                    Iterator<T> it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ErrorSummaryInvalidWidgetSharedDTOKt.mapToSharedDto((ScreenState.ServerIssue.ComposerInfo.InvalidWidget) it.next()));
                    }
                }
                ArrayList arrayList2 = (arrayList == null && (arrayList.isEmpty() ^ true)) ? arrayList : null;
                String traceId = serverIssue2 == null ? serverIssue2.getTraceId() : null;
                String meshVersions2 = errorSummaryState3.getMeshVersions();
                Integer layoutId = composerInfo2 == null ? composerInfo2.getLayoutId() : null;
                Integer layoutVersion = composerInfo2 == null ? composerInfo2.getLayoutVersion() : null;
                String abVariants2 = errorSummaryState3.getAbVariants();
                ErrorSummarySharedDTO errorSummarySharedDTO2 = new ErrorSummarySharedDTO(str172, str162, str152, str142, traceId, l132, num42, str132, str6, meshVersions2, layoutId, layoutVersion, list, abVariants2 == null ? h.m(abVariants2, new String[]{", "}, 0, 6) : null, list32, arrayList2);
                w0Var = errorSummaryViewModel._commandFlow;
                jsonSerializer = errorSummaryViewModel.jsonSerializer;
                ErrorSummaryCommand.Share share2 = new ErrorSummaryCommand.Share(jsonSerializer.toJson((JsonSerializer) errorSummarySharedDTO2, (Class<JsonSerializer>) ErrorSummarySharedDTO.class));
                this.L$0 = errorSummaryState2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.label = 3;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ErrorSummaryViewModel$onShareButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

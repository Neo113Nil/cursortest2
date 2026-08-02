package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Button;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ButtonStyle;
import com.socure.docv.capturesdk.models.ButtonModel;
import com.socure.docv.capturesdk.models.ButtonStyleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ButtonMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ButtonMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "Lcom/socure/docv/capturesdk/models/ButtonModel;", "buttonStyleMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "(Lcom/socure/docv/capturesdk/common/mapper/Mapper;)V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonMapper implements Mapper<Button, ButtonModel> {
    private final Mapper<ButtonStyle, ButtonStyleModel> buttonStyleMapper;

    public ButtonMapper(Mapper<ButtonStyle, ButtonStyleModel> buttonStyleMapper) {
        Intrinsics.checkNotNullParameter(buttonStyleMapper, "buttonStyleMapper");
        this.buttonStyleMapper = buttonStyleMapper;
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends Button> list, Continuation<? super List<? extends ButtonModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(Button button, Continuation<? super ButtonModel> continuation) {
        ButtonMapper$map$1 buttonMapper$map$1;
        Object coroutine_suspended;
        int i;
        ButtonMapper buttonMapper;
        Object map;
        ButtonStyleModel buttonStyleModel;
        if (continuation instanceof ButtonMapper$map$1) {
            buttonMapper$map$1 = (ButtonMapper$map$1) continuation;
            if ((buttonMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                buttonMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = buttonMapper$map$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = buttonMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Mapper<ButtonStyle, ButtonStyleModel> mapper = this.buttonStyleMapper;
                    ButtonStyle primary = button != null ? button.getPrimary() : null;
                    buttonMapper$map$1.L$0 = this;
                    buttonMapper$map$1.L$1 = button;
                    buttonMapper$map$1.label = 1;
                    obj = mapper.map((Mapper<ButtonStyle, ButtonStyleModel>) primary, (Continuation<? super ButtonStyleModel>) buttonMapper$map$1);
                    if (obj != coroutine_suspended) {
                        buttonMapper = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    buttonStyleModel = (ButtonStyleModel) buttonMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return new ButtonModel(buttonStyleModel, (ButtonStyleModel) obj);
                }
                button = (Button) buttonMapper$map$1.L$1;
                buttonMapper = (ButtonMapper) buttonMapper$map$1.L$0;
                ResultKt.throwOnFailure(obj);
                ButtonStyleModel buttonStyleModel2 = (ButtonStyleModel) obj;
                Mapper<ButtonStyle, ButtonStyleModel> mapper2 = buttonMapper.buttonStyleMapper;
                ButtonStyle secondary = button == null ? button.getSecondary() : null;
                buttonMapper$map$1.L$0 = buttonStyleModel2;
                buttonMapper$map$1.L$1 = null;
                buttonMapper$map$1.label = 2;
                map = mapper2.map((Mapper<ButtonStyle, ButtonStyleModel>) secondary, (Continuation<? super ButtonStyleModel>) buttonMapper$map$1);
                if (map != coroutine_suspended) {
                    obj = map;
                    buttonStyleModel = buttonStyleModel2;
                    return new ButtonModel(buttonStyleModel, (ButtonStyleModel) obj);
                }
                return coroutine_suspended;
            }
        }
        buttonMapper$map$1 = new ButtonMapper$map$1(this, continuation);
        Object obj2 = buttonMapper$map$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buttonMapper$map$1.label;
        if (i != 0) {
        }
        ButtonStyleModel buttonStyleModel22 = (ButtonStyleModel) obj2;
        Mapper<ButtonStyle, ButtonStyleModel> mapper22 = buttonMapper.buttonStyleMapper;
        if (button == null) {
        }
        buttonMapper$map$1.L$0 = buttonStyleModel22;
        buttonMapper$map$1.L$1 = null;
        buttonMapper$map$1.label = 2;
        map = mapper22.map((Mapper<ButtonStyle, ButtonStyleModel>) secondary, (Continuation<? super ButtonStyleModel>) buttonMapper$map$1);
        if (map != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}

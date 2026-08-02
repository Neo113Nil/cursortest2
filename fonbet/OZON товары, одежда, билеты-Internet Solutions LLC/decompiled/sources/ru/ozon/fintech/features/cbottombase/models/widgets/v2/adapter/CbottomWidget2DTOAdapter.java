package ru.ozon.fintech.features.cbottombase.models.widgets.v2.adapter;

import D3.g;
import F40.a;
import Sc.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.AnimatedCircleProgressDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.BoxV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.CheckBoxV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.ColumnV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinImageV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinInputDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinLottieV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FlexRowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.HorizontalProgressV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.LabelV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.LazyColumnDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.LazyRowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.PinProgressDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RadioV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RoundProgressV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextAreaV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextFieldV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.ToggleV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/adapter/CbottomWidget2DTOAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "LF40/a;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)LF40/a;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;LF40/a;)V", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "Companion", "a", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomWidget2DTOAdapter extends JsonAdapter<a> {

    @NotNull
    private static final String TYPE = "type";

    @NotNull
    private final Moshi moshi;

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95079a;

        static {
            int[] iArr = new int[CbottomElement2.values().length];
            try {
                iArr[CbottomElement2.TEXTATOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CbottomElement2.TEXTFIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CbottomElement2.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CbottomElement2.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CbottomElement2.BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CbottomElement2.BOX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CbottomElement2.ROW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CbottomElement2.COLUMN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CbottomElement2.LOTTIE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CbottomElement2.LAZYROW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CbottomElement2.FLEXROW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CbottomElement2.HORIZONTALPROGRESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CbottomElement2.ROUNDPROGRESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CbottomElement2.BUTTONV2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CbottomElement2.CHECKBOX.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CbottomElement2.RADIO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CbottomElement2.TOGGLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CbottomElement2.TEXTAREA.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CbottomElement2.INPUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CbottomElement2.PINPROGRESS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CbottomElement2.ANIMATEDCIRCLEPROGRESS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CbottomElement2.LAZYCOLUMN.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f95079a = iArr;
        }
    }

    public CbottomWidget2DTOAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    @NotNull
    public final Moshi getMoshi() {
        return this.moshi;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public a fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        n q11 = reader.q();
        q11.beginObject();
        boolean z11 = false;
        String str = null;
        while (q11.hasNext() && !z11) {
            if (Intrinsics.d(q11.nextName(), "type")) {
                str = q11.nextString();
                z11 = true;
            } else {
                q11.skipValue();
            }
        }
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (b.f95079a[CbottomElement2.valueOf(upperCase).ordinal()]) {
            case 1:
                return (a) g.c(TextItemV20DTO.class, this.moshi, reader);
            case 2:
                return (a) g.c(TextFieldV20DTO.class, this.moshi, reader);
            case 3:
                return (a) g.c(LabelV20DTO.class, this.moshi, reader);
            case 4:
                return (a) g.c(FinImageV20DTO.class, this.moshi, reader);
            case 5:
                return (a) g.c(FinButtonV20DTO.class, this.moshi, reader);
            case 6:
                return (a) g.c(BoxV20DTO.class, this.moshi, reader);
            case 7:
                return (a) g.c(RowV20DTO.class, this.moshi, reader);
            case 8:
                return (a) g.c(ColumnV20DTO.class, this.moshi, reader);
            case 9:
                return (a) g.c(FinLottieV20DTO.class, this.moshi, reader);
            case 10:
                return (a) g.c(LazyRowV20DTO.class, this.moshi, reader);
            case 11:
                return (a) g.c(FlexRowV20DTO.class, this.moshi, reader);
            case 12:
                return (a) g.c(HorizontalProgressV20DTO.class, this.moshi, reader);
            case 13:
                return (a) g.c(RoundProgressV20DTO.class, this.moshi, reader);
            case 14:
                return (a) g.c(FinButtonV22DTO.class, this.moshi, reader);
            case 15:
                return (a) g.c(CheckBoxV20DTO.class, this.moshi, reader);
            case 16:
                return (a) g.c(RadioV20DTO.class, this.moshi, reader);
            case 17:
                return (a) g.c(ToggleV20DTO.class, this.moshi, reader);
            case 18:
                return (a) g.c(TextAreaV22DTO.class, this.moshi, reader);
            case 19:
                return (a) g.c(FinInputDTO.class, this.moshi, reader);
            case 20:
                return (a) g.c(PinProgressDTO.class, this.moshi, reader);
            case 21:
                return (a) g.c(AnimatedCircleProgressDTO.class, this.moshi, reader);
            case 22:
                return (a) g.c(LazyColumnDTO.class, this.moshi, reader);
            default:
                throw new o();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, a value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            switch (b.f95079a[value.getType().ordinal()]) {
                case 1:
                    this.moshi.c(TextItemV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 2:
                    this.moshi.c(TextFieldV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 3:
                    this.moshi.c(LabelV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 4:
                    this.moshi.c(FinImageV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 5:
                    this.moshi.c(FinButtonV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 6:
                    this.moshi.c(BoxV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 7:
                    this.moshi.c(RowV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 8:
                    this.moshi.c(ColumnV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 9:
                    this.moshi.c(FinLottieV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 10:
                    this.moshi.c(LazyRowV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 11:
                    this.moshi.c(FlexRowV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 12:
                    this.moshi.c(HorizontalProgressV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 13:
                    this.moshi.c(RoundProgressV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 14:
                    this.moshi.c(FinButtonV22DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 15:
                    this.moshi.c(CheckBoxV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 16:
                    this.moshi.c(RadioV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 17:
                    this.moshi.c(ToggleV20DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 18:
                    this.moshi.c(TextAreaV22DTO.class).mo44toJson(writer, (x) value);
                    return;
                case 19:
                    this.moshi.c(FinInputDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 20:
                    this.moshi.c(PinProgressDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 21:
                    this.moshi.c(AnimatedCircleProgressDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 22:
                    this.moshi.c(LazyColumnDTO.class).mo44toJson(writer, (x) value);
                    return;
                default:
                    throw new o();
            }
        }
    }
}

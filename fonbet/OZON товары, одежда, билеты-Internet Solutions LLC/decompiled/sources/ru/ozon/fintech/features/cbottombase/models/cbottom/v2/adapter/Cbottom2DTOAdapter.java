package ru.ozon.fintech.features.cbottombase.models.cbottom.v2.adapter;

import D3.g;
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
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2FullDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ModalDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingV2DTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2PdfDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2StoriesDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2WebViewDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/adapter/Cbottom2DTOAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "", "findType", "(Lcom/squareup/moshi/n;)Ljava/lang/String;", "", "findVersion", "(Lcom/squareup/moshi/n;)Ljava/lang/Integer;", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;)V", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "Companion", "a", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cbottom2DTOAdapter extends JsonAdapter<a> {

    @NotNull
    private static final String TYPE = "type";

    @NotNull
    private static final String VERSION = "version";

    @NotNull
    private final Moshi moshi;

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95056a;

        static {
            int[] iArr = new int[CbottomType.values().length];
            try {
                iArr[CbottomType.SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CbottomType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CbottomType.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CbottomType.ONBOARDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CbottomType.MODAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CbottomType.SNACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CbottomType.WEBVIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CbottomType.STORIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CbottomType.PDF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f95056a = iArr;
        }
    }

    public Cbottom2DTOAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    private final String findType(n reader) {
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
        return str;
    }

    private final Integer findVersion(n reader) {
        n q11 = reader.q();
        q11.beginObject();
        boolean z11 = false;
        Integer num = null;
        while (q11.hasNext() && !z11) {
            if (Intrinsics.d(q11.nextName(), VERSION)) {
                num = Integer.valueOf(q11.nextInt());
                z11 = true;
            } else {
                q11.skipValue();
            }
        }
        return num;
    }

    @NotNull
    public final Moshi getMoshi() {
        return this.moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public a fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String findType = findType(reader);
        Integer findVersion = findVersion(reader);
        if (findType == null) {
            return null;
        }
        String upperCase = findType.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (b.f95056a[CbottomType.valueOf(upperCase).ordinal()]) {
            case 1:
                return (a) g.c(Cbottom2SheetDTO.class, this.moshi, reader);
            case 2:
                return (a) g.c(Cbottom2FullDTO.class, this.moshi, reader);
            case 3:
                return (a) g.c(Cbottom2ScreenDTO.class, this.moshi, reader);
            case 4:
                return (findVersion != null && findVersion.intValue() == 2) ? (a) g.c(Cbottom2OnboardingV2DTO.class, this.moshi, reader) : (a) g.c(Cbottom2OnboardingDTO.class, this.moshi, reader);
            case 5:
                return (a) g.c(Cbottom2ModalDTO.class, this.moshi, reader);
            case 6:
                return (a) g.c(Cbottom2SnackDTO.class, this.moshi, reader);
            case 7:
                return (a) g.c(Cbottom2WebViewDTO.class, this.moshi, reader);
            case 8:
                return (a) g.c(Cbottom2StoriesDTO.class, this.moshi, reader);
            case 9:
                return (a) g.c(Cbottom2PdfDTO.class, this.moshi, reader);
            default:
                throw new o();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, a value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            switch (b.f95056a[value.getType().ordinal()]) {
                case 1:
                    this.moshi.c(Cbottom2SheetDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 2:
                    this.moshi.c(Cbottom2FullDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 3:
                    this.moshi.c(Cbottom2ScreenDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 4:
                    Integer version = value.getVersion();
                    if (version != null && version.intValue() == 2) {
                        this.moshi.c(Cbottom2OnboardingV2DTO.class).mo44toJson(writer, (x) value);
                        return;
                    } else {
                        this.moshi.c(Cbottom2OnboardingDTO.class).mo44toJson(writer, (x) value);
                        return;
                    }
                case 5:
                    this.moshi.c(Cbottom2ModalDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 6:
                    this.moshi.c(Cbottom2SnackDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 7:
                    this.moshi.c(Cbottom2WebViewDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 8:
                    this.moshi.c(Cbottom2StoriesDTO.class).mo44toJson(writer, (x) value);
                    return;
                case 9:
                    this.moshi.c(Cbottom2PdfDTO.class).mo44toJson(writer, (x) value);
                    return;
                default:
                    throw new o();
            }
        }
    }
}

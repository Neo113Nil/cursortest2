package ru.ozon.app.android.atoms.data.controls.tag;

import D3.h;
import D40.c;
import I0.C3173b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import fi.EnumC6570a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.Rounds;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.image.ImageDTO;
import ru.ozon.app.android.atoms.data.indicator.IndicatorDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0004XYZ[BÇ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cB¥\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u001dB±\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001b\u0010\u001eB½\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001fJ\b\u00106\u001a\u000207H\u0016JÁ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u00109Jµ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010:J©\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010;J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001aHÆ\u0003JÎ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010LJ\u0006\u0010M\u001a\u000207J\u0013\u0010N\u001a\u00020\u00072\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u000207HÖ\u0001J\t\u0010R\u001a\u00020\u000bHÖ\u0001J\u0016\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u000207R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0006\u0010$R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\b\u0010$R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\t\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0016\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006\\"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "styleType", "Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;", "size", "Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;", "isSelected", "", "isDisabled", "isClosable", "icon", "", "text", "indicator", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "customDefaultStyle", "Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;", "customSelectedStyle", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "closeControlSettings", "context", "isStateChangeDisabled", "image", "Lru/ozon/app/android/atoms/data/image/ImageDTO;", "round", "Lru/ozon/app/android/atoms/data/common/Rounds;", "<init>", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/image/ImageDTO;Lru/ozon/app/android/atoms/data/common/Rounds;)V", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;)V", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/image/ImageDTO;)V", "getStyleType", "()Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;", "getSize", "()Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "()Ljava/lang/String;", "getText", "getIndicator", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "getCustomDefaultStyle", "()Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;", "getCustomSelectedStyle", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getCloseControlSettings", "getContext", "getImage", "()Lru/ozon/app/android/atoms/data/image/ImageDTO;", "getRound", "()Lru/ozon/app/android/atoms/data/common/Rounds;", "getItemType", "", "copy", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/image/ImageDTO;)Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO;", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO;", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "(Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/image/ImageDTO;Lru/ozon/app/android/atoms/data/common/Rounds;)Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Size", "StyleType", "CustomTagButtonStyle", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TagButtonDTO extends AtomDTO {
    public static final int $stable = 0;
    private final CommonControlSettings closeControlSettings;
    private final CommonControlSettings common;
    private final String context;
    private final CustomTagButtonStyle customDefaultStyle;
    private final CustomTagButtonStyle customSelectedStyle;
    private final String icon;
    private final ImageDTO image;
    private final IndicatorDTO indicator;
    private final Boolean isClosable;
    private final Boolean isDisabled;
    private final Boolean isSelected;
    private final Boolean isStateChangeDisabled;
    private final Rounds round;

    @EnumNullFallback
    private final Size size;

    @EnumNullFallback
    private final StyleType styleType;
    private final String text;

    @NotNull
    public static final Parcelable.Creator<TagButtonDTO> CREATOR = new Creator();

    @NotNull
    private static final StyleType DefaultStyleType = StyleType.DEFAULT;

    @NotNull
    private static final Size DefaultSize = Size.SIZE_600;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TagButtonDTO> {
        @Override // android.os.Parcelable.Creator
        public final TagButtonDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            StyleType styleType;
            ImageDTO createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StyleType valueOf5 = parcel.readInt() == 0 ? null : StyleType.valueOf(parcel.readString());
            Size valueOf6 = parcel.readInt() == 0 ? null : Size.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = valueOf2;
            String readString = parcel.readString();
            Boolean bool2 = valueOf3;
            String readString2 = parcel.readString();
            IndicatorDTO createFromParcel2 = parcel.readInt() == 0 ? null : IndicatorDTO.CREATOR.createFromParcel(parcel);
            CustomTagButtonStyle createFromParcel3 = parcel.readInt() == 0 ? null : CustomTagButtonStyle.CREATOR.createFromParcel(parcel);
            CustomTagButtonStyle createFromParcel4 = parcel.readInt() == 0 ? null : CustomTagButtonStyle.CREATOR.createFromParcel(parcel);
            CommonControlSettings createFromParcel5 = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
            CommonControlSettings createFromParcel6 = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
            boolean z11 = true;
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                valueOf4 = Boolean.valueOf(z11);
            }
            if (parcel.readInt() == 0) {
                styleType = valueOf5;
                createFromParcel = null;
            } else {
                styleType = valueOf5;
                createFromParcel = ImageDTO.CREATOR.createFromParcel(parcel);
            }
            return new TagButtonDTO(styleType, valueOf6, valueOf, bool, bool2, readString, readString2, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, readString3, valueOf4, createFromParcel, parcel.readInt() == 0 ? null : Rounds.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TagButtonDTO[] newArray(int i11) {
            return new TagButtonDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;", "Landroid/os/Parcelable;", "backgroundColor", "", "textColor", "iconColor", "closeIconColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTextColor", "getIconColor", "getCloseIconColor", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomTagButtonStyle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomTagButtonStyle> CREATOR = new Creator();
        private final String backgroundColor;
        private final String closeIconColor;
        private final String iconColor;
        private final String textColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomTagButtonStyle> {
            @Override // android.os.Parcelable.Creator
            public final CustomTagButtonStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomTagButtonStyle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomTagButtonStyle[] newArray(int i11) {
                return new CustomTagButtonStyle[i11];
            }
        }

        public CustomTagButtonStyle() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ CustomTagButtonStyle copy$default(CustomTagButtonStyle customTagButtonStyle, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customTagButtonStyle.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customTagButtonStyle.textColor;
            }
            if ((i11 & 4) != 0) {
                str3 = customTagButtonStyle.iconColor;
            }
            if ((i11 & 8) != 0) {
                str4 = customTagButtonStyle.closeIconColor;
            }
            return customTagButtonStyle.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCloseIconColor() {
            return this.closeIconColor;
        }

        @NotNull
        public final CustomTagButtonStyle copy(String backgroundColor, String textColor, String iconColor, String closeIconColor) {
            return new CustomTagButtonStyle(backgroundColor, textColor, iconColor, closeIconColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTagButtonStyle)) {
                return false;
            }
            CustomTagButtonStyle customTagButtonStyle = (CustomTagButtonStyle) other;
            return Intrinsics.d(this.backgroundColor, customTagButtonStyle.backgroundColor) && Intrinsics.d(this.textColor, customTagButtonStyle.textColor) && Intrinsics.d(this.iconColor, customTagButtonStyle.iconColor) && Intrinsics.d(this.closeIconColor, customTagButtonStyle.closeIconColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getCloseIconColor() {
            return this.closeIconColor;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.textColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.closeIconColor;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.textColor;
            return C3173b.c(C3660k.d("CustomTagButtonStyle(backgroundColor=", str, ", textColor=", str2, ", iconColor="), this.iconColor, ", closeIconColor=", this.closeIconColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.backgroundColor);
            dest.writeString(this.textColor);
            dest.writeString(this.iconColor);
            dest.writeString(this.closeIconColor);
        }

        public CustomTagButtonStyle(String str, String str2, String str3, String str4) {
            this.backgroundColor = str;
            this.textColor = str2;
            this.iconColor = str3;
            this.closeIconColor = str4;
        }

        public /* synthetic */ CustomTagButtonStyle(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$Size;", "", "Lfi/a;", "tagSize", "<init>", "(Ljava/lang/String;ILfi/a;)V", "Lfi/a;", "getTagSize", "()Lfi/a;", "SIZE_500", "SIZE_600", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SIZE_500 = new Size("SIZE_500", 0, EnumC6570a.TAG_500);
        public static final Size SIZE_600 = new Size("SIZE_600", 1, EnumC6570a.TAG_600);

        @NotNull
        private final EnumC6570a tagSize;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_500, SIZE_600};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11, EnumC6570a enumC6570a) {
            this.tagSize = enumC6570a;
        }

        @NotNull
        public static a<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        @NotNull
        public final EnumC6570a getTagSize() {
            return this.tagSize;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/tag/TagButtonDTO$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CUSTOM", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;
        public static final StyleType DEFAULT = new StyleType("DEFAULT", 0);
        public static final StyleType CUSTOM = new StyleType("CUSTOM", 1);

        private static final /* synthetic */ StyleType[] $values() {
            return new StyleType[]{DEFAULT, CUSTOM};
        }

        static {
            StyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleType(String str, int i11) {
        }

        @NotNull
        public static a<StyleType> getEntries() {
            return $ENTRIES;
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }

    public TagButtonDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ TagButtonDTO copy$default(TagButtonDTO tagButtonDTO, StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, Boolean bool4, ImageDTO imageDTO, Rounds rounds, int i11, Object obj) {
        return tagButtonDTO.copy((i11 & 1) != 0 ? tagButtonDTO.styleType : styleType, (i11 & 2) != 0 ? tagButtonDTO.size : size, (i11 & 4) != 0 ? tagButtonDTO.isSelected : bool, (i11 & 8) != 0 ? tagButtonDTO.isDisabled : bool2, (i11 & 16) != 0 ? tagButtonDTO.isClosable : bool3, (i11 & 32) != 0 ? tagButtonDTO.icon : str, (i11 & 64) != 0 ? tagButtonDTO.text : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButtonDTO.indicator : indicatorDTO, (i11 & 256) != 0 ? tagButtonDTO.customDefaultStyle : customTagButtonStyle, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButtonDTO.customSelectedStyle : customTagButtonStyle2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButtonDTO.common : commonControlSettings, (i11 & 2048) != 0 ? tagButtonDTO.closeControlSettings : commonControlSettings2, (i11 & 4096) != 0 ? tagButtonDTO.context : str3, (i11 & 8192) != 0 ? tagButtonDTO.isStateChangeDisabled : bool4, (i11 & 16384) != 0 ? tagButtonDTO.image : imageDTO, (i11 & 32768) != 0 ? tagButtonDTO.round : rounds);
    }

    /* renamed from: component1, reason: from getter */
    public final StyleType getStyleType() {
        return this.styleType;
    }

    /* renamed from: component10, reason: from getter */
    public final CustomTagButtonStyle getCustomSelectedStyle() {
        return this.customSelectedStyle;
    }

    /* renamed from: component11, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component12, reason: from getter */
    public final CommonControlSettings getCloseControlSettings() {
        return this.closeControlSettings;
    }

    /* renamed from: component13, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsStateChangeDisabled() {
        return this.isStateChangeDisabled;
    }

    /* renamed from: component15, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component16, reason: from getter */
    public final Rounds getRound() {
        return this.round;
    }

    /* renamed from: component2, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsClosable() {
        return this.isClosable;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component8, reason: from getter */
    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    /* renamed from: component9, reason: from getter */
    public final CustomTagButtonStyle getCustomDefaultStyle() {
        return this.customDefaultStyle;
    }

    @NotNull
    public final TagButtonDTO copy(StyleType styleType, Size size, Boolean isSelected, Boolean isDisabled, Boolean isClosable, String icon, String text, IndicatorDTO indicator, CustomTagButtonStyle customDefaultStyle, CustomTagButtonStyle customSelectedStyle, CommonControlSettings common, CommonControlSettings closeControlSettings, String context, Boolean isStateChangeDisabled, ImageDTO image, Rounds round) {
        return new TagButtonDTO(styleType, size, isSelected, isDisabled, isClosable, icon, text, indicator, customDefaultStyle, customSelectedStyle, common, closeControlSettings, context, isStateChangeDisabled, image, round);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagButtonDTO)) {
            return false;
        }
        TagButtonDTO tagButtonDTO = (TagButtonDTO) other;
        return this.styleType == tagButtonDTO.styleType && this.size == tagButtonDTO.size && Intrinsics.d(this.isSelected, tagButtonDTO.isSelected) && Intrinsics.d(this.isDisabled, tagButtonDTO.isDisabled) && Intrinsics.d(this.isClosable, tagButtonDTO.isClosable) && Intrinsics.d(this.icon, tagButtonDTO.icon) && Intrinsics.d(this.text, tagButtonDTO.text) && Intrinsics.d(this.indicator, tagButtonDTO.indicator) && Intrinsics.d(this.customDefaultStyle, tagButtonDTO.customDefaultStyle) && Intrinsics.d(this.customSelectedStyle, tagButtonDTO.customSelectedStyle) && Intrinsics.d(this.common, tagButtonDTO.common) && Intrinsics.d(this.closeControlSettings, tagButtonDTO.closeControlSettings) && Intrinsics.d(this.context, tagButtonDTO.context) && Intrinsics.d(this.isStateChangeDisabled, tagButtonDTO.isStateChangeDisabled) && Intrinsics.d(this.image, tagButtonDTO.image) && this.round == tagButtonDTO.round;
    }

    public final CommonControlSettings getCloseControlSettings() {
        return this.closeControlSettings;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final CustomTagButtonStyle getCustomDefaultStyle() {
        return this.customDefaultStyle;
    }

    public final CustomTagButtonStyle getCustomSelectedStyle() {
        return this.customSelectedStyle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.tagButton;
    }

    public final Rounds getRound() {
        return this.round;
    }

    public final Size getSize() {
        return this.size;
    }

    public final StyleType getStyleType() {
        return this.styleType;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        StyleType styleType = this.styleType;
        int hashCode = (styleType == null ? 0 : styleType.hashCode()) * 31;
        Size size = this.size;
        int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDisabled;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isClosable;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.icon;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode8 = (hashCode7 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        CustomTagButtonStyle customTagButtonStyle = this.customDefaultStyle;
        int hashCode9 = (hashCode8 + (customTagButtonStyle == null ? 0 : customTagButtonStyle.hashCode())) * 31;
        CustomTagButtonStyle customTagButtonStyle2 = this.customSelectedStyle;
        int hashCode10 = (hashCode9 + (customTagButtonStyle2 == null ? 0 : customTagButtonStyle2.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode11 = (hashCode10 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        CommonControlSettings commonControlSettings2 = this.closeControlSettings;
        int hashCode12 = (hashCode11 + (commonControlSettings2 == null ? 0 : commonControlSettings2.hashCode())) * 31;
        String str3 = this.context;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.isStateChangeDisabled;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int hashCode15 = (hashCode14 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        Rounds rounds = this.round;
        return hashCode15 + (rounds != null ? rounds.hashCode() : 0);
    }

    public final Boolean isClosable() {
        return this.isClosable;
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final Boolean isStateChangeDisabled() {
        return this.isStateChangeDisabled;
    }

    @NotNull
    public String toString() {
        StyleType styleType = this.styleType;
        Size size = this.size;
        Boolean bool = this.isSelected;
        Boolean bool2 = this.isDisabled;
        Boolean bool3 = this.isClosable;
        String str = this.icon;
        String str2 = this.text;
        IndicatorDTO indicatorDTO = this.indicator;
        CustomTagButtonStyle customTagButtonStyle = this.customDefaultStyle;
        CustomTagButtonStyle customTagButtonStyle2 = this.customSelectedStyle;
        CommonControlSettings commonControlSettings = this.common;
        CommonControlSettings commonControlSettings2 = this.closeControlSettings;
        String str3 = this.context;
        Boolean bool4 = this.isStateChangeDisabled;
        ImageDTO imageDTO = this.image;
        Rounds rounds = this.round;
        StringBuilder sb2 = new StringBuilder("TagButtonDTO(styleType=");
        sb2.append(styleType);
        sb2.append(", size=");
        sb2.append(size);
        sb2.append(", isSelected=");
        h.h(sb2, bool, ", isDisabled=", bool2, ", isClosable=");
        HY.b.c(bool3, ", icon=", str, ", text=", sb2);
        sb2.append(str2);
        sb2.append(", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(", customDefaultStyle=");
        sb2.append(customTagButtonStyle);
        sb2.append(", customSelectedStyle=");
        sb2.append(customTagButtonStyle2);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", closeControlSettings=");
        sb2.append(commonControlSettings2);
        sb2.append(", context=");
        Sh.a.d(bool4, str3, ", isStateChangeDisabled=", ", image=", sb2);
        sb2.append(imageDTO);
        sb2.append(", round=");
        sb2.append(rounds);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StyleType styleType = this.styleType;
        if (styleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleType.name());
        }
        Size size = this.size;
        if (size == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(size.name());
        }
        Boolean bool = this.isSelected;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.isDisabled;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        Boolean bool3 = this.isClosable;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool3);
        }
        dest.writeString(this.icon);
        dest.writeString(this.text);
        IndicatorDTO indicatorDTO = this.indicator;
        if (indicatorDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            indicatorDTO.writeToParcel(dest, flags);
        }
        CustomTagButtonStyle customTagButtonStyle = this.customDefaultStyle;
        if (customTagButtonStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customTagButtonStyle.writeToParcel(dest, flags);
        }
        CustomTagButtonStyle customTagButtonStyle2 = this.customSelectedStyle;
        if (customTagButtonStyle2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customTagButtonStyle2.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings2 = this.closeControlSettings;
        if (commonControlSettings2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings2.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        Boolean bool4 = this.isStateChangeDisabled;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool4);
        }
        ImageDTO imageDTO = this.image;
        if (imageDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageDTO.writeToParcel(dest, flags);
        }
        Rounds rounds = this.round;
        if (rounds == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(rounds.name());
        }
    }

    public /* synthetic */ TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, Boolean bool4, ImageDTO imageDTO, Rounds rounds, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DefaultStyleType : styleType, (i11 & 2) != 0 ? DefaultSize : size, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2, (i11 & 16) != 0 ? Boolean.FALSE : bool3, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : indicatorDTO, (i11 & 256) != 0 ? null : customTagButtonStyle, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : customTagButtonStyle2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : commonControlSettings, (i11 & 2048) != 0 ? null : commonControlSettings2, (i11 & 4096) != 0 ? null : str3, (i11 & 8192) != 0 ? Boolean.FALSE : bool4, (i11 & 16384) != 0 ? null : imageDTO, (i11 & 32768) != 0 ? null : rounds);
    }

    @InterfaceC3999a
    public final /* synthetic */ TagButtonDTO copy(StyleType styleType, Size size, Boolean isSelected, Boolean isDisabled, Boolean isClosable, String icon, String text, IndicatorDTO indicator, CustomTagButtonStyle customDefaultStyle, CustomTagButtonStyle customSelectedStyle, CommonControlSettings common, CommonControlSettings closeControlSettings, String context, Boolean isStateChangeDisabled, ImageDTO image) {
        return copy(styleType, size, isSelected, isDisabled, isClosable, icon, text, indicator, customDefaultStyle, customSelectedStyle, common, closeControlSettings, context, isStateChangeDisabled, image, null);
    }

    @InterfaceC3999a
    @NotNull
    public final TagButtonDTO copy(StyleType styleType, Size size, Boolean isSelected, Boolean isDisabled, Boolean isClosable, String icon, String text, IndicatorDTO indicator, CustomTagButtonStyle customDefaultStyle, CustomTagButtonStyle customSelectedStyle, CommonControlSettings common, CommonControlSettings closeControlSettings, String context, Boolean isStateChangeDisabled) {
        return copy$default(this, styleType, size, isSelected, isDisabled, isClosable, icon, text, indicator, customDefaultStyle, customSelectedStyle, common, closeControlSettings, context, isStateChangeDisabled, this.image, null, 32768, null);
    }

    @InterfaceC3999a
    @NotNull
    public final TagButtonDTO copy(StyleType styleType, Size size, Boolean isSelected, Boolean isDisabled, Boolean isClosable, String icon, String text, IndicatorDTO indicator, CustomTagButtonStyle customDefaultStyle, CustomTagButtonStyle customSelectedStyle, CommonControlSettings common, CommonControlSettings closeControlSettings, String context) {
        return copy$default(this, styleType, size, isSelected, isDisabled, isClosable, icon, text, indicator, customDefaultStyle, customSelectedStyle, common, closeControlSettings, context, this.isStateChangeDisabled, null, null, 32768, null);
    }

    public TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, Boolean bool4, ImageDTO imageDTO, Rounds rounds) {
        super(DsAtomsType.TAG_BUTTON, str3, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.styleType = styleType;
        this.size = size;
        this.isSelected = bool;
        this.isDisabled = bool2;
        this.isClosable = bool3;
        this.icon = str;
        this.text = str2;
        this.indicator = indicatorDTO;
        this.customDefaultStyle = customTagButtonStyle;
        this.customSelectedStyle = customTagButtonStyle2;
        this.common = commonControlSettings;
        this.closeControlSettings = commonControlSettings2;
        this.context = str3;
        this.isStateChangeDisabled = bool4;
        this.image = imageDTO;
        this.round = rounds;
    }

    public /* synthetic */ TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? StyleType.DEFAULT : styleType, (i11 & 2) != 0 ? Size.SIZE_600 : size, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2, (i11 & 16) != 0 ? Boolean.FALSE : bool3, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : indicatorDTO, (i11 & 256) != 0 ? null : customTagButtonStyle, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : customTagButtonStyle2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : commonControlSettings, (i11 & 2048) != 0 ? null : commonControlSettings2, (i11 & 4096) != 0 ? null : str3);
    }

    public static /* synthetic */ TagButtonDTO copy$default(TagButtonDTO tagButtonDTO, StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            styleType = tagButtonDTO.styleType;
        }
        return tagButtonDTO.copy(styleType, (i11 & 2) != 0 ? tagButtonDTO.size : size, (i11 & 4) != 0 ? tagButtonDTO.isSelected : bool, (i11 & 8) != 0 ? tagButtonDTO.isDisabled : bool2, (i11 & 16) != 0 ? tagButtonDTO.isClosable : bool3, (i11 & 32) != 0 ? tagButtonDTO.icon : str, (i11 & 64) != 0 ? tagButtonDTO.text : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButtonDTO.indicator : indicatorDTO, (i11 & 256) != 0 ? tagButtonDTO.customDefaultStyle : customTagButtonStyle, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButtonDTO.customSelectedStyle : customTagButtonStyle2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButtonDTO.common : commonControlSettings, (i11 & 2048) != 0 ? tagButtonDTO.closeControlSettings : commonControlSettings2, (i11 & 4096) != 0 ? tagButtonDTO.getContext() : str3);
    }

    @InterfaceC3999a
    public /* synthetic */ TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3) {
        this(styleType, size, bool, bool2, bool3, str, str2, indicatorDTO, customTagButtonStyle, customTagButtonStyle2, commonControlSettings, commonControlSettings2, str3, Boolean.FALSE, (ImageDTO) null);
    }

    public /* synthetic */ TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, Boolean bool4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DefaultStyleType : styleType, (i11 & 2) != 0 ? DefaultSize : size, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2, (i11 & 16) != 0 ? Boolean.FALSE : bool3, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : indicatorDTO, (i11 & 256) != 0 ? null : customTagButtonStyle, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : customTagButtonStyle2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : commonControlSettings, (i11 & 2048) != 0 ? null : commonControlSettings2, (i11 & 4096) == 0 ? str3 : null, (i11 & 8192) != 0 ? Boolean.FALSE : bool4);
    }

    @InterfaceC3999a
    public TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, Boolean bool4) {
        this(styleType, size, bool, bool2, bool3, str, str2, indicatorDTO, customTagButtonStyle, customTagButtonStyle2, commonControlSettings, commonControlSettings2, str3, bool4, (ImageDTO) null);
    }

    public /* synthetic */ TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, Boolean bool4, ImageDTO imageDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DefaultStyleType : styleType, (i11 & 2) != 0 ? DefaultSize : size, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2, (i11 & 16) != 0 ? Boolean.FALSE : bool3, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : indicatorDTO, (i11 & 256) != 0 ? null : customTagButtonStyle, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : customTagButtonStyle2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : commonControlSettings, (i11 & 2048) != 0 ? null : commonControlSettings2, (i11 & 4096) != 0 ? null : str3, (i11 & 8192) != 0 ? Boolean.FALSE : bool4, (i11 & 16384) != 0 ? null : imageDTO);
    }

    @InterfaceC3999a
    public TagButtonDTO(StyleType styleType, Size size, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, IndicatorDTO indicatorDTO, CustomTagButtonStyle customTagButtonStyle, CustomTagButtonStyle customTagButtonStyle2, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str3, Boolean bool4, ImageDTO imageDTO) {
        this(styleType, size, bool, bool2, bool3, str, str2, indicatorDTO, customTagButtonStyle, customTagButtonStyle2, commonControlSettings, commonControlSettings2, str3, bool4, imageDTO, (Rounds) null);
    }
}

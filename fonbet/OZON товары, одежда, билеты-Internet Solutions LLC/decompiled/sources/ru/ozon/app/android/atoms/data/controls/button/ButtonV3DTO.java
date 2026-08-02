package ru.ozon.app.android.atoms.data.controls.button;

import D40.c;
import G.g;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import ji.C7431b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.A11yInfo;
import ru.ozon.app.android.atoms.data.common.Rounds;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002YZBÏ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bBÅ\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001cB¹\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u001dB\u00ad\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001eJË\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00107J¿\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u00108J³\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020;H\u0016J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010K\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0019HÆ\u0003JØ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010MJ\u0006\u0010N\u001a\u00020;J\u0013\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020;HÖ\u0001J\t\u0010S\u001a\u00020\u0007HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020;R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u000b\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0015\u0010(R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006["}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/atoms/data/controls/button/ButtonsDTO;", "styleType", "Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "size", "Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "icon", "dataText", "isDisabled", "", "titleColor", "dataTextColor", "subtitleColor", "iconColor", "dataBackgroundColor", "backgroundColor", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "isHoverDisabled", "a11yInfo", "Lru/ozon/app/android/atoms/data/common/A11yInfo;", "round", "Lru/ozon/app/android/atoms/data/common/Rounds;", "<init>", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/A11yInfo;Lru/ozon/app/android/atoms/data/common/Rounds;)V", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/A11yInfo;)V", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)V", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)V", "getStyleType", "()Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "getSize", "()Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIcon", "getDataText", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitleColor", "getDataTextColor", "getSubtitleColor", "getIconColor", "getDataBackgroundColor", "getBackgroundColor", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getA11yInfo", "()Lru/ozon/app/android/atoms/data/common/A11yInfo;", "getRound", "()Lru/ozon/app/android/atoms/data/common/Rounds;", "copy", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/A11yInfo;)Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "(Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/A11yInfo;Lru/ozon/app/android/atoms/data/common/Rounds;)Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Sizes", "StyleTypes", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonV3DTO extends ButtonsDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ButtonV3DTO> CREATOR = new Creator();
    private final A11yInfo a11yInfo;
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final String dataBackgroundColor;
    private final String dataText;
    private final String dataTextColor;
    private final String icon;
    private final String iconColor;
    private final Boolean isDisabled;
    private final Boolean isHoverDisabled;
    private final Rounds round;

    @EnumNullFallback
    private final Sizes size;

    @EnumNullFallback
    private final StyleTypes styleType;
    private final String subtitle;
    private final String subtitleColor;

    @NotNull
    private final String title;
    private final String titleColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonV3DTO> {
        @Override // android.os.Parcelable.Creator
        public final ButtonV3DTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            StyleTypes styleTypes;
            A11yInfo createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StyleTypes valueOf3 = parcel.readInt() == 0 ? null : StyleTypes.valueOf(parcel.readString());
            Sizes valueOf4 = parcel.readInt() == 0 ? null : Sizes.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            boolean z11 = false;
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            CommonControlSettings createFromParcel2 = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                valueOf2 = Boolean.valueOf(z11);
            }
            if (parcel.readInt() == 0) {
                styleTypes = valueOf3;
                createFromParcel = null;
            } else {
                styleTypes = valueOf3;
                createFromParcel = A11yInfo.CREATOR.createFromParcel(parcel);
            }
            return new ButtonV3DTO(styleTypes, valueOf4, readString, readString2, readString3, readString4, valueOf, readString5, readString6, readString7, readString8, readString9, readString10, createFromParcel2, valueOf2, createFromParcel, parcel.readInt() == 0 ? null : Rounds.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonV3DTO[] newArray(int i11) {
            return new ButtonV3DTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bBA\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes;", "", "height", "", "cornerRadius", "horizontalMargin", "dataCornerRadius", "dataHorizontalPadding", "dataVerticalPadding", "dataMargin", "<init>", "(Ljava/lang/String;IIIIIIII)V", "getHeight", "()I", "getCornerRadius", "getHorizontalMargin", "getDataCornerRadius", "getDataHorizontalPadding", "getDataVerticalPadding", "getDataMargin", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "getCornersRadius", "context", "Landroid/content/Context;", "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sizes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Sizes[] $VALUES;

        @NotNull
        private static final Companion Companion;
        private static final int RADIUS_ROUNDED = 99;
        public static final Sizes SIZE_400 = new Sizes("SIZE_400", 0, 32, 10, 12, 0, 0, 0, 12);
        public static final Sizes SIZE_500 = new Sizes("SIZE_500", 1, 44, 12, 16, 0, 0, 0, 16);
        public static final Sizes SIZE_600 = new Sizes("SIZE_600", 2, 56, 16, 24, 6, 8, 4, 12);
        public static final Sizes SIZE_700 = new Sizes("SIZE_700", 3, 72, 20, 32, 8, 12, 8, 16);
        private final int cornerRadius;
        private final int dataCornerRadius;
        private final int dataHorizontalPadding;
        private final int dataMargin;
        private final int dataVerticalPadding;
        private final int height;
        private final int horizontalMargin;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$Sizes$Companion;", "", "<init>", "()V", "RADIUS_ROUNDED", "", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Sizes[] $values() {
            return new Sizes[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            Sizes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            Companion = new Companion(null);
        }

        private Sizes(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.height = i12;
            this.cornerRadius = i13;
            this.horizontalMargin = i14;
            this.dataCornerRadius = i15;
            this.dataHorizontalPadding = i16;
            this.dataVerticalPadding = i17;
            this.dataMargin = i18;
        }

        @NotNull
        public static a<Sizes> getEntries() {
            return $ENTRIES;
        }

        public static Sizes valueOf(String str) {
            return (Sizes) Enum.valueOf(Sizes.class, str);
        }

        public static Sizes[] values() {
            return (Sizes[]) $VALUES.clone();
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        @InterfaceC3999a
        public final /* synthetic */ int getCornersRadius(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C7431b.a(context)) {
                return 99;
            }
            return this.cornerRadius;
        }

        public final int getDataCornerRadius() {
            return this.dataCornerRadius;
        }

        public final int getDataHorizontalPadding() {
            return this.dataHorizontalPadding;
        }

        public final int getDataMargin() {
            return this.dataMargin;
        }

        public final int getDataVerticalPadding() {
            return this.dataVerticalPadding;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getHorizontalMargin() {
            return this.horizontalMargin;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_PRIMARY", "ACTION_SECONDARY", "ACCENT_PRIMARY", "ACCENT_SECONDARY", "NEGATIVE", "CUSTOM", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleTypes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleTypes[] $VALUES;
        public static final StyleTypes ACTION_PRIMARY = new StyleTypes("ACTION_PRIMARY", 0);
        public static final StyleTypes ACTION_SECONDARY = new StyleTypes("ACTION_SECONDARY", 1);
        public static final StyleTypes ACCENT_PRIMARY = new StyleTypes("ACCENT_PRIMARY", 2);
        public static final StyleTypes ACCENT_SECONDARY = new StyleTypes("ACCENT_SECONDARY", 3);
        public static final StyleTypes NEGATIVE = new StyleTypes("NEGATIVE", 4);
        public static final StyleTypes CUSTOM = new StyleTypes("CUSTOM", 5);

        private static final /* synthetic */ StyleTypes[] $values() {
            return new StyleTypes[]{ACTION_PRIMARY, ACTION_SECONDARY, ACCENT_PRIMARY, ACCENT_SECONDARY, NEGATIVE, CUSTOM};
        }

        static {
            StyleTypes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleTypes(String str, int i11) {
        }

        @NotNull
        public static a<StyleTypes> getEntries() {
            return $ENTRIES;
        }

        public static StyleTypes valueOf(String str) {
            return (StyleTypes) Enum.valueOf(StyleTypes.class, str);
        }

        public static StyleTypes[] values() {
            return (StyleTypes[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ButtonV3DTO(ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes r21, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.Sizes r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, ru.ozon.app.android.atoms.data.controls.CommonControlSettings r34, java.lang.Boolean r35, ru.ozon.app.android.atoms.data.common.A11yInfo r36, ru.ozon.app.android.atoms.data.common.Rounds r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto La
            ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes r1 = ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes.ACTION_PRIMARY
            r3 = r1
            goto Lc
        La:
            r3 = r21
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$Sizes r1 = ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.Sizes.SIZE_500
            r4 = r1
            goto L16
        L14:
            r4 = r22
        L16:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L1d
            r6 = r2
            goto L1f
        L1d:
            r6 = r24
        L1f:
            r1 = r0 & 16
            if (r1 == 0) goto L25
            r7 = r2
            goto L27
        L25:
            r7 = r25
        L27:
            r1 = r0 & 32
            if (r1 == 0) goto L2d
            r8 = r2
            goto L2f
        L2d:
            r8 = r26
        L2f:
            r1 = r0 & 64
            if (r1 == 0) goto L37
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r9 = r1
            goto L39
        L37:
            r9 = r27
        L39:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3f
            r10 = r2
            goto L41
        L3f:
            r10 = r28
        L41:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L47
            r11 = r2
            goto L49
        L47:
            r11 = r29
        L49:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4f
            r12 = r2
            goto L51
        L4f:
            r12 = r30
        L51:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L57
            r13 = r2
            goto L59
        L57:
            r13 = r31
        L59:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5f
            r14 = r2
            goto L61
        L5f:
            r14 = r32
        L61:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L67
            r15 = r2
            goto L69
        L67:
            r15 = r33
        L69:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L70
            r16 = r2
            goto L72
        L70:
            r16 = r34
        L72:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L7b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r17 = r1
            goto L7d
        L7b:
            r17 = r35
        L7d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L86
            r18 = r2
            goto L88
        L86:
            r18 = r36
        L88:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L94
            r19 = r2
            r5 = r23
            r2 = r20
            goto L9a
        L94:
            r19 = r37
            r2 = r20
            r5 = r23
        L9a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.<init>(ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$Sizes, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.app.android.atoms.data.controls.CommonControlSettings, java.lang.Boolean, ru.ozon.app.android.atoms.data.common.A11yInfo, ru.ozon.app.android.atoms.data.common.Rounds, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ ButtonV3DTO copy$default(ButtonV3DTO buttonV3DTO, StyleTypes styleTypes, Sizes sizes, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, CommonControlSettings commonControlSettings, Boolean bool2, A11yInfo a11yInfo, Rounds rounds, int i11, Object obj) {
        Rounds rounds2;
        A11yInfo a11yInfo2;
        StyleTypes styleTypes2;
        ButtonV3DTO buttonV3DTO2;
        Boolean bool3;
        Sizes sizes2;
        String str11;
        String str12;
        String str13;
        String str14;
        Boolean bool4;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        CommonControlSettings commonControlSettings2;
        StyleTypes styleTypes3 = (i11 & 1) != 0 ? buttonV3DTO.styleType : styleTypes;
        Sizes sizes3 = (i11 & 2) != 0 ? buttonV3DTO.size : sizes;
        String str21 = (i11 & 4) != 0 ? buttonV3DTO.title : str;
        String str22 = (i11 & 8) != 0 ? buttonV3DTO.subtitle : str2;
        String str23 = (i11 & 16) != 0 ? buttonV3DTO.icon : str3;
        String str24 = (i11 & 32) != 0 ? buttonV3DTO.dataText : str4;
        Boolean bool5 = (i11 & 64) != 0 ? buttonV3DTO.isDisabled : bool;
        String str25 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? buttonV3DTO.titleColor : str5;
        String str26 = (i11 & 256) != 0 ? buttonV3DTO.dataTextColor : str6;
        String str27 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? buttonV3DTO.subtitleColor : str7;
        String str28 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? buttonV3DTO.iconColor : str8;
        String str29 = (i11 & 2048) != 0 ? buttonV3DTO.dataBackgroundColor : str9;
        String str30 = (i11 & 4096) != 0 ? buttonV3DTO.backgroundColor : str10;
        CommonControlSettings commonControlSettings3 = (i11 & 8192) != 0 ? buttonV3DTO.common : commonControlSettings;
        StyleTypes styleTypes4 = styleTypes3;
        Boolean bool6 = (i11 & 16384) != 0 ? buttonV3DTO.isHoverDisabled : bool2;
        A11yInfo a11yInfo3 = (i11 & 32768) != 0 ? buttonV3DTO.a11yInfo : a11yInfo;
        if ((i11 & 65536) != 0) {
            a11yInfo2 = a11yInfo3;
            rounds2 = buttonV3DTO.round;
            bool3 = bool6;
            sizes2 = sizes3;
            str11 = str21;
            str12 = str22;
            str13 = str23;
            str14 = str24;
            bool4 = bool5;
            str15 = str25;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            commonControlSettings2 = commonControlSettings3;
            styleTypes2 = styleTypes4;
            buttonV3DTO2 = buttonV3DTO;
        } else {
            rounds2 = rounds;
            a11yInfo2 = a11yInfo3;
            styleTypes2 = styleTypes4;
            buttonV3DTO2 = buttonV3DTO;
            bool3 = bool6;
            sizes2 = sizes3;
            str11 = str21;
            str12 = str22;
            str13 = str23;
            str14 = str24;
            bool4 = bool5;
            str15 = str25;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            commonControlSettings2 = commonControlSettings3;
        }
        return buttonV3DTO2.copy(styleTypes2, sizes2, str11, str12, str13, str14, bool4, str15, str16, str17, str18, str19, str20, commonControlSettings2, bool3, a11yInfo2, rounds2);
    }

    /* renamed from: component1, reason: from getter */
    public final StyleTypes getStyleType() {
        return this.styleType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    /* renamed from: component13, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component14, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getIsHoverDisabled() {
        return this.isHoverDisabled;
    }

    /* renamed from: component16, reason: from getter */
    public final A11yInfo getA11yInfo() {
        return this.a11yInfo;
    }

    /* renamed from: component17, reason: from getter */
    public final Rounds getRound() {
        return this.round;
    }

    /* renamed from: component2, reason: from getter */
    public final Sizes getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDataText() {
        return this.dataText;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDataTextColor() {
        return this.dataTextColor;
    }

    @NotNull
    public final ButtonV3DTO copy(StyleTypes styleType, Sizes size, @NotNull String title, String subtitle, String icon, String dataText, Boolean isDisabled, String titleColor, String dataTextColor, String subtitleColor, String iconColor, String dataBackgroundColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled, A11yInfo a11yInfo, Rounds round) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ButtonV3DTO(styleType, size, title, subtitle, icon, dataText, isDisabled, titleColor, dataTextColor, subtitleColor, iconColor, dataBackgroundColor, backgroundColor, common, isHoverDisabled, a11yInfo, round);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonV3DTO)) {
            return false;
        }
        ButtonV3DTO buttonV3DTO = (ButtonV3DTO) other;
        return this.styleType == buttonV3DTO.styleType && this.size == buttonV3DTO.size && Intrinsics.d(this.title, buttonV3DTO.title) && Intrinsics.d(this.subtitle, buttonV3DTO.subtitle) && Intrinsics.d(this.icon, buttonV3DTO.icon) && Intrinsics.d(this.dataText, buttonV3DTO.dataText) && Intrinsics.d(this.isDisabled, buttonV3DTO.isDisabled) && Intrinsics.d(this.titleColor, buttonV3DTO.titleColor) && Intrinsics.d(this.dataTextColor, buttonV3DTO.dataTextColor) && Intrinsics.d(this.subtitleColor, buttonV3DTO.subtitleColor) && Intrinsics.d(this.iconColor, buttonV3DTO.iconColor) && Intrinsics.d(this.dataBackgroundColor, buttonV3DTO.dataBackgroundColor) && Intrinsics.d(this.backgroundColor, buttonV3DTO.backgroundColor) && Intrinsics.d(this.common, buttonV3DTO.common) && Intrinsics.d(this.isHoverDisabled, buttonV3DTO.isHoverDisabled) && Intrinsics.d(this.a11yInfo, buttonV3DTO.a11yInfo) && this.round == buttonV3DTO.round;
    }

    public final A11yInfo getA11yInfo() {
        return this.a11yInfo;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.app.android.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    public final String getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    public final String getDataText() {
        return this.dataText;
    }

    public final String getDataTextColor() {
        return this.dataTextColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.buttonV3;
    }

    public final Rounds getRound() {
        return this.round;
    }

    public final Sizes getSize() {
        return this.size;
    }

    public final StyleTypes getStyleType() {
        return this.styleType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        StyleTypes styleTypes = this.styleType;
        int hashCode = (styleTypes == null ? 0 : styleTypes.hashCode()) * 31;
        Sizes sizes = this.size;
        int a11 = g.a((hashCode + (sizes == null ? 0 : sizes.hashCode())) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dataText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.titleColor;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataTextColor;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitleColor;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.iconColor;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dataBackgroundColor;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.backgroundColor;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode12 = (hashCode11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Boolean bool2 = this.isHoverDisabled;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        A11yInfo a11yInfo = this.a11yInfo;
        int hashCode14 = (hashCode13 + (a11yInfo == null ? 0 : a11yInfo.hashCode())) * 31;
        Rounds rounds = this.round;
        return hashCode14 + (rounds != null ? rounds.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    public final Boolean isHoverDisabled() {
        return this.isHoverDisabled;
    }

    @NotNull
    public String toString() {
        StyleTypes styleTypes = this.styleType;
        Sizes sizes = this.size;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.icon;
        String str4 = this.dataText;
        Boolean bool = this.isDisabled;
        String str5 = this.titleColor;
        String str6 = this.dataTextColor;
        String str7 = this.subtitleColor;
        String str8 = this.iconColor;
        String str9 = this.dataBackgroundColor;
        String str10 = this.backgroundColor;
        CommonControlSettings commonControlSettings = this.common;
        Boolean bool2 = this.isHoverDisabled;
        A11yInfo a11yInfo = this.a11yInfo;
        Rounds rounds = this.round;
        StringBuilder sb2 = new StringBuilder("ButtonV3DTO(styleType=");
        sb2.append(styleTypes);
        sb2.append(", size=");
        sb2.append(sizes);
        sb2.append(", title=");
        Nh.a.h(sb2, str, ", subtitle=", str2, ", icon=");
        Nh.a.h(sb2, str3, ", dataText=", str4, ", isDisabled=");
        HY.b.c(bool, ", titleColor=", str5, ", dataTextColor=", sb2);
        Nh.a.h(sb2, str6, ", subtitleColor=", str7, ", iconColor=");
        Nh.a.h(sb2, str8, ", dataBackgroundColor=", str9, ", backgroundColor=");
        sb2.append(str10);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", isHoverDisabled=");
        sb2.append(bool2);
        sb2.append(", a11yInfo=");
        sb2.append(a11yInfo);
        sb2.append(", round=");
        sb2.append(rounds);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StyleTypes styleTypes = this.styleType;
        if (styleTypes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleTypes.name());
        }
        Sizes sizes = this.size;
        if (sizes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sizes.name());
        }
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.icon);
        dest.writeString(this.dataText);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.titleColor);
        dest.writeString(this.dataTextColor);
        dest.writeString(this.subtitleColor);
        dest.writeString(this.iconColor);
        dest.writeString(this.dataBackgroundColor);
        dest.writeString(this.backgroundColor);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        Boolean bool2 = this.isHoverDisabled;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        A11yInfo a11yInfo = this.a11yInfo;
        if (a11yInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            a11yInfo.writeToParcel(dest, flags);
        }
        Rounds rounds = this.round;
        if (rounds == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(rounds.name());
        }
    }

    @InterfaceC3999a
    public final /* synthetic */ ButtonV3DTO copy(StyleTypes styleType, Sizes size, String title, String subtitle, String icon, String dataText, Boolean isDisabled, String titleColor, String dataTextColor, String subtitleColor, String iconColor, String dataBackgroundColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled, A11yInfo a11yInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return copy(styleType, size, title, subtitle, icon, dataText, isDisabled, titleColor, dataTextColor, subtitleColor, iconColor, dataBackgroundColor, backgroundColor, common, isHoverDisabled, a11yInfo, null);
    }

    @InterfaceC3999a
    public final /* synthetic */ ButtonV3DTO copy(StyleTypes styleType, Sizes size, String title, String subtitle, String icon, String dataText, Boolean isDisabled, String titleColor, String dataTextColor, String subtitleColor, String iconColor, String dataBackgroundColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled) {
        Intrinsics.checkNotNullParameter(title, "title");
        return copy$default(this, styleType, size, title, subtitle, icon, dataText, isDisabled, titleColor, dataTextColor, subtitleColor, iconColor, dataBackgroundColor, backgroundColor, common, isHoverDisabled, null, null, 65536, null);
    }

    @InterfaceC3999a
    public final /* synthetic */ ButtonV3DTO copy(StyleTypes styleType, Sizes size, String title, String subtitle, String icon, String dataText, Boolean isDisabled, String titleColor, String dataTextColor, String subtitleColor, String iconColor, String dataBackgroundColor, String backgroundColor, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        return copy$default(this, styleType, size, title, subtitle, icon, dataText, isDisabled, titleColor, dataTextColor, subtitleColor, iconColor, dataBackgroundColor, backgroundColor, common, this.isHoverDisabled, null, null, 98304, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonV3DTO(StyleTypes styleTypes, Sizes sizes, @NotNull String title, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, CommonControlSettings commonControlSettings, Boolean bool2, A11yInfo a11yInfo, Rounds rounds) {
        super(DsAtomsType.BUTTON_V3, commonControlSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.styleType = styleTypes;
        this.size = sizes;
        this.title = title;
        this.subtitle = str;
        this.icon = str2;
        this.dataText = str3;
        this.isDisabled = bool;
        this.titleColor = str4;
        this.dataTextColor = str5;
        this.subtitleColor = str6;
        this.iconColor = str7;
        this.dataBackgroundColor = str8;
        this.backgroundColor = str9;
        this.common = commonControlSettings;
        this.isHoverDisabled = bool2;
        this.a11yInfo = a11yInfo;
        this.round = rounds;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ButtonV3DTO(ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes r20, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.Sizes r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, ru.ozon.app.android.atoms.data.controls.CommonControlSettings r33, java.lang.Boolean r34, ru.ozon.app.android.atoms.data.common.A11yInfo r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto La
            ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes r1 = ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes.ACTION_PRIMARY
            r3 = r1
            goto Lc
        La:
            r3 = r20
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$Sizes r1 = ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.Sizes.SIZE_500
            r4 = r1
            goto L16
        L14:
            r4 = r21
        L16:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L1d
            r6 = r2
            goto L1f
        L1d:
            r6 = r23
        L1f:
            r1 = r0 & 16
            if (r1 == 0) goto L25
            r7 = r2
            goto L27
        L25:
            r7 = r24
        L27:
            r1 = r0 & 32
            if (r1 == 0) goto L2d
            r8 = r2
            goto L2f
        L2d:
            r8 = r25
        L2f:
            r1 = r0 & 64
            if (r1 == 0) goto L37
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r9 = r1
            goto L39
        L37:
            r9 = r26
        L39:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3f
            r10 = r2
            goto L41
        L3f:
            r10 = r27
        L41:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L47
            r11 = r2
            goto L49
        L47:
            r11 = r28
        L49:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4f
            r12 = r2
            goto L51
        L4f:
            r12 = r29
        L51:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L57
            r13 = r2
            goto L59
        L57:
            r13 = r30
        L59:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5f
            r14 = r2
            goto L61
        L5f:
            r14 = r31
        L61:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L67
            r15 = r2
            goto L69
        L67:
            r15 = r32
        L69:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L70
            r16 = r2
            goto L72
        L70:
            r16 = r33
        L72:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L7b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r17 = r1
            goto L7d
        L7b:
            r17 = r34
        L7d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L8a
            r18 = r2
            r5 = r22
            r2 = r19
            goto L90
        L8a:
            r18 = r35
            r2 = r19
            r5 = r22
        L90:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.<init>(ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$Sizes, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.app.android.atoms.data.controls.CommonControlSettings, java.lang.Boolean, ru.ozon.app.android.atoms.data.common.A11yInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ ButtonV3DTO(StyleTypes styleTypes, Sizes sizes, String title, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, CommonControlSettings commonControlSettings, Boolean bool2, A11yInfo a11yInfo) {
        this(styleTypes, sizes, title, str, str2, str3, bool, str4, str5, str6, str7, str8, str9, commonControlSettings, bool2, a11yInfo, (Rounds) null);
        Intrinsics.checkNotNullParameter(title, "title");
    }

    public /* synthetic */ ButtonV3DTO(StyleTypes styleTypes, Sizes sizes, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, CommonControlSettings commonControlSettings, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? StyleTypes.ACTION_PRIMARY : styleTypes, (i11 & 2) != 0 ? Sizes.SIZE_500 : sizes, str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? Boolean.FALSE : bool, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & 8192) != 0 ? null : commonControlSettings, (i11 & 16384) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ ButtonV3DTO(StyleTypes styleTypes, Sizes sizes, String title, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, CommonControlSettings commonControlSettings, Boolean bool2) {
        this(styleTypes, sizes, title, str, str2, str3, bool, str4, str5, str6, str7, str8, str9, commonControlSettings, bool2, null, null, 65536, null);
        Intrinsics.checkNotNullParameter(title, "title");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ButtonV3DTO(ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes r18, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.Sizes r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, ru.ozon.app.android.atoms.data.controls.CommonControlSettings r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto La
            ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes r1 = ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes.ACTION_PRIMARY
            r3 = r1
            goto Lc
        La:
            r3 = r18
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$Sizes r1 = ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.Sizes.SIZE_500
            r4 = r1
            goto L16
        L14:
            r4 = r19
        L16:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L1d
            r6 = r2
            goto L1f
        L1d:
            r6 = r21
        L1f:
            r1 = r0 & 16
            if (r1 == 0) goto L25
            r7 = r2
            goto L27
        L25:
            r7 = r22
        L27:
            r1 = r0 & 32
            if (r1 == 0) goto L2d
            r8 = r2
            goto L2f
        L2d:
            r8 = r23
        L2f:
            r1 = r0 & 64
            if (r1 == 0) goto L37
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r9 = r1
            goto L39
        L37:
            r9 = r24
        L39:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3f
            r10 = r2
            goto L41
        L3f:
            r10 = r25
        L41:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L47
            r11 = r2
            goto L49
        L47:
            r11 = r26
        L49:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4f
            r12 = r2
            goto L51
        L4f:
            r12 = r27
        L51:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L57
            r13 = r2
            goto L59
        L57:
            r13 = r28
        L59:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5f
            r14 = r2
            goto L61
        L5f:
            r14 = r29
        L61:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L67
            r15 = r2
            goto L69
        L67:
            r15 = r30
        L69:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L74
            r16 = r2
            r5 = r20
            r2 = r17
            goto L7a
        L74:
            r16 = r31
            r2 = r17
            r5 = r20
        L7a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.<init>(ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$Sizes, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.app.android.atoms.data.controls.CommonControlSettings, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ ButtonV3DTO(StyleTypes styleTypes, Sizes sizes, String title, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, CommonControlSettings commonControlSettings) {
        this(styleTypes, sizes, title, str, str2, str3, bool, str4, str5, str6, str7, str8, str9, commonControlSettings, Boolean.FALSE, null, null, 98304, null);
        Intrinsics.checkNotNullParameter(title, "title");
    }
}

package ru.ozon.app.android.atoms.data.text;

import B0.C2454a;
import C.J;
import De.C2859b;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;
import ru.ozon.app.android.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001xBñ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\"\u0010#B·\u0001\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010$Bç\u0001\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J¿\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b(\u0010)Jï\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b(\u0010*J\u001d\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0011¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0011¢\u0006\u0004\b1\u0010'J\u0010\u00102\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u00107J\u0012\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b:\u00107J\u0012\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b?\u0010>J\u0012\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bD\u0010>J\u001e\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bK\u0010>J\u0012\u0010L\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bL\u0010>J\u0012\u0010M\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bO\u0010AJü\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b(\u0010PJ\u0010\u0010Q\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bQ\u0010>J\u0010\u0010R\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bR\u0010'J\u001a\u0010T\u001a\u00020\u00192\b\u0010S\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bW\u00103R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010X\u001a\u0004\bY\u00105R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\b[\u00107R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\b\\\u00107R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\b]\u00107R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b^\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\b`\u0010<R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bb\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010a\u001a\u0004\bc\u0010>R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010d\u0012\u0004\bf\u0010g\u001a\u0004\be\u0010AR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010h\u001a\u0004\bi\u0010CR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bj\u0010>R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010k\u001a\u0004\bl\u0010FR\"\u0010\u001a\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010m\u001a\u0004\bn\u0010H\"\u0004\bo\u0010pR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010q\u001a\u0004\br\u0010JR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010a\u001a\u0004\bs\u0010>R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010a\u001a\u0004\bt\u0010>R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010u\u001a\u0004\bv\u0010NR\u0019\u0010!\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b!\u0010d\u001a\u0004\bw\u0010A¨\u0006y"}, d2 = {"Lru/ozon/app/android/atoms/data/text/TextDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "text", "Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;", "textAlignment", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "leftPadding", "rightPadding", "topPadding", "bottomPadding", "Lru/ozon/app/android/atoms/data/text/TextPreset;", "preset", "", "typographyToken", "textColor", "", "numberOfLines", "Lru/ozon/app/android/atoms/data/TestInfo;", "testInfo", "context", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "tagSupported", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "truncatingMode", "icon", "iconTintColor", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "iconPosition", "maxLines", "<init>", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/text/TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;ZLru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;Ljava/lang/Integer;)V", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/text/TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;Z)V", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/text/TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;ZLru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;)V", "getItemType", "()I", "copy", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/text/TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;Z)Lru/ozon/app/android/atoms/data/text/TextDTO;", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/text/TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;ZLru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;)Lru/ozon/app/android/atoms/data/text/TextDTO;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "component2", "()Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;", "component3", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "component4", "component5", "component6", "component7", "()Lru/ozon/app/android/atoms/data/text/TextPreset;", "component8", "()Ljava/lang/String;", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Lru/ozon/app/android/atoms/data/TestInfo;", "component12", "component13", "()Ljava/util/Map;", "component14", "()Z", "component15", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "component16", "component17", "component18", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "component19", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/atoms/data/text/TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;ZLru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;Ljava/lang/Integer;)Lru/ozon/app/android/atoms/data/text/TextDTO;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "getText", "Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;", "getTextAlignment", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLeftPadding", "getRightPadding", "getTopPadding", "getBottomPadding", "Lru/ozon/app/android/atoms/data/text/TextPreset;", "getPreset", "Ljava/lang/String;", "getTypographyToken", "getTextColor", "Ljava/lang/Integer;", "getNumberOfLines", "getNumberOfLines$annotations", "()V", "Lru/ozon/app/android/atoms/data/TestInfo;", "getTestInfo", "getContext", "Ljava/util/Map;", "getTrackingInfo", "Z", "getTagSupported", "setTagSupported", "(Z)V", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTruncatingMode", "getIcon", "getIconTintColor", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "getIconPosition", "getMaxLines", "TextAlignment", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TextDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<TextDTO> CREATOR = new Creator();

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding bottomPadding;
    private final String context;
    private final String icon;
    private final CommonAtomLabelDTO.IconPosition iconPosition;
    private final String iconTintColor;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final Integer maxLines;
    private final Integer numberOfLines;

    @EnumNullFallback
    private final TextPreset preset;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding rightPadding;
    private transient boolean tagSupported;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;

    @EnumNullFallback
    private final TextAlignment textAlignment;
    private final String textColor;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding topPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final CommonAtomLabelDTO.TruncatingMode truncatingMode;
    private final String typographyToken;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextDTO> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final TextDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            CommonAtomLabelDTO.TruncatingMode valueOf;
            Integer num;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel2);
            TextAlignment valueOf2 = parcel2.readInt() == 0 ? null : TextAlignment.valueOf(parcel2.readString());
            CommonCellSettings.LayoutPadding valueOf3 = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            CommonCellSettings.LayoutPadding valueOf4 = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            CommonCellSettings.LayoutPadding valueOf5 = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            CommonCellSettings.LayoutPadding valueOf6 = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            TextPreset valueOf7 = parcel2.readInt() == 0 ? null : TextPreset.valueOf(parcel2.readString());
            CommonCellSettings.LayoutPadding layoutPadding = valueOf3;
            String readString = parcel2.readString();
            CommonCellSettings.LayoutPadding layoutPadding2 = valueOf4;
            String readString2 = parcel2.readString();
            Integer valueOf8 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            TestInfo createFromParcel = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            TextAlignment textAlignment = valueOf2;
            TextPreset textPreset = valueOf7;
            String readString3 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(TextDTO.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    readInt = readInt;
                }
            }
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = CommonAtomLabelDTO.TruncatingMode.valueOf(parcel.readString());
                num = null;
            }
            CommonCellSettings.LayoutPadding layoutPadding3 = valueOf6;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Object valueOf9 = parcel.readInt() == 0 ? num : CommonAtomLabelDTO.IconPosition.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new TextDTO(create, textAlignment, layoutPadding, layoutPadding2, valueOf5, layoutPadding3, textPreset, readString, readString2, valueOf8, createFromParcel, readString3, linkedHashMap, z11, valueOf, readString4, readString5, valueOf9, num);
        }

        @Override // android.os.Parcelable.Creator
        public final TextDTO[] newArray(int i11) {
            return new TextDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "LEADING", "CENTER", "TRAILING", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextAlignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TextAlignment[] $VALUES;
        public static final TextAlignment LEADING = new TextAlignment("LEADING", 0);
        public static final TextAlignment CENTER = new TextAlignment("CENTER", 1);
        public static final TextAlignment TRAILING = new TextAlignment("TRAILING", 2);

        private static final /* synthetic */ TextAlignment[] $values() {
            return new TextAlignment[]{LEADING, CENTER, TRAILING};
        }

        static {
            TextAlignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TextAlignment(String str, int i11) {
        }

        @NotNull
        public static a<TextAlignment> getEntries() {
            return $ENTRIES;
        }

        public static TextAlignment valueOf(String str) {
            return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
        }

        public static TextAlignment[] values() {
            return (TextAlignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextDTO(OzonSpannableString ozonSpannableString, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map map, boolean z11, CommonAtomLabelDTO.TruncatingMode truncatingMode, String str4, String str5, CommonAtomLabelDTO.IconPosition iconPosition, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, r1, r3, r4, r5, r6, r7, r8, r9, r31, r11, r12, r13, r14, r15, r16, r2, r17, r40);
        Integer num3;
        Integer num4;
        TextAlignment textAlignment2 = (i11 & 2) != 0 ? null : textAlignment;
        CommonCellSettings.LayoutPadding layoutPadding5 = (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding6 = (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding7 = (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding8 = (i11 & 32) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4;
        TextPreset textPreset2 = (i11 & 64) != 0 ? null : textPreset;
        String str6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str;
        String str7 = (i11 & 256) != 0 ? null : str2;
        Integer num5 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num;
        TestInfo testInfo2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo;
        String str8 = (i11 & 2048) != 0 ? null : str3;
        Map map2 = (i11 & 4096) != 0 ? null : map;
        boolean z12 = (i11 & 8192) != 0 ? false : z11;
        CommonAtomLabelDTO.TruncatingMode truncatingMode2 = (i11 & 16384) != 0 ? CommonAtomLabelDTO.TruncatingMode.TAIL : truncatingMode;
        String str9 = (i11 & 32768) != 0 ? null : str4;
        String str10 = (i11 & 65536) == 0 ? str5 : null;
        CommonAtomLabelDTO.IconPosition iconPosition2 = (i11 & 131072) != 0 ? CommonAtomLabelDTO.IconPosition.START : iconPosition;
        if ((i11 & 262144) != 0) {
            num4 = num5;
            num3 = num4;
        } else {
            num3 = num2;
            num4 = num5;
        }
    }

    public static /* synthetic */ TextDTO copy$default(TextDTO textDTO, OzonSpannableString ozonSpannableString, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map map, boolean z11, CommonAtomLabelDTO.TruncatingMode truncatingMode, String str4, String str5, CommonAtomLabelDTO.IconPosition iconPosition, Integer num2, int i11, Object obj) {
        Integer num3;
        CommonAtomLabelDTO.IconPosition iconPosition2;
        OzonSpannableString ozonSpannableString2 = (i11 & 1) != 0 ? textDTO.text : ozonSpannableString;
        TextAlignment textAlignment2 = (i11 & 2) != 0 ? textDTO.textAlignment : textAlignment;
        CommonCellSettings.LayoutPadding layoutPadding5 = (i11 & 4) != 0 ? textDTO.leftPadding : layoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding6 = (i11 & 8) != 0 ? textDTO.rightPadding : layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding7 = (i11 & 16) != 0 ? textDTO.topPadding : layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding8 = (i11 & 32) != 0 ? textDTO.bottomPadding : layoutPadding4;
        TextPreset textPreset2 = (i11 & 64) != 0 ? textDTO.preset : textPreset;
        String str6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textDTO.typographyToken : str;
        String str7 = (i11 & 256) != 0 ? textDTO.textColor : str2;
        Integer num4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? textDTO.numberOfLines : num;
        TestInfo testInfo2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? textDTO.testInfo : testInfo;
        String str8 = (i11 & 2048) != 0 ? textDTO.context : str3;
        Map map2 = (i11 & 4096) != 0 ? textDTO.trackingInfo : map;
        boolean z12 = (i11 & 8192) != 0 ? textDTO.tagSupported : z11;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
        CommonAtomLabelDTO.TruncatingMode truncatingMode2 = (i11 & 16384) != 0 ? textDTO.truncatingMode : truncatingMode;
        String str9 = (i11 & 32768) != 0 ? textDTO.icon : str4;
        String str10 = (i11 & 65536) != 0 ? textDTO.iconTintColor : str5;
        CommonAtomLabelDTO.IconPosition iconPosition3 = (i11 & 131072) != 0 ? textDTO.iconPosition : iconPosition;
        if ((i11 & 262144) != 0) {
            iconPosition2 = iconPosition3;
            num3 = textDTO.maxLines;
        } else {
            num3 = num2;
            iconPosition2 = iconPosition3;
        }
        return textDTO.copy(ozonSpannableString3, textAlignment2, layoutPadding5, layoutPadding6, layoutPadding7, layoutPadding8, textPreset2, str6, str7, num4, testInfo2, str8, map2, z12, truncatingMode2, str9, str10, iconPosition2, num3);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getNumberOfLines$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    /* renamed from: component11, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.trackingInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getTagSupported() {
        return this.tagSupported;
    }

    /* renamed from: component15, reason: from getter */
    public final CommonAtomLabelDTO.TruncatingMode getTruncatingMode() {
        return this.truncatingMode;
    }

    /* renamed from: component16, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component17, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    /* renamed from: component18, reason: from getter */
    public final CommonAtomLabelDTO.IconPosition getIconPosition() {
        return this.iconPosition;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAlignment getTextAlignment() {
        return this.textAlignment;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final TextPreset getPreset() {
        return this.preset;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTypographyToken() {
        return this.typographyToken;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final TextDTO copy(@NotNull OzonSpannableString text, TextAlignment textAlignment, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding, TextPreset preset, String typographyToken, String textColor, Integer numberOfLines, TestInfo testInfo, String context, Map<String, TokenizedTrackingInfo> trackingInfo, boolean tagSupported, CommonAtomLabelDTO.TruncatingMode truncatingMode, String icon, String iconTintColor, CommonAtomLabelDTO.IconPosition iconPosition, Integer maxLines) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextDTO(text, textAlignment, leftPadding, rightPadding, topPadding, bottomPadding, preset, typographyToken, textColor, numberOfLines, testInfo, context, trackingInfo, tagSupported, truncatingMode, icon, iconTintColor, iconPosition, maxLines);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDTO)) {
            return false;
        }
        TextDTO textDTO = (TextDTO) other;
        return Intrinsics.d(this.text, textDTO.text) && this.textAlignment == textDTO.textAlignment && this.leftPadding == textDTO.leftPadding && this.rightPadding == textDTO.rightPadding && this.topPadding == textDTO.topPadding && this.bottomPadding == textDTO.bottomPadding && this.preset == textDTO.preset && Intrinsics.d(this.typographyToken, textDTO.typographyToken) && Intrinsics.d(this.textColor, textDTO.textColor) && Intrinsics.d(this.numberOfLines, textDTO.numberOfLines) && Intrinsics.d(this.testInfo, textDTO.testInfo) && Intrinsics.d(this.context, textDTO.context) && Intrinsics.d(this.trackingInfo, textDTO.trackingInfo) && this.tagSupported == textDTO.tagSupported && this.truncatingMode == textDTO.truncatingMode && Intrinsics.d(this.icon, textDTO.icon) && Intrinsics.d(this.iconTintColor, textDTO.iconTintColor) && this.iconPosition == textDTO.iconPosition && Intrinsics.d(this.maxLines, textDTO.maxLines);
    }

    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final CommonAtomLabelDTO.IconPosition getIconPosition() {
        return this.iconPosition;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.text;
    }

    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final Integer getMaxLines() {
        return this.maxLines;
    }

    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    public final TextPreset getPreset() {
        return this.preset;
    }

    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public boolean getTagSupported() {
        return this.tagSupported;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final TextAlignment getTextAlignment() {
        return this.textAlignment;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final CommonAtomLabelDTO.TruncatingMode getTruncatingMode() {
        return this.truncatingMode;
    }

    public final String getTypographyToken() {
        return this.typographyToken;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        TextAlignment textAlignment = this.textAlignment;
        int hashCode2 = (hashCode + (textAlignment == null ? 0 : textAlignment.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        int hashCode3 = (hashCode2 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
        int hashCode4 = (hashCode3 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
        int hashCode5 = (hashCode4 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        int hashCode6 = (hashCode5 + (layoutPadding4 == null ? 0 : layoutPadding4.hashCode())) * 31;
        TextPreset textPreset = this.preset;
        int hashCode7 = (hashCode6 + (textPreset == null ? 0 : textPreset.hashCode())) * 31;
        String str = this.typographyToken;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.numberOfLines;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode11 = (hashCode10 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        String str3 = this.context;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int a11 = C3532b.a((hashCode12 + (map == null ? 0 : map.hashCode())) * 31, 31, this.tagSupported);
        CommonAtomLabelDTO.TruncatingMode truncatingMode = this.truncatingMode;
        int hashCode13 = (a11 + (truncatingMode == null ? 0 : truncatingMode.hashCode())) * 31;
        String str4 = this.icon;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconTintColor;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CommonAtomLabelDTO.IconPosition iconPosition = this.iconPosition;
        int hashCode16 = (hashCode15 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        Integer num2 = this.maxLines;
        return hashCode16 + (num2 != null ? num2.hashCode() : 0);
    }

    public void setTagSupported(boolean z11) {
        this.tagSupported = z11;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        TextAlignment textAlignment = this.textAlignment;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        TextPreset textPreset = this.preset;
        String str = this.typographyToken;
        String str2 = this.textColor;
        Integer num = this.numberOfLines;
        TestInfo testInfo = this.testInfo;
        String str3 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        boolean z11 = this.tagSupported;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = this.truncatingMode;
        String str4 = this.icon;
        String str5 = this.iconTintColor;
        CommonAtomLabelDTO.IconPosition iconPosition = this.iconPosition;
        Integer num2 = this.maxLines;
        StringBuilder sb2 = new StringBuilder("TextDTO(text=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", textAlignment=");
        sb2.append(textAlignment);
        sb2.append(", leftPadding=");
        sb2.append(layoutPadding);
        sb2.append(", rightPadding=");
        sb2.append(layoutPadding2);
        sb2.append(", topPadding=");
        sb2.append(layoutPadding3);
        sb2.append(", bottomPadding=");
        sb2.append(layoutPadding4);
        sb2.append(", preset=");
        sb2.append(textPreset);
        sb2.append(", typographyToken=");
        sb2.append(str);
        sb2.append(", textColor=");
        C2454a.f(num, str2, ", numberOfLines=", ", testInfo=", sb2);
        sb2.append(testInfo);
        sb2.append(", context=");
        sb2.append(str3);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", tagSupported=");
        sb2.append(z11);
        sb2.append(", truncatingMode=");
        sb2.append(truncatingMode);
        sb2.append(", icon=");
        sb2.append(str4);
        sb2.append(", iconTintColor=");
        sb2.append(str5);
        sb2.append(", iconPosition=");
        sb2.append(iconPosition);
        sb2.append(", maxLines=");
        return Ep.a.c(sb2, num2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        TextAlignment textAlignment = this.textAlignment;
        if (textAlignment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(textAlignment.name());
        }
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        if (layoutPadding == null) {
            dest.writeInt(0);
        } else {
            GR.b.g(dest, 1, layoutPadding);
        }
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
        if (layoutPadding2 == null) {
            dest.writeInt(0);
        } else {
            GR.b.g(dest, 1, layoutPadding2);
        }
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
        if (layoutPadding3 == null) {
            dest.writeInt(0);
        } else {
            GR.b.g(dest, 1, layoutPadding3);
        }
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        if (layoutPadding4 == null) {
            dest.writeInt(0);
        } else {
            GR.b.g(dest, 1, layoutPadding4);
        }
        TextPreset textPreset = this.preset;
        if (textPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(textPreset.name());
        }
        dest.writeString(this.typographyToken);
        dest.writeString(this.textColor);
        Integer num = this.numberOfLines;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeInt(this.tagSupported ? 1 : 0);
        CommonAtomLabelDTO.TruncatingMode truncatingMode = this.truncatingMode;
        if (truncatingMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(truncatingMode.name());
        }
        dest.writeString(this.icon);
        dest.writeString(this.iconTintColor);
        CommonAtomLabelDTO.IconPosition iconPosition = this.iconPosition;
        if (iconPosition == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconPosition.name());
        }
        Integer num2 = this.maxLines;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
    }

    @InterfaceC3999a
    public final /* synthetic */ TextDTO copy(OzonSpannableString text, TextAlignment textAlignment, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding, TextPreset preset, String typographyToken, String textColor, Integer numberOfLines, TestInfo testInfo, String context, Map trackingInfo, boolean tagSupported) {
        Intrinsics.checkNotNullParameter(text, "text");
        return copy(text, textAlignment, leftPadding, rightPadding, topPadding, bottomPadding, preset, typographyToken, textColor, numberOfLines, testInfo, context, trackingInfo, tagSupported, this.truncatingMode, this.icon, this.iconTintColor, this.iconPosition, this.maxLines);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDTO(@NotNull OzonSpannableString text, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map<String, TokenizedTrackingInfo> map, boolean z11, CommonAtomLabelDTO.TruncatingMode truncatingMode, String str4, String str5, CommonAtomLabelDTO.IconPosition iconPosition, Integer num2) {
        super(DsAtomsType.TEXT, str3, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textAlignment = textAlignment;
        this.leftPadding = layoutPadding;
        this.rightPadding = layoutPadding2;
        this.topPadding = layoutPadding3;
        this.bottomPadding = layoutPadding4;
        this.preset = textPreset;
        this.typographyToken = str;
        this.textColor = str2;
        this.numberOfLines = num;
        this.testInfo = testInfo;
        this.context = str3;
        this.trackingInfo = map;
        this.tagSupported = z11;
        this.truncatingMode = truncatingMode;
        this.icon = str4;
        this.iconTintColor = str5;
        this.iconPosition = iconPosition;
        this.maxLines = num2;
    }

    @InterfaceC3999a
    public final /* synthetic */ TextDTO copy(OzonSpannableString text, TextAlignment textAlignment, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding, TextPreset preset, String typographyToken, String textColor, Integer numberOfLines, TestInfo testInfo, String context, Map trackingInfo, boolean tagSupported, CommonAtomLabelDTO.TruncatingMode truncatingMode, String icon, String iconTintColor, CommonAtomLabelDTO.IconPosition iconPosition) {
        Intrinsics.checkNotNullParameter(text, "text");
        return copy(text, textAlignment, leftPadding, rightPadding, topPadding, bottomPadding, preset, typographyToken, textColor, numberOfLines, testInfo, context, trackingInfo, tagSupported, truncatingMode, icon, iconTintColor, iconPosition, this.maxLines);
    }

    public static /* synthetic */ TextDTO copy$default(TextDTO textDTO, OzonSpannableString ozonSpannableString, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map map, boolean z11, CommonAtomLabelDTO.TruncatingMode truncatingMode, String str4, String str5, CommonAtomLabelDTO.IconPosition iconPosition, int i11, Object obj) {
        CommonAtomLabelDTO.IconPosition iconPosition2;
        String str6;
        OzonSpannableString ozonSpannableString2 = (i11 & 1) != 0 ? textDTO.text : ozonSpannableString;
        TextAlignment textAlignment2 = (i11 & 2) != 0 ? textDTO.textAlignment : textAlignment;
        CommonCellSettings.LayoutPadding layoutPadding5 = (i11 & 4) != 0 ? textDTO.leftPadding : layoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding6 = (i11 & 8) != 0 ? textDTO.rightPadding : layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding7 = (i11 & 16) != 0 ? textDTO.topPadding : layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding8 = (i11 & 32) != 0 ? textDTO.bottomPadding : layoutPadding4;
        TextPreset textPreset2 = (i11 & 64) != 0 ? textDTO.preset : textPreset;
        String str7 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textDTO.typographyToken : str;
        String str8 = (i11 & 256) != 0 ? textDTO.textColor : str2;
        Integer num2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? textDTO.numberOfLines : num;
        TestInfo testInfo2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? textDTO.getTestInfo() : testInfo;
        String context = (i11 & 2048) != 0 ? textDTO.getContext() : str3;
        Map trackingInfo = (i11 & 4096) != 0 ? textDTO.getTrackingInfo() : map;
        boolean tagSupported = (i11 & 8192) != 0 ? textDTO.getTagSupported() : z11;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
        CommonAtomLabelDTO.TruncatingMode truncatingMode2 = (i11 & 16384) != 0 ? textDTO.truncatingMode : truncatingMode;
        String str9 = (i11 & 32768) != 0 ? textDTO.icon : str4;
        String str10 = (i11 & 65536) != 0 ? textDTO.iconTintColor : str5;
        if ((i11 & 131072) != 0) {
            str6 = str10;
            iconPosition2 = textDTO.iconPosition;
        } else {
            iconPosition2 = iconPosition;
            str6 = str10;
        }
        return textDTO.copy(ozonSpannableString3, textAlignment2, layoutPadding5, layoutPadding6, layoutPadding7, layoutPadding8, textPreset2, str7, str8, num2, testInfo2, context, trackingInfo, tagSupported, truncatingMode2, str9, str6, iconPosition2);
    }

    public /* synthetic */ TextDTO(OzonSpannableString ozonSpannableString, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? null : textAlignment, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & 32) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4, (i11 & 64) != 0 ? null : textPreset, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str, (i11 & 256) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : str3, (i11 & 4096) == 0 ? map : null, (i11 & 8192) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextDTO(@NotNull OzonSpannableString text, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map<String, TokenizedTrackingInfo> map, boolean z11) {
        this(text, textAlignment, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, textPreset, str, str2, num, testInfo, str3, map, z11, CommonAtomLabelDTO.TruncatingMode.TAIL, null, null, CommonAtomLabelDTO.IconPosition.START, num);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public /* synthetic */ TextDTO(OzonSpannableString ozonSpannableString, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map map, boolean z11, CommonAtomLabelDTO.TruncatingMode truncatingMode, String str4, String str5, CommonAtomLabelDTO.IconPosition iconPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? null : textAlignment, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & 32) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4, (i11 & 64) != 0 ? null : textPreset, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str, (i11 & 256) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : str3, (i11 & 4096) != 0 ? null : map, (i11 & 8192) != 0 ? false : z11, (i11 & 16384) != 0 ? CommonAtomLabelDTO.TruncatingMode.TAIL : truncatingMode, (i11 & 32768) != 0 ? null : str4, (i11 & 65536) == 0 ? str5 : null, (i11 & 131072) != 0 ? CommonAtomLabelDTO.IconPosition.START : iconPosition);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextDTO(@NotNull OzonSpannableString text, TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, TestInfo testInfo, String str3, Map<String, TokenizedTrackingInfo> map, boolean z11, CommonAtomLabelDTO.TruncatingMode truncatingMode, String str4, String str5, CommonAtomLabelDTO.IconPosition iconPosition) {
        this(text, textAlignment, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, textPreset, str, str2, num, testInfo, str3, map, z11, truncatingMode, str4, str5, iconPosition, num);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}

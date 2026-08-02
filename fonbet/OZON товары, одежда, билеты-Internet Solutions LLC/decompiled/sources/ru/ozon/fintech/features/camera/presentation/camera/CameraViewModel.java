package ru.ozon.fintech.features.camera.presentation.camera;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import C.o0;
import D40.e;
import E30.d;
import G.g;
import H30.q;
import L30.j;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import T7.E;
import W.C4852x;
import aa.C4987a;
import aa.C4988b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.pdf.PdfRenderer;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.fragment.app.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import h3.C6788a;
import i70.C7018a;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.app.android.R;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.camera.domain.CameraActions;
import ru.ozon.fintech.features.camera.domain.CameraInteractor;
import ru.ozon.fintech.features.camera.domain.OpenPickerAction;
import ru.ozon.fintech.features.camera.domain.State;
import ru.ozon.fintech.features.camera.domain.analytic.BankCardScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.analytic.PhoneScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.analytic.QrScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.exchangerdata.QrBottomSheetResult;
import ru.ozon.fintech.features.camera.domain.scanner.MobScannerConfig;
import ru.ozon.fintech.features.camera.domain.scanner.bankcard.BankCardAnalyzer;
import ru.ozon.fintech.features.camera.domain.scanner.phone.PhoneNumberAnalyzer;
import ru.ozon.fintech.features.camera.domain.scanner.qr.BarCodeAnalyzer;
import ru.ozon.fintech.features.camera.domain.tips.TipsKt;
import ru.ozon.fintech.features.camera.domain.tips.TipsType;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerMode;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerSource;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerType;
import ru.ozon.fintech.features.camera.scanners.api.DetectedData;
import ru.ozon.fintech.features.camera.ui.DocFrameOrientation;
import ru.ozon.fintech.features.camera.ui.tips.TextTipsState;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemDTO;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000Ö\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 ñ\u00022\u00020\u00012\u00020\u0002:\u0006ñ\u0002ò\u0002ó\u0002B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010)J¯\u0001\u0010B\u001a\u00020%2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\b\u00104\u001a\u0004\u0018\u00010,2\u0006\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u00010,2\b\u00107\u001a\u0004\u0018\u00010,2\b\u00108\u001a\u0004\u0018\u00010,2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020,\u0018\u0001092\u0006\u0010;\u001a\u00020,2\b\u0010<\u001a\u0004\u0018\u00010,2\u0006\u0010=\u001a\u0002002\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u000200¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020%2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010J\u001a\u00020%2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020%2\u0006\u0010E\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020%2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bO\u0010GJ\u0017\u0010R\u001a\u00020%2\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020U2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010T\u001a\u000200¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020%¢\u0006\u0004\bX\u0010)J\r\u0010Y\u001a\u00020%¢\u0006\u0004\bY\u0010)J\u0015\u0010[\u001a\u00020%2\u0006\u0010Z\u001a\u000200¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u000200¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020%¢\u0006\u0004\b_\u0010)J\u0017\u0010a\u001a\u00020%2\b\b\u0002\u0010`\u001a\u000200¢\u0006\u0004\ba\u0010\\J\r\u0010b\u001a\u00020%¢\u0006\u0004\bb\u0010)J\u0019\u0010f\u001a\u00020%2\n\u0010e\u001a\u00060cj\u0002`d¢\u0006\u0004\bf\u0010gJ\u0015\u0010j\u001a\u00020%2\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ\u0015\u0010n\u001a\u00020%2\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ\u0015\u0010p\u001a\u00020%2\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bp\u0010oJ\u0015\u0010q\u001a\u00020%2\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bq\u0010oJ\r\u0010r\u001a\u00020%¢\u0006\u0004\br\u0010)J\r\u0010s\u001a\u00020%¢\u0006\u0004\bs\u0010)J\r\u0010t\u001a\u00020%¢\u0006\u0004\bt\u0010)J'\u0010z\u001a\u00020%2\u0006\u0010v\u001a\u00020u2\u0006\u0010w\u001a\u00020u2\b\u0010y\u001a\u0004\u0018\u00010x¢\u0006\u0004\bz\u0010{J\r\u0010|\u001a\u00020%¢\u0006\u0004\b|\u0010)J\r\u0010}\u001a\u00020%¢\u0006\u0004\b}\u0010)J\r\u0010~\u001a\u00020%¢\u0006\u0004\b~\u0010)J\r\u0010\u007f\u001a\u00020%¢\u0006\u0004\b\u007f\u0010)J\u000f\u0010\u0080\u0001\u001a\u00020%¢\u0006\u0005\b\u0080\u0001\u0010)J\u0010\u0010\u0081\u0001\u001a\u00020U¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u000f\u0010\u0083\u0001\u001a\u00020%¢\u0006\u0005\b\u0083\u0001\u0010)J\u000f\u0010\u0084\u0001\u001a\u00020%¢\u0006\u0005\b\u0084\u0001\u0010)J&\u0010\u0085\u0001\u001a\u00020%2\b\u00106\u001a\u0004\u0018\u00010,2\b\u00107\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J$\u0010\u0089\u0001\u001a\u00020%2\u0007\u0010\u0087\u0001\u001a\u00020,2\u0007\u0010\u0088\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b\u008b\u0001\u0010)J\u001f\u0010\u008d\u0001\u001a\u00020%2\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b\u008f\u0001\u0010)J\u0011\u0010\u0090\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b\u0090\u0001\u0010)J\u0011\u0010\u0091\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b\u0091\u0001\u0010)J!\u0010\u0093\u0001\u001a\u00020%2\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020,09H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001b\u0010\u0096\u0001\u001a\u00020%2\u0007\u0010\u0095\u0001\u001a\u00020,H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u008e\u0001J\u0012\u0010\u0097\u0001\u001a\u00020,H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b\u0099\u0001\u0010)J\u0011\u0010\u009a\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b\u009a\u0001\u0010)J\u001c\u0010\u009d\u0001\u001a\u00020%2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001c\u0010¡\u0001\u001a\u00020%2\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b£\u0001\u0010)J\u0019\u0010¤\u0001\u001a\u00020%2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0005\b¤\u0001\u0010oJ(\u0010§\u0001\u001a\u00020%2\t\u0010¥\u0001\u001a\u0004\u0018\u00010,2\t\u0010¦\u0001\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0006\b§\u0001\u0010\u0086\u0001J\u001a\u0010©\u0001\u001a\u00020%2\u0007\u0010¨\u0001\u001a\u00020PH\u0002¢\u0006\u0005\b©\u0001\u0010SJ\u001b\u0010«\u0001\u001a\u00020%2\u0007\u0010ª\u0001\u001a\u00020,H\u0002¢\u0006\u0006\b«\u0001\u0010\u008e\u0001J\u0017\u0010\u00ad\u0001\u001a\u00030¬\u0001*\u00020*H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001c\u0010°\u0001\u001a\u00020%2\t\b\u0002\u0010¯\u0001\u001a\u000200H\u0002¢\u0006\u0005\b°\u0001\u0010\\J#\u0010²\u0001\u001a\u00020%2\u0007\u0010±\u0001\u001a\u00020P2\u0006\u0010v\u001a\u00020uH\u0003¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001d\u0010µ\u0001\u001a\u0002002\t\b\u0002\u0010´\u0001\u001a\u000200H\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\"\u0010»\u0001\u001a\u00030º\u00012\r\u0010¹\u0001\u001a\b0·\u0001R\u00030¸\u0001H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0011\u0010½\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b½\u0001\u0010)R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010¾\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010¿\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010À\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Á\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Â\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ã\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Ä\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010Å\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Æ\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010Ç\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010È\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010É\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010Ê\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010Ë\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010Ì\u0001R!\u0010Ò\u0001\u001a\u00030Í\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ó\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u001b\u0010Õ\u0001\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010×\u0001R\u0019\u0010Ø\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Ú\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Ù\u0001R\u001b\u0010Û\u0001\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0019\u0010Ý\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ù\u0001R\u0019\u0010Þ\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010Ù\u0001R\u001a\u0010à\u0001\u001a\u00030ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010ä\u0001\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0019\u00104\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010æ\u0001R\u0019\u0010<\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010æ\u0001R\"\u0010è\u0001\u001a\u000b\u0012\u0005\u0012\u00030ç\u0001\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001c\u0010ë\u0001\u001a\u0005\u0018\u00010ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001a\u0010î\u0001\u001a\u00030í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001f\u0010:\u001a\n\u0012\u0004\u0012\u00020,\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010é\u0001R(\u0010I\u001a\u0004\u0018\u00010H8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\bI\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0005\bó\u0001\u0010KR)\u0010ô\u0001\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R\u0019\u00108\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b8\u0010æ\u0001R\u0017\u0010=\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010Ù\u0001R'\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b?\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R\u0017\u0010@\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010æ\u0001R\u0019\u0010ÿ\u0001\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010å\u0001R \u0010\u0081\u0002\u001a\t\u0012\u0004\u0012\u00020U0\u0080\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001a\u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001c\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0086\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0019\u0010\u0089\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0002\u0010Ù\u0001R)\u0010\u008a\u0002\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010ú\u0001\u001a\u0006\b\u008b\u0002\u0010ü\u0001\"\u0006\b\u008c\u0002\u0010þ\u0001R'\u0010A\u001a\u0002002\u0007\u0010\u008d\u0002\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bA\u0010Ù\u0001\u001a\u0005\b\u008e\u0002\u0010^R#\u0010\u0090\u0002\u001a\t\u0012\u0004\u0012\u0002000\u008f\u00028\u0006¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R*\u0010\u0095\u0002\u001a\u00030\u0094\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u009a\u0002R&\u0010\u009d\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u00020\u009b\u00028\u0006¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R#\u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020h0\u009b\u00028\u0006¢\u0006\u0010\n\u0006\b¡\u0002\u0010\u009e\u0002\u001a\u0006\b¢\u0002\u0010 \u0002R2\u0010¥\u0002\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030¤\u0002\u0012\u0005\u0012\u00030¤\u00020£\u00020\u009b\u00028\u0006¢\u0006\u0010\n\u0006\b¥\u0002\u0010\u009e\u0002\u001a\u0006\b¦\u0002\u0010 \u0002R%\u0010§\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001000\u009b\u00028\u0006¢\u0006\u0010\n\u0006\b§\u0002\u0010\u009e\u0002\u001a\u0006\b¨\u0002\u0010 \u0002R&\u0010ª\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010©\u00020\u009b\u00028\u0006¢\u0006\u0010\n\u0006\bª\u0002\u0010\u009e\u0002\u001a\u0006\b«\u0002\u0010 \u0002R%\u0010¬\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010,0\u009b\u00028\u0006¢\u0006\u0010\n\u0006\b¬\u0002\u0010\u009e\u0002\u001a\u0006\b\u00ad\u0002\u0010 \u0002R)\u0010®\u0002\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0002\u0010å\u0001\u001a\u0006\b¯\u0002\u0010°\u0002\"\u0006\b±\u0002\u0010²\u0002R3\u0010´\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010³\u00020\u009b\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0002\u0010\u009e\u0002\u001a\u0006\bµ\u0002\u0010 \u0002\"\u0006\b¶\u0002\u0010·\u0002R3\u0010¹\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¸\u00020\u009b\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¹\u0002\u0010\u009e\u0002\u001a\u0006\bº\u0002\u0010 \u0002\"\u0006\b»\u0002\u0010·\u0002R3\u0010½\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¼\u00020\u008f\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b½\u0002\u0010\u0091\u0002\u001a\u0006\b¾\u0002\u0010\u0093\u0002\"\u0006\b¿\u0002\u0010À\u0002R#\u0010Á\u0002\u001a\t\u0012\u0004\u0012\u00020x0\u008f\u00028\u0006¢\u0006\u0010\n\u0006\bÁ\u0002\u0010\u0091\u0002\u001a\u0006\bÂ\u0002\u0010\u0093\u0002R$\u0010Ã\u0002\u001a\n\u0012\u0005\u0012\u00030ß\u00010\u008f\u00028\u0006¢\u0006\u0010\n\u0006\bÃ\u0002\u0010\u0091\u0002\u001a\u0006\bÄ\u0002\u0010\u0093\u0002R$\u0010Æ\u0002\u001a\n\u0012\u0005\u0012\u00030Å\u00020\u008f\u00028\u0006¢\u0006\u0010\n\u0006\bÆ\u0002\u0010\u0091\u0002\u001a\u0006\bÇ\u0002\u0010\u0093\u0002R#\u0010È\u0002\u001a\t\u0012\u0004\u0012\u0002000\u008f\u00028\u0006¢\u0006\u0010\n\u0006\bÈ\u0002\u0010\u0091\u0002\u001a\u0006\bÉ\u0002\u0010\u0093\u0002R\u001e\u0010Ê\u0002\u001a\t\u0012\u0004\u0012\u00020#0\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010\u0091\u0002R*\u0010Ì\u0002\u001a\t\u0012\u0004\u0012\u00020#0Ë\u00028\u0006¢\u0006\u0017\n\u0006\bÌ\u0002\u0010Í\u0002\u0012\u0005\bÐ\u0002\u0010)\u001a\u0006\bÎ\u0002\u0010Ï\u0002R'\u0010Ñ\u0002\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÑ\u0002\u0010Ù\u0001\u001a\u0005\bÑ\u0002\u0010^\"\u0005\bÒ\u0002\u0010\\R'\u0010Ó\u0002\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÓ\u0002\u0010Ù\u0001\u001a\u0005\bÓ\u0002\u0010^\"\u0005\bÔ\u0002\u0010\\R'\u0010;\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b;\u0010æ\u0001\u001a\u0006\bÕ\u0002\u0010\u0098\u0001\"\u0006\bÖ\u0002\u0010\u008e\u0001R!\u0010Û\u0002\u001a\u00030×\u00028FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0002\u0010Ï\u0001\u001a\u0006\bÙ\u0002\u0010Ú\u0002R!\u0010à\u0002\u001a\u00030Ü\u00028FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÝ\u0002\u0010Ï\u0001\u001a\u0006\bÞ\u0002\u0010ß\u0002R!\u0010å\u0002\u001a\u00030á\u00028FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bâ\u0002\u0010Ï\u0001\u001a\u0006\bã\u0002\u0010ä\u0002R\u0015\u0010é\u0002\u001a\u00030æ\u00028F¢\u0006\b\u001a\u0006\bç\u0002\u0010è\u0002R\u0014\u0010ë\u0002\u001a\u00020u8F¢\u0006\b\u001a\u0006\bê\u0002\u0010°\u0002R\u0013\u0010ì\u0002\u001a\u0002008F¢\u0006\u0007\u001a\u0005\bì\u0002\u0010^R\u0013\u0010í\u0002\u001a\u0002008F¢\u0006\u0007\u001a\u0005\bí\u0002\u0010^R\u0013\u0010î\u0002\u001a\u0002008F¢\u0006\u0007\u001a\u0005\bî\u0002\u0010^R\u0013\u0010ï\u0002\u001a\u0002008F¢\u0006\u0007\u001a\u0005\bï\u0002\u0010^R\u0013\u0010ð\u0002\u001a\u0002008F¢\u0006\u0007\u001a\u0005\bð\u0002\u0010^¨\u0006ô\u0002"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel;", "LE30/d;", "Lr90/f$a;", "Landroid/content/Context;", "context", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "cameraScannerFactory", "Lg30/a;", "analyticInteractor", "Lru/ozon/fintech/features/camera/domain/CameraInteractor;", "cameraInteractor", "LS80/b;", "fintechNavigation", "Ld40/a;", "exchanger", "Lr90/f;", "permissionsDelegate", "LK40/a;", "cbottomDisplay", "LR30/a;", "appCoroutineScopes", "LQ90/c;", "featureToggles", "Lru/ozon/fintech/settings/domain/a;", "fintechSettings", "Lcom/squareup/moshi/Moshi;", "moshi", "Lru/ozon/fintech/features/camera/domain/analytic/PhoneScannerAnalytic;", "phoneScannerAnalytic", "Lru/ozon/fintech/features/camera/domain/analytic/BankCardScannerAnalytic;", "bankCardScannerAnalytic", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic;", "qrScannerAnalytic", "<init>", "(Landroid/content/Context;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;Lg30/a;Lru/ozon/fintech/features/camera/domain/CameraInteractor;LS80/b;Ld40/a;Lr90/f;LK40/a;LR30/a;LQ90/c;Lru/ozon/fintech/settings/domain/a;Lcom/squareup/moshi/Moshi;Lru/ozon/fintech/features/camera/domain/analytic/PhoneScannerAnalytic;Lru/ozon/fintech/features/camera/domain/analytic/BankCardScannerAnalytic;Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic;)V", "Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;", "orientation", "", "onOrientationChanged", "(Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;)V", "onCleared", "()V", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "workingMode", "", "confirmTitle", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;", "qrAct", "", "qrConfirmDialog", "qrDetectAutoclose", "backCamera", "forUniqueUuid", "previewCameraTitle", "tipsElements", "tipsType", "phoneNumberRegex", "", "barcodeFormats", "uuid", "qrButtonText", "videoEnabled", "", "videoChunkDurationMs", "videoQuality", "roundFaceFrameEnabled", "onCreate", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;Ljava/lang/String;Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Z)V", "Landroid/app/Activity;", "activity", "onPermissionResumeOrResult", "(Landroid/app/Activity;)V", "Lt90/b;", "permissionState", "permissionUpdated", "(Lt90/b;)V", "Landroidx/fragment/app/r;", "onCreateView", "(Landroidx/fragment/app/r;)V", "onDestroyView", "Landroid/net/Uri;", "photoFileUri", "photoTaken", "(Landroid/net/Uri;)V", "isVolumeDown", "Ljava/io/File;", "takePhoto", "(Landroid/content/Context;Z)Ljava/io/File;", "changeCamera", "flashClicked", "isFlashEnabled", "flashChangeError", "(Z)V", "isGalleryAllow", "()Z", "showCanceledVideoUploadSnack", "byQrButton", "closeByUser", "sendTakePhotoErrorAnalytics", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onBindsCameraUserCasesToLifecycleError", "(Ljava/lang/Exception;)V", "Lru/ozon/fintech/features/camera/domain/State;", "state", "sendViewStateAnalytics", "(Lru/ozon/fintech/features/camera/domain/State;)V", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "detectedData", "phoneNumberDetected", "(Lru/ozon/fintech/features/camera/scanners/api/DetectedData;)V", "bankCardDetected", "qrCodeDetected", "onStart", "onStop", "resetQrData", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "openGalleryClick", "onDestroy", "qrButtonTextClicked", "resetChunkFiles", "resetCombinedFile", "createChunkFile", "()Ljava/io/File;", "createCombinedLastChunks", "cameraSuccessOpen", "handleNewTextTips", "(Ljava/lang/String;Ljava/lang/String;)V", "actionId", "closeOnClick", "tipsOnClick", "(Ljava/lang/String;Z)V", "confirmPhoto", "videoFileKey", "actuallyConfirmPhoto", "(Ljava/lang/String;)V", "retakePhoto", "closeByPermissionBottomSheet", "closeWithResult", "list", "handePhoneResult", "(Ljava/util/List;)V", "bankCardNumber", "handleBankCardResult", "getPositiveButtonText", "()Ljava/lang/String;", "updateIfNeedQrBorderColor", "clearLastPhoto", "Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$CameraTakePhotoRequest;", "cameraTakePhotoRequest", "updateViewState", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$CameraTakePhotoRequest;)V", "Lru/ozon/fintech/features/camera/domain/exchangerdata/QrBottomSheetResult;", "qrBottomSheetResult", "handleBottomSheetResult", "(Lru/ozon/fintech/features/camera/domain/exchangerdata/QrBottomSheetResult;)V", "handleState", "handleQrData", "qr", "qrRawData", "handleQrString", "uri", "sendIntent", "id", "handleFinButtonsClick", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "mapToBarCodeAnalyzerMode", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;)Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "needPop", "openBottomSheetWithQrResult", "dataUri", "handleFileUriByReqId", "(Landroid/net/Uri;I)V", "init", "scanPdfFile", "(Z)Z", "Landroid/graphics/pdf/PdfRenderer$Page;", "Landroid/graphics/pdf/PdfRenderer;", "page", "Landroid/graphics/Bitmap;", "createMediumBitmap", "(Landroid/graphics/pdf/PdfRenderer$Page;)Landroid/graphics/Bitmap;", "closeRenderer", "Landroid/content/Context;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "Lg30/a;", "Lru/ozon/fintech/features/camera/domain/CameraInteractor;", "LS80/b;", "Ld40/a;", "Lr90/f;", "LK40/a;", "LR30/a;", "LQ90/c;", "Lru/ozon/fintech/settings/domain/a;", "Lcom/squareup/moshi/Moshi;", "Lru/ozon/fintech/features/camera/domain/analytic/PhoneScannerAnalytic;", "Lru/ozon/fintech/features/camera/domain/analytic/BankCardScannerAnalytic;", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic;", "Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "mobScannerConfig$delegate", "LSc/j;", "getMobScannerConfig", "()Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "mobScannerConfig", "currentWorkingMode", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "lastPhotoUri", "Landroid/net/Uri;", "Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$CameraTakePhotoRequest;", "isPhotoConfirmed", "Z", "needQrConfirmDialog", "qrData", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "qrAutoclose", "isConfirmDialogShowed", "Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$ScannerBorderPhotoState;", "currentQrPhotoUiState", "Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$ScannerBorderPhotoState;", "pdfRenderer", "Landroid/graphics/pdf/PdfRenderer;", "currentPageIndex", "I", "Ljava/lang/String;", "Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;", "textTipsList", "Ljava/util/List;", "Lru/ozon/fintech/features/camera/domain/tips/TipsType;", "textTipsType", "Lru/ozon/fintech/features/camera/domain/tips/TipsType;", "", "previewTitleBias", "F", "Lt90/b;", "getPermissionState", "()Lt90/b;", "setPermissionState", "scanAction", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;", "getScanAction", "()Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;", "setScanAction", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;)V", "J", "getVideoChunkDurationMs", "()J", "setVideoChunkDurationMs", "(J)V", "videoFileId", "Ljava/util/LinkedList;", "videoFiles", "Ljava/util/LinkedList;", "Lru/ozon/fintech/network/models/a;", "videoUploadState", "Lru/ozon/fintech/network/models/a;", "Lxe/B0;", "videoUploadJob", "Lxe/B0;", "isCloseByPermission", "lastChunkDurationMs", "getLastChunkDurationMs", "setLastChunkDurationMs", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getRoundFaceFrameEnabled", "LAe/w0;", "startVideoFlow", "LAe/w0;", "getStartVideoFlow", "()LAe/w0;", "Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;", "flashViewType", "Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;", "getFlashViewType", "()Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;", "setFlashViewType", "(Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;)V", "LAe/x0;", "Lru/ozon/fintech/features/camera/domain/CameraActions;", "cameraActions", "LAe/x0;", "getCameraActions", "()LAe/x0;", "viewState", "getViewState", "Lkotlin/Pair;", "Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "confirmButtons", "getConfirmButtons", "subscribeKeyEventState", "getSubscribeKeyEventState", "Lru/ozon/fintech/features/camera/ui/tips/TextTipsState;", "textTipsState", "getTextTipsState", "qrButtonTextState", "getQrButtonTextState", "videoUploadAttempt", "getVideoUploadAttempt", "()I", "setVideoUploadAttempt", "(I)V", "Lru/ozon/fintech/ui/screenstate/ScreenState;", "screenStateFlow", "getScreenStateFlow", "setScreenStateFlow", "(LAe/x0;)V", "Lu90/a;", "permissionScreenState", "getPermissionScreenState", "setPermissionScreenState", "Lt90/a;", "permissionAction", "getPermissionAction", "setPermissionAction", "(LAe/w0;)V", "qrChooserAction", "getQrChooserAction", "qrBorderPhotoAction", "getQrBorderPhotoAction", "Lru/ozon/fintech/features/camera/domain/OpenPickerAction;", "openPickerIntentAction", "getOpenPickerIntentAction", "openErrorBottomSheet", "getOpenErrorBottomSheet", "orientationEvents", "LAe/h;", "orientationFlow", "LAe/h;", "getOrientationFlow", "()LAe/h;", "getOrientationFlow$annotations", "isBackCamera", "setBackCamera", "isNeedSelfieDocumentFrame", "setNeedSelfieDocumentFrame", "getUuid", "setUuid", "Lru/ozon/fintech/features/camera/domain/scanner/qr/BarCodeAnalyzer;", "barCodeAnalyzer$delegate", "getBarCodeAnalyzer", "()Lru/ozon/fintech/features/camera/domain/scanner/qr/BarCodeAnalyzer;", "barCodeAnalyzer", "Lru/ozon/fintech/features/camera/domain/scanner/phone/PhoneNumberAnalyzer;", "phoneNumberAnalyzer$delegate", "getPhoneNumberAnalyzer", "()Lru/ozon/fintech/features/camera/domain/scanner/phone/PhoneNumberAnalyzer;", "phoneNumberAnalyzer", "Lru/ozon/fintech/features/camera/domain/scanner/bankcard/BankCardAnalyzer;", "bankCardAnalyzer$delegate", "getBankCardAnalyzer", "()Lru/ozon/fintech/features/camera/domain/scanner/bankcard/BankCardAnalyzer;", "bankCardAnalyzer", "LW/x;", "getVideoQualityParsed", "()LW/x;", "videoQualityParsed", "getLensFacing", "lensFacing", "isTakePhotoFlow", "isSaveBackgroundVideo", "isQrScannerFlow", "isPhoneScannerFlow", "isBankCardScannerFlow", "Companion", "CameraTakePhotoRequest", "ScannerBorderPhotoState", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraViewModel extends d implements f.a {

    @NotNull
    private static final String CHUNK = "chunk";

    @NotNull
    private static final String CONFIRM_BUTTON_ID = "CONFIRM_BUTTON_ID";

    @NotNull
    private static final String DOCS_PROMO_ID = "DOCS_PROMO_ID";

    @NotNull
    private static final String DOWNLOAD_SHEET_ID = "DOWNLOAD_SHEET_ID";

    @NotNull
    private static final String FIN_VIDEO = "fin_video";

    @NotNull
    private static final String FIN_VIDEO_COMBINED = "fin_video_combined";
    private static final long ORIENTATION_EVENT_DEBOUNCE = 430;

    @NotNull
    private static final String PHOTO = "PHOTO";

    @NotNull
    private static final String PHOTO_EXTENSION = ".jpg";

    @NotNull
    private static final String PHOTO_PROMO_ID = "PHOTO_PROMO_ID";
    private static final int PICKER_DOCS_REQUEST = 2112;

    @NotNull
    private static final String PICKER_DOCS_TYPE = "application/pdf";
    private static final int PICKER_PHOTO_REQUEST = 1221;

    @NotNull
    private static final String PICKER_PHOTO_TYPE = "image/*";
    private static final float PREVIEW_BIAS_DEFAULT = 0.85f;
    private static final float PREVIEW_BIAS_NONE = 0.2f;
    private static final float PREVIEW_PHONE_SCANER_BIAS = 1.0f;
    private static final float PREVIEW_UPPER_BIAS = 0.6f;

    @NotNull
    private static final String RETAKE_BUTTON_ID = "RETAKE_BUTTON_ID";
    private static final long START_SCAN_DELAY = 400;

    @NotNull
    private static final String TAG = "CameraViewModel";

    @NotNull
    private final InterfaceC6618a analyticInteractor;

    @NotNull
    private final R30.a appCoroutineScopes;

    /* renamed from: bankCardAnalyzer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bankCardAnalyzer;

    @NotNull
    private final BankCardScannerAnalytic bankCardScannerAnalytic;

    /* renamed from: barCodeAnalyzer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j barCodeAnalyzer;
    private List<String> barcodeFormats;

    @NotNull
    private final x0<CameraActions> cameraActions;

    @NotNull
    private final CameraInteractor cameraInteractor;

    @NotNull
    private final CameraScannerFactory cameraScannerFactory;
    private CameraTakePhotoRequest cameraTakePhotoRequest;

    @NotNull
    private final K40.a cbottomDisplay;

    @NotNull
    private final x0<Pair<FinLargeButtonState, FinLargeButtonState>> confirmButtons;

    @NotNull
    private final Context context;
    private int currentPageIndex;

    @NotNull
    private ScannerBorderPhotoState currentQrPhotoUiState;

    @NotNull
    private CameraFragment.WorkingMode currentWorkingMode;

    @NotNull
    private final InterfaceC6083a exchanger;

    @NotNull
    private final Q90.c featureToggles;

    @NotNull
    private final S80.b fintechNavigation;

    @NotNull
    private final ru.ozon.fintech.settings.domain.a fintechSettings;

    @NotNull
    private CameraActions.Flash.FlashViewType flashViewType;
    private String forUniqueUuid;
    private boolean isBackCamera;
    private boolean isCloseByPermission;
    private boolean isConfirmDialogShowed;
    private boolean isNeedSelfieDocumentFrame;
    private boolean isPhotoConfirmed;
    private long lastChunkDurationMs;
    private Uri lastPhotoUri;

    /* renamed from: mobScannerConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mobScannerConfig;

    @NotNull
    private final Moshi moshi;
    private boolean needQrConfirmDialog;

    @NotNull
    private final w0<Boolean> openErrorBottomSheet;

    @NotNull
    private final w0<OpenPickerAction> openPickerIntentAction;

    @NotNull
    private final w0<DocFrameOrientation> orientationEvents;

    @NotNull
    private final InterfaceC2395h<DocFrameOrientation> orientationFlow;
    private PdfRenderer pdfRenderer;

    @NotNull
    private w0<AbstractC9781a> permissionAction;

    @NotNull
    private x0<C9987a> permissionScreenState;
    private AbstractC9782b permissionState;

    @NotNull
    private final f permissionsDelegate;

    /* renamed from: phoneNumberAnalyzer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j phoneNumberAnalyzer;
    private String phoneNumberRegex;

    @NotNull
    private final PhoneScannerAnalytic phoneScannerAnalytic;
    private float previewTitleBias;
    private boolean qrAutoclose;

    @NotNull
    private final w0<ScannerBorderPhotoState> qrBorderPhotoAction;
    private String qrButtonText;

    @NotNull
    private final x0<String> qrButtonTextState;

    @NotNull
    private final w0<Intent> qrChooserAction;
    private DetectedData qrData;

    @NotNull
    private final QrScannerAnalytic qrScannerAnalytic;
    private boolean roundFaceFrameEnabled;
    public CameraFragment.ScanAction scanAction;

    @NotNull
    private x0<ScreenState> screenStateFlow;

    @NotNull
    private final w0<Boolean> startVideoFlow;

    @NotNull
    private final x0<Boolean> subscribeKeyEventState;
    private List<TextAtomV2WrapperState> textTipsList;

    @NotNull
    private final x0<TextTipsState> textTipsState;
    private TipsType textTipsType;

    @NotNull
    private String uuid;
    private long videoChunkDurationMs;
    private boolean videoEnabled;
    private int videoFileId;

    @NotNull
    private LinkedList<File> videoFiles;

    @NotNull
    private String videoQuality;
    private int videoUploadAttempt;
    private B0 videoUploadJob;

    @NotNull
    private ru.ozon.fintech.network.models.a videoUploadState;

    @NotNull
    private final x0<State> viewState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<CameraFragment.WorkingMode> QR_SCANNER_FLOW_MODES = C7714v.b0(CameraFragment.WorkingMode.QR, CameraFragment.WorkingMode.BARCODE, CameraFragment.WorkingMode.QR_AND_BARCODE);

    @NotNull
    private static final List<CameraFragment.WorkingMode> TAKE_PHOTO_FLOW_MODES = C7714v.b0(CameraFragment.WorkingMode.PASSPORT, CameraFragment.WorkingMode.REGISTRATION, CameraFragment.WorkingMode.NONE);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$CameraTakePhotoRequest;", "", "workingMode", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "previewCameraTitle", "", "confirmTitle", "<init>", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;Ljava/lang/String;Ljava/lang/String;)V", "getWorkingMode", "()Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "getPreviewCameraTitle", "()Ljava/lang/String;", "getConfirmTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CameraTakePhotoRequest {

        @NotNull
        private final String confirmTitle;

        @NotNull
        private final String previewCameraTitle;

        @NotNull
        private final CameraFragment.WorkingMode workingMode;

        public CameraTakePhotoRequest(@NotNull CameraFragment.WorkingMode workingMode, @NotNull String previewCameraTitle, @NotNull String confirmTitle) {
            Intrinsics.checkNotNullParameter(workingMode, "workingMode");
            Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
            Intrinsics.checkNotNullParameter(confirmTitle, "confirmTitle");
            this.workingMode = workingMode;
            this.previewCameraTitle = previewCameraTitle;
            this.confirmTitle = confirmTitle;
        }

        public static /* synthetic */ CameraTakePhotoRequest copy$default(CameraTakePhotoRequest cameraTakePhotoRequest, CameraFragment.WorkingMode workingMode, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                workingMode = cameraTakePhotoRequest.workingMode;
            }
            if ((i11 & 2) != 0) {
                str = cameraTakePhotoRequest.previewCameraTitle;
            }
            if ((i11 & 4) != 0) {
                str2 = cameraTakePhotoRequest.confirmTitle;
            }
            return cameraTakePhotoRequest.copy(workingMode, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CameraFragment.WorkingMode getWorkingMode() {
            return this.workingMode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPreviewCameraTitle() {
            return this.previewCameraTitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getConfirmTitle() {
            return this.confirmTitle;
        }

        @NotNull
        public final CameraTakePhotoRequest copy(@NotNull CameraFragment.WorkingMode workingMode, @NotNull String previewCameraTitle, @NotNull String confirmTitle) {
            Intrinsics.checkNotNullParameter(workingMode, "workingMode");
            Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
            Intrinsics.checkNotNullParameter(confirmTitle, "confirmTitle");
            return new CameraTakePhotoRequest(workingMode, previewCameraTitle, confirmTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraTakePhotoRequest)) {
                return false;
            }
            CameraTakePhotoRequest cameraTakePhotoRequest = (CameraTakePhotoRequest) other;
            return this.workingMode == cameraTakePhotoRequest.workingMode && Intrinsics.d(this.previewCameraTitle, cameraTakePhotoRequest.previewCameraTitle) && Intrinsics.d(this.confirmTitle, cameraTakePhotoRequest.confirmTitle);
        }

        @NotNull
        public final String getConfirmTitle() {
            return this.confirmTitle;
        }

        @NotNull
        public final String getPreviewCameraTitle() {
            return this.previewCameraTitle;
        }

        @NotNull
        public final CameraFragment.WorkingMode getWorkingMode() {
            return this.workingMode;
        }

        public int hashCode() {
            return this.confirmTitle.hashCode() + g.a(this.workingMode.hashCode() * 31, 31, this.previewCameraTitle);
        }

        @NotNull
        public String toString() {
            CameraFragment.WorkingMode workingMode = this.workingMode;
            String str = this.previewCameraTitle;
            String str2 = this.confirmTitle;
            StringBuilder sb2 = new StringBuilder("CameraTakePhotoRequest(workingMode=");
            sb2.append(workingMode);
            sb2.append(", previewCameraTitle=");
            sb2.append(str);
            sb2.append(", confirmTitle=");
            return o0.c(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$Companion;", "", "<init>", "()V", "PHOTO_EXTENSION", "", "TAG", CameraViewModel.RETAKE_BUTTON_ID, CameraViewModel.CONFIRM_BUTTON_ID, "FIN_VIDEO_COMBINED", "FIN_VIDEO", CameraViewModel.PHOTO, "CHUNK", "PICKER_PHOTO_REQUEST", "", "PICKER_DOCS_REQUEST", "PICKER_PHOTO_TYPE", "PICKER_DOCS_TYPE", "START_SCAN_DELAY", "", CameraViewModel.PHOTO_PROMO_ID, CameraViewModel.DOWNLOAD_SHEET_ID, CameraViewModel.DOCS_PROMO_ID, "PREVIEW_BIAS_DEFAULT", "", "PREVIEW_BIAS_NONE", "PREVIEW_UPPER_BIAS", "PREVIEW_PHONE_SCANER_BIAS", "ORIENTATION_EVENT_DEBOUNCE", "QR_SCANNER_FLOW_MODES", "", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "TAKE_PHOTO_FLOW_MODES", "createFile", "Ljava/io/File;", "baseFolder", "extension", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File createFile(File baseFolder, String extension) {
            return new File(baseFolder, System.currentTimeMillis() + extension);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel$ScannerBorderPhotoState;", "", "color", "", "<init>", "(Ljava/lang/String;II)V", "getColor", "()I", "DEFAULT", "FOUND", "NOT_FOUND", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScannerBorderPhotoState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ScannerBorderPhotoState[] $VALUES;
        public static final ScannerBorderPhotoState DEFAULT = new ScannerBorderPhotoState("DEFAULT", 0, R.color.oz_white_1);
        public static final ScannerBorderPhotoState FOUND = new ScannerBorderPhotoState("FOUND", 1, R.color.oz_green_ui);
        public static final ScannerBorderPhotoState NOT_FOUND = new ScannerBorderPhotoState("NOT_FOUND", 2, R.color.oz_white_1);
        private final int color;

        private static final /* synthetic */ ScannerBorderPhotoState[] $values() {
            return new ScannerBorderPhotoState[]{DEFAULT, FOUND, NOT_FOUND};
        }

        static {
            ScannerBorderPhotoState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ScannerBorderPhotoState(String str, int i11, int i12) {
            this.color = i12;
        }

        @NotNull
        public static Xc.a<ScannerBorderPhotoState> getEntries() {
            return $ENTRIES;
        }

        public static ScannerBorderPhotoState valueOf(String str) {
            return (ScannerBorderPhotoState) Enum.valueOf(ScannerBorderPhotoState.class, str);
        }

        public static ScannerBorderPhotoState[] values() {
            return (ScannerBorderPhotoState[]) $VALUES.clone();
        }

        public final int getColor() {
            return this.color;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[TipsType.values().length];
            try {
                iArr[TipsType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TipsType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CameraFragment.ScanAction.values().length];
            try {
                iArr2[CameraFragment.ScanAction.TRY_TO_GO_TO.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CameraFragment.ScanAction.RETURN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CameraScannerType.values().length];
            try {
                iArr3[CameraScannerType.MLKIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CameraScannerType.SALUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CameraFragment.WorkingMode.values().length];
            try {
                iArr4[CameraFragment.WorkingMode.QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[CameraFragment.WorkingMode.BARCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[CameraFragment.WorkingMode.QR_AND_BARCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraViewModel(@NotNull Context context, @NotNull CameraScannerFactory cameraScannerFactory, @NotNull InterfaceC6618a analyticInteractor, @NotNull CameraInteractor cameraInteractor, @NotNull S80.b fintechNavigation, @NotNull InterfaceC6083a exchanger, @NotNull f permissionsDelegate, @NotNull K40.a cbottomDisplay, @NotNull R30.a appCoroutineScopes, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull Moshi moshi, @NotNull PhoneScannerAnalytic phoneScannerAnalytic, @NotNull BankCardScannerAnalytic bankCardScannerAnalytic, @NotNull QrScannerAnalytic qrScannerAnalytic) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraScannerFactory, "cameraScannerFactory");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(cameraInteractor, "cameraInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(phoneScannerAnalytic, "phoneScannerAnalytic");
        Intrinsics.checkNotNullParameter(bankCardScannerAnalytic, "bankCardScannerAnalytic");
        Intrinsics.checkNotNullParameter(qrScannerAnalytic, "qrScannerAnalytic");
        this.context = context;
        this.cameraScannerFactory = cameraScannerFactory;
        this.analyticInteractor = analyticInteractor;
        this.cameraInteractor = cameraInteractor;
        this.fintechNavigation = fintechNavigation;
        this.exchanger = exchanger;
        this.permissionsDelegate = permissionsDelegate;
        this.cbottomDisplay = cbottomDisplay;
        this.appCoroutineScopes = appCoroutineScopes;
        this.featureToggles = featureToggles;
        this.fintechSettings = fintechSettings;
        this.moshi = moshi;
        this.phoneScannerAnalytic = phoneScannerAnalytic;
        this.bankCardScannerAnalytic = bankCardScannerAnalytic;
        this.qrScannerAnalytic = qrScannerAnalytic;
        n nVar = n.PUBLICATION;
        this.mobScannerConfig = k.a(nVar, new B50.k(this, 3));
        this.currentWorkingMode = CameraFragment.WorkingMode.NONE;
        this.qrAutoclose = true;
        this.currentQrPhotoUiState = ScannerBorderPhotoState.DEFAULT;
        this.currentPageIndex = -1;
        this.previewTitleBias = PREVIEW_BIAS_DEFAULT;
        this.videoChunkDurationMs = 5000L;
        this.videoQuality = "HD";
        this.videoFiles = new LinkedList<>();
        this.videoUploadState = a.b.f96629a;
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.startVideoFlow = E0.a(1, 0, enumC11113a);
        this.flashViewType = CameraActions.Flash.FlashViewType.FLASH_OFF;
        this.cameraActions = O0.a(CameraActions.Init.INSTANCE);
        this.viewState = O0.a(State.None.INSTANCE);
        String string = context.getString(R.string.fintech_camera_retake_button_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FinLargeButtonState.Type type = FinLargeButtonState.Type.CUSTOM;
        CameraViewModel$confirmButtons$1 cameraViewModel$confirmButtons$1 = new CameraViewModel$confirmButtons$1(this);
        Integer valueOf = Integer.valueOf(R.color.bg_action_secondary);
        Integer valueOf2 = Integer.valueOf(R.color.text_action);
        FinLargeButtonState finLargeButtonState = new FinLargeButtonState(RETAKE_BUTTON_ID, string, null, cameraViewModel$confirmButtons$1, type, null, null, valueOf, valueOf2, 100, null);
        String string2 = context.getString(R.string.fintech_camera_confirm_button_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        FinLargeButtonState.Type type2 = FinLargeButtonState.Type.PRIMARY;
        this.confirmButtons = O0.a(new Pair(finLargeButtonState, new FinLargeButtonState(CONFIRM_BUTTON_ID, string2, null, new CameraViewModel$confirmButtons$2(this), type2, null, null, null, 0 == true ? 1 : 0, 484, null)));
        this.subscribeKeyEventState = O0.a(null);
        this.textTipsState = O0.a(null);
        this.qrButtonTextState = O0.a(null);
        this.screenStateFlow = O0.a(null);
        this.permissionScreenState = O0.a(null);
        EnumC11113a enumC11113a2 = EnumC11113a.DROP_LATEST;
        this.permissionAction = E0.a(0, 1, enumC11113a2);
        this.qrChooserAction = E0.a(0, 1, enumC11113a2);
        this.qrBorderPhotoAction = E0.a(0, 1, enumC11113a2);
        this.openPickerIntentAction = E0.a(0, 1, enumC11113a2);
        this.openErrorBottomSheet = E0.a(0, 1, enumC11113a2);
        C0 a11 = E0.a(0, 1, enumC11113a);
        this.orientationEvents = a11;
        this.orientationFlow = C2399j.l(C2399j.o(a11), ORIENTATION_EVENT_DEBOUNCE);
        this.uuid = "";
        int i11 = 2;
        this.barCodeAnalyzer = k.a(nVar, new C7018a(this, i11));
        this.phoneNumberAnalyzer = k.a(nVar, new C4987a(this, i11));
        this.bankCardAnalyzer = k.a(nVar, new B50.n(this, 4));
        permissionsDelegate.s(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actuallyConfirmPhoto(String videoFileKey) {
        H30.k.b(new C4988b(1, this, videoFileKey));
    }

    static /* synthetic */ void actuallyConfirmPhoto$default(CameraViewModel cameraViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        cameraViewModel.actuallyConfirmPhoto(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit actuallyConfirmPhoto$lambda$9(CameraViewModel cameraViewModel, String str) {
        State value = cameraViewModel.viewState.getValue();
        if (value instanceof State.NeedConfirm) {
            cameraViewModel.cameraInteractor.sendConfirmedPhoto(((State.NeedConfirm) value).getPhotoFileUri(), cameraViewModel.forUniqueUuid, str);
        }
        cameraViewModel.isPhotoConfirmed = true;
        cameraViewModel.closeWithResult();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BankCardAnalyzer bankCardAnalyzer_delegate$lambda$3(CameraViewModel cameraViewModel) {
        return new BankCardAnalyzer(cameraViewModel.appCoroutineScopes, cameraViewModel.getMobScannerConfig(), cameraViewModel.cameraScannerFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarCodeAnalyzer barCodeAnalyzer_delegate$lambda$1(CameraViewModel cameraViewModel) {
        CameraScannerMode mapToBarCodeAnalyzerMode = cameraViewModel.mapToBarCodeAnalyzerMode(cameraViewModel.currentWorkingMode);
        MobScannerConfig mobScannerConfig = cameraViewModel.getMobScannerConfig();
        R30.a aVar = cameraViewModel.appCoroutineScopes;
        return new BarCodeAnalyzer(mapToBarCodeAnalyzerMode, cameraViewModel.cameraScannerFactory, cameraViewModel.barcodeFormats, aVar, mobScannerConfig);
    }

    private final void clearLastPhoto() {
        Uri uri = this.lastPhotoUri;
        if (uri != null) {
            this.cameraInteractor.clearPhotoFile(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeByPermissionBottomSheet() {
        this.isCloseByPermission = true;
        this.analyticInteractor.g1(this.currentWorkingMode.name());
        closeByUser$default(this, false, 1, null);
    }

    public static /* synthetic */ void closeByUser$default(CameraViewModel cameraViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        cameraViewModel.closeByUser(z11);
    }

    private final void closeRenderer() {
        this.currentPageIndex = -1;
        try {
            PdfRenderer pdfRenderer = this.pdfRenderer;
            if (pdfRenderer != null) {
                pdfRenderer.close();
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "Error while closeRenderer";
            }
            L80.a.b(TAG, message);
        }
    }

    private final void closeWithResult() {
        this.analyticInteractor.n0(this.currentWorkingMode.name());
        this.fintechNavigation.pop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmPhoto() {
        if (!this.videoEnabled) {
            actuallyConfirmPhoto$default(this, null, 1, null);
            return;
        }
        B0 b02 = this.videoUploadJob;
        if (b02 != null) {
            b02.j(null);
        }
        File file = new File(this.context.getFilesDir(), "/fin_video_combined/PHOTO_" + this.currentWorkingMode + ".mp4");
        StringBuilder sb2 = new StringBuilder("confirmPhoto file=");
        sb2.append(file);
        L80.a.a("VIDEO_FLOW", sb2.toString());
        long currentTimeMillis = System.currentTimeMillis();
        this.analyticInteractor.s1();
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.videoUploadJob = C10727i.c(a11, He.b.f10879b, null, new CameraViewModel$confirmPhoto$1(this, file, currentTimeMillis, null), 2);
    }

    private final Bitmap createMediumBitmap(PdfRenderer.Page page) {
        Bitmap createBitmap = Bitmap.createBitmap(page.getWidth() * 3, page.getHeight() * 3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public static /* synthetic */ void getOrientationFlow$annotations() {
    }

    private final String getPositiveButtonText() {
        int i11 = WhenMappings.$EnumSwitchMapping$1[getScanAction().ordinal()];
        if (i11 == 1) {
            String string = this.context.getString(R.string.fintech_camera_qr_bottom_sheet_confirm_positive_go_to_text);
            Intrinsics.f(string);
            return string;
        }
        if (i11 != 2) {
            return "";
        }
        String string2 = this.context.getString(R.string.fintech_camera_qr_bottom_sheet_confirm_positive_return_text);
        Intrinsics.f(string2);
        return string2;
    }

    private final void handePhoneResult(List<String> list) {
        this.exchanger.push(new e40.b(list));
        this.cameraInteractor.sendScanPhoneResult(list, this.forUniqueUuid);
        PhoneScannerAnalytic.endCameraScanner$default(this.phoneScannerAnalytic, true, false, list, 2, null);
        if (this.qrAutoclose) {
            closeWithResult();
        }
    }

    private final void handleBankCardResult(String bankCardNumber) {
        this.cameraInteractor.sendScanBankCardResult(bankCardNumber, this.forUniqueUuid);
        BankCardScannerAnalytic.endCameraScanner$default(this.bankCardScannerAnalytic, true, false, 2, null);
        if (this.qrAutoclose) {
            closeWithResult();
        }
    }

    private final void handleBottomSheetResult(QrBottomSheetResult qrBottomSheetResult) {
        if (!qrBottomSheetResult.isConfirmed()) {
            this.qrData = null;
            return;
        }
        DetectedData detectedData = this.qrData;
        if (detectedData != null) {
            handleQrData(detectedData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFileUriByReqId(Uri dataUri, int requestCode) throws Exception {
        if (requestCode != PICKER_PHOTO_REQUEST) {
            if (requestCode != PICKER_DOCS_REQUEST) {
                return;
            }
            closeRenderer();
            ParcelFileDescriptor openFileDescriptor = this.context.getContentResolver().openFileDescriptor(dataUri, "r");
            PdfRenderer pdfRenderer = openFileDescriptor != null ? new PdfRenderer(openFileDescriptor) : null;
            this.pdfRenderer = pdfRenderer;
            if (pdfRenderer != null) {
                this.currentPageIndex = 0;
                scanPdfFile(true);
                return;
            }
            return;
        }
        InputStream openInputStream = this.context.getContentResolver().openInputStream(dataUri);
        if (openInputStream != null) {
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                BarCodeAnalyzer barCodeAnalyzer = getBarCodeAnalyzer();
                Intrinsics.f(decodeStream);
                barCodeAnalyzer.manualFromBitmap(decodeStream);
                Unit unit = Unit.f71690a;
                openInputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    Vd0.b.a(openInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFinButtonsClick(String id2) {
        if (Intrinsics.d(id2, RETAKE_BUTTON_ID)) {
            retakePhoto();
        } else if (Intrinsics.d(id2, CONFIRM_BUTTON_ID)) {
            confirmPhoto();
        }
    }

    private final void handleNewTextTips(String tipsElements, String tipsType) {
        List list;
        TextAtomV2WrapperState textAtomV2WrapperState;
        float f7;
        TipsType tipsType2 = TipsKt.toTipsType(tipsType);
        ArrayList arrayList = null;
        if (tipsType2 != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[tipsType2.ordinal()];
            if (i11 == 1) {
                f7 = 0.6f;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                f7 = PREVIEW_BIAS_DEFAULT;
            }
            this.previewTitleBias = f7;
        } else {
            tipsType2 = null;
        }
        this.textTipsType = tipsType2;
        if (tipsElements != null) {
            try {
                JsonAdapter d11 = this.moshi.d(D.e(List.class, TextItemDTO.class));
                Intrinsics.checkNotNullExpressionValue(d11, "adapter(...)");
                list = (List) d11.fromJson(tipsElements);
            } catch (Exception unused) {
                L80.a.b(TAG, "Error while parse tips list");
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        textAtomV2WrapperState = new TextAtomV2WrapperState("tips", e.a((TextItemDTO) it.next()), Gravity.CENTER, null, new CameraViewModel$handleNewTextTips$2$1$1(this), false, null, 40, null);
                    } catch (Exception unused2) {
                        textAtomV2WrapperState = null;
                    }
                    if (textAtomV2WrapperState != null) {
                        arrayList2.add(textAtomV2WrapperState);
                    }
                }
                arrayList = arrayList2;
            }
        }
        this.textTipsList = arrayList;
    }

    private final void handleQrData(DetectedData detectedData) {
        String qrString = detectedData.getQrString();
        String rawDataBase64 = detectedData.getRawDataBase64();
        boolean z11 = detectedData.getCameraScannerSource() == CameraScannerSource.MANUAL;
        L80.a.a("SCAN_FLOW", "codes handleQrData detectedData=" + detectedData);
        if (z11 && qrString == null && rawDataBase64 == null && this.currentPageIndex >= 0 && scanPdfFile$default(this, false, 1, null)) {
            L80.a.a(TAG, "scan next page " + (this.currentPageIndex + 1));
            return;
        }
        if (z11 && qrString == null && rawDataBase64 == null) {
            closeRenderer();
            openBottomSheetWithQrResult(false);
            return;
        }
        if (qrString == null && rawDataBase64 == null) {
            return;
        }
        if (z11) {
            closeRenderer();
        }
        this.qrScannerAnalytic.setSourceType(z11 ? QrScannerAnalytic.SourceType.IMAGE : QrScannerAnalytic.SourceType.VIDEO);
        QrScannerAnalytic qrScannerAnalytic = this.qrScannerAnalytic;
        CameraScannerType cameraScannerType = detectedData.getCameraScannerType();
        int i11 = cameraScannerType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[cameraScannerType.ordinal()];
        qrScannerAnalytic.setAnalyserType(i11 != 1 ? i11 != 2 ? QrScannerAnalytic.AnalyserType.NONE : QrScannerAnalytic.AnalyserType.SALUTE : QrScannerAnalytic.AnalyserType.MLKIT);
        this.qrScannerAnalytic.setStatusType(QrScannerAnalytic.StatusType.SUCCESS.INSTANCE);
        handleQrString(qrString, rawDataBase64);
    }

    private final void handleQrString(String qr, String qrRawData) {
        Uri parse;
        int i11 = WhenMappings.$EnumSwitchMapping$1[getScanAction().ordinal()];
        if (i11 == 1) {
            if (qr == null || (parse = Uri.parse(qr)) == null) {
                return;
            }
            sendIntent(parse);
            return;
        }
        if (i11 != 2) {
            return;
        }
        this.exchanger.push(new e40.c(qr, qrRawData));
        this.cameraInteractor.sendQrResult(qr, qrRawData, this.forUniqueUuid);
        if (this.qrAutoclose) {
            closeWithResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState() {
        ScreenState error;
        CameraFragment.WorkingMode workingMode;
        String str;
        x0<ScreenState> x0Var = this.screenStateFlow;
        ru.ozon.fintech.network.models.a aVar = this.videoUploadState;
        if (aVar instanceof a.b) {
            error = null;
        } else if (aVar instanceof a.c) {
            error = new ScreenState.Progress(0L, null, 3, null);
        } else {
            if (!(aVar instanceof a.C2102a)) {
                throw new o();
            }
            Integer valueOf = Integer.valueOf(R.drawable.fintech_ic_errors_state);
            String string = this.context.getString(R.string.fintech_ui_error_common_error_technical_error_title);
            String string2 = this.context.getString(R.string.fintech_ui_error_uikit_error_technical_error_description);
            String string3 = this.context.getString(R.string.fintech_ui_error_no_action_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            boolean z11 = false;
            error = new ScreenState.Error(valueOf, string, string2, new FinSmallButtonState("state_butt", string3, new CameraViewModel$handleState$1(this), null, FinSmallButtonState.Type.PRIMARY, null, 40, null), z11, false, null, 112, null);
        }
        x0Var.setValue(error);
        getPermissionScreenState().setValue(this.permissionsDelegate.q(getPermissionState(), this.context, new CameraViewModel$handleState$2(getPermissionAction()), new CameraViewModel$handleState$3(this)));
        w0<AbstractC9781a> permissionAction = getPermissionAction();
        f fVar = this.permissionsDelegate;
        AbstractC9782b permissionState = getPermissionState();
        fVar.getClass();
        permissionAction.tryEmit(f.p(permissionState));
        if ((getPermissionState() instanceof AbstractC9782b.a) && (this.viewState.getValue() instanceof State.None)) {
            x0<State> x0Var2 = this.viewState;
            CameraTakePhotoRequest cameraTakePhotoRequest = this.cameraTakePhotoRequest;
            if (cameraTakePhotoRequest == null || (workingMode = cameraTakePhotoRequest.getWorkingMode()) == null) {
                workingMode = CameraFragment.WorkingMode.NONE;
            }
            CameraTakePhotoRequest cameraTakePhotoRequest2 = this.cameraTakePhotoRequest;
            if (cameraTakePhotoRequest2 == null || (str = cameraTakePhotoRequest2.getPreviewCameraTitle()) == null) {
                str = "";
            }
            x0Var2.setValue(new State.CameraPreview(workingMode, str, this.previewTitleBias));
        }
        this.qrBorderPhotoAction.tryEmit(this.currentQrPhotoUiState);
        E30.g.a(new Function2() { // from class: ru.ozon.fintech.features.camera.presentation.camera.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit handleState$lambda$20;
                handleState$lambda$20 = CameraViewModel.handleState$lambda$20(CameraViewModel.this, (List) obj, (TipsType) obj2);
                return handleState$lambda$20;
            }
        }, this.textTipsList, this.textTipsType);
        String str2 = this.qrButtonText;
        if (str2 != null) {
            this.qrButtonTextState.setValue(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleState$lambda$20(CameraViewModel cameraViewModel, List texts, TipsType type) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(type, "type");
        cameraViewModel.textTipsState.setValue(new TextTipsState(texts, type, null, 4, null));
        return Unit.f71690a;
    }

    private final CameraScannerMode mapToBarCodeAnalyzerMode(CameraFragment.WorkingMode workingMode) {
        int i11 = WhenMappings.$EnumSwitchMapping$3[workingMode.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? CameraScannerMode.QR : CameraScannerMode.MIX_QR_BARCODE : CameraScannerMode.BARCODE : CameraScannerMode.QR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MobScannerConfig mobScannerConfig_delegate$lambda$0(CameraViewModel cameraViewModel) {
        MobScannerConfig mobScannerConfig = (MobScannerConfig) q.a(cameraViewModel.moshi, String.valueOf(cameraViewModel.featureToggles.q(S90.c.MOB_SCANNER_CONFIG).b().getDict()), MobScannerConfig.class);
        return mobScannerConfig == null ? MobScannerConfig.INSTANCE.getDEFAULT() : mobScannerConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$14(CameraViewModel cameraViewModel, QrBottomSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cameraViewModel.isConfirmDialogShowed = false;
        cameraViewModel.handleBottomSheetResult(it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$17(CameraViewModel cameraViewModel, ActionResult2 it) {
        OpenPickerAction openPickerAction;
        Intrinsics.checkNotNullParameter(it, "it");
        String composerActionId = it.getComposerActionId();
        if (Intrinsics.d(composerActionId, PHOTO_PROMO_ID)) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType(PICKER_PHOTO_TYPE);
            openPickerAction = new OpenPickerAction(intent, PICKER_PHOTO_REQUEST);
        } else if (Intrinsics.d(composerActionId, DOCS_PROMO_ID)) {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType(PICKER_DOCS_TYPE);
            openPickerAction = new OpenPickerAction(intent2, PICKER_DOCS_REQUEST);
        } else {
            openPickerAction = null;
        }
        if (openPickerAction != null) {
            cameraViewModel.openPickerIntentAction.tryEmit(openPickerAction);
        }
        return Unit.f71690a;
    }

    private final void openBottomSheetWithQrResult(boolean needPop) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CameraViewModel$openBottomSheetWithQrResult$1(needPop, this, null), 3);
    }

    static /* synthetic */ void openBottomSheetWithQrResult$default(CameraViewModel cameraViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        cameraViewModel.openBottomSheetWithQrResult(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhoneNumberAnalyzer phoneNumberAnalyzer_delegate$lambda$2(CameraViewModel cameraViewModel) {
        return new PhoneNumberAnalyzer(cameraViewModel.appCoroutineScopes, cameraViewModel.getMobScannerConfig(), cameraViewModel.cameraScannerFactory, cameraViewModel.phoneNumberRegex);
    }

    private final void retakePhoto() {
        CameraFragment.WorkingMode workingMode;
        String str;
        x0<State> x0Var = this.viewState;
        CameraTakePhotoRequest cameraTakePhotoRequest = this.cameraTakePhotoRequest;
        if (cameraTakePhotoRequest == null || (workingMode = cameraTakePhotoRequest.getWorkingMode()) == null) {
            workingMode = CameraFragment.WorkingMode.NONE;
        }
        CameraTakePhotoRequest cameraTakePhotoRequest2 = this.cameraTakePhotoRequest;
        if (cameraTakePhotoRequest2 == null || (str = cameraTakePhotoRequest2.getPreviewCameraTitle()) == null) {
            str = "";
        }
        x0Var.setValue(new State.CameraPreview(workingMode, str, this.previewTitleBias));
        clearLastPhoto();
        if (isSaveBackgroundVideo()) {
            resetChunkFiles();
            resetCombinedFile();
            this.startVideoFlow.tryEmit(Boolean.TRUE);
        }
        this.subscribeKeyEventState.setValue(Boolean.TRUE);
    }

    private final boolean scanPdfFile(boolean init) {
        PdfRenderer pdfRenderer = this.pdfRenderer;
        if (pdfRenderer == null) {
            return false;
        }
        if (!init) {
            this.currentPageIndex++;
        }
        if (this.currentPageIndex > pdfRenderer.getPageCount() - 1) {
            return false;
        }
        PdfRenderer.Page openPage = pdfRenderer.openPage(this.currentPageIndex);
        Intrinsics.checkNotNullExpressionValue(openPage, "openPage(...)");
        Bitmap createMediumBitmap = createMediumBitmap(openPage);
        openPage.render(createMediumBitmap, null, null, 1);
        openPage.close();
        getBarCodeAnalyzer().manualFromBitmap(createMediumBitmap);
        return true;
    }

    static /* synthetic */ boolean scanPdfFile$default(CameraViewModel cameraViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return cameraViewModel.scanPdfFile(z11);
    }

    private final void sendIntent(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        Intent createChooser = Intent.createChooser(intent, this.context.getString(R.string.fintech_camera_qr_chooser_title));
        w0<Intent> w0Var = this.qrChooserAction;
        Intrinsics.f(createChooser);
        w0Var.tryEmit(createChooser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tipsOnClick(String actionId, boolean closeOnClick) {
        L80.a.a(TAG, actionId);
    }

    private final void updateIfNeedQrBorderColor() {
        if (getScanAction() == CameraFragment.ScanAction.PHOTO) {
            this.currentQrPhotoUiState = ScannerBorderPhotoState.NOT_FOUND;
            handleState();
        }
    }

    private final void updateViewState(CameraTakePhotoRequest cameraTakePhotoRequest) {
        State value = this.viewState.getValue();
        if (value instanceof State.CameraPreview) {
            this.viewState.setValue(State.CameraPreview.copy$default((State.CameraPreview) value, cameraTakePhotoRequest.getWorkingMode(), null, 0.0f, 6, null));
        } else if (value instanceof State.NeedConfirm) {
            this.viewState.setValue(State.NeedConfirm.copy$default((State.NeedConfirm) value, null, cameraTakePhotoRequest.getConfirmTitle(), 1, null));
        }
    }

    public final void bankCardDetected(@NotNull DetectedData detectedData) {
        Intrinsics.checkNotNullParameter(detectedData, "detectedData");
        L80.a.a(TAG, "bankCardDetected " + detectedData);
        String scannerError = detectedData.getScannerError();
        if (scannerError != null) {
            this.bankCardScannerAnalytic.saveError(scannerError);
        }
        String bankCardNumber = detectedData.getBankCardNumber();
        if (bankCardNumber == null || bankCardNumber.length() <= 0) {
            return;
        }
        handleBankCardResult(bankCardNumber);
    }

    public final void cameraSuccessOpen() {
        int i11;
        int i12;
        Integer num;
        Integer num2;
        String previewCameraTitle;
        String confirmTitle;
        InterfaceC6618a interfaceC6618a = this.analyticInteractor;
        String name = this.currentWorkingMode.name();
        CameraTakePhotoRequest cameraTakePhotoRequest = this.cameraTakePhotoRequest;
        if (cameraTakePhotoRequest == null || (confirmTitle = cameraTakePhotoRequest.getConfirmTitle()) == null) {
            i11 = 0;
            i12 = 0;
        } else {
            i11 = confirmTitle.length();
            i12 = 0;
        }
        boolean z11 = this.qrAutoclose;
        int i13 = i12;
        boolean z12 = this.isBackCamera;
        String name2 = getScanAction().name();
        CameraTakePhotoRequest cameraTakePhotoRequest2 = this.cameraTakePhotoRequest;
        if (cameraTakePhotoRequest2 != null && (previewCameraTitle = cameraTakePhotoRequest2.getPreviewCameraTitle()) != null) {
            i13 = previewCameraTitle.length();
        }
        List<TextAtomV2WrapperState> list = this.textTipsList;
        if (list != null) {
            num = Integer.valueOf(list.size());
            num2 = null;
        } else {
            num = null;
            num2 = null;
        }
        List<String> list2 = this.barcodeFormats;
        String str = this.qrButtonText;
        if (str != null) {
            num2 = Integer.valueOf(str.length());
        }
        interfaceC6618a.j(name, i11, z11, z12, name2, i13, num, list2, num2);
    }

    public final void changeCamera() {
        this.isBackCamera = !this.isBackCamera;
        this.cameraActions.setValue(new CameraActions.ChangeCamera(getLensFacing()));
        if (this.flashViewType != CameraActions.Flash.FlashViewType.FLASH_ON || this.isBackCamera) {
            return;
        }
        CameraActions.Flash.FlashViewType flashViewType = CameraActions.Flash.FlashViewType.FLASH_OFF;
        this.flashViewType = flashViewType;
        this.cameraActions.setValue(new CameraActions.Flash(flashViewType));
    }

    public final void closeByUser(boolean byQrButton) {
        ru.ozon.fintech.network.models.a aVar = this.videoUploadState;
        if (aVar instanceof a.c) {
            B0 b02 = this.videoUploadJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.videoUploadJob = null;
            showCanceledVideoUploadSnack();
            return;
        }
        if (aVar instanceof a.C2102a) {
            this.videoUploadState = a.b.f96629a;
            handleState();
            showCanceledVideoUploadSnack();
        } else {
            this.cameraInteractor.sendClosedByUser(this.forUniqueUuid, byQrButton);
            clearLastPhoto();
            CameraFragment.WorkingMode workingMode = this.currentWorkingMode;
            if (!this.isCloseByPermission) {
                this.analyticInteractor.n0(workingMode.name());
            }
            this.fintechNavigation.pop();
        }
    }

    @NotNull
    public final File createChunkFile() {
        new File(this.context.getFilesDir(), "/fin_video").mkdir();
        File file = new File(this.context.getFilesDir(), E.a(this.videoFileId, "/fin_video/chunk_", ".mp4"));
        this.videoFiles.push(file);
        this.videoFileId++;
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02f0  */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createCombinedLastChunks() {
        MediaMuxer mediaMuxer;
        File file;
        MediaMuxer mediaMuxer2;
        defpackage.b bVar;
        int i11;
        Iterator it;
        String str;
        int parseInt;
        int i12 = 1;
        if (this.videoFiles.size() <= 1) {
            if (this.videoFiles.size() != 1) {
                L80.a.b(TAG, "No video files (");
                return;
            }
            File file2 = this.videoFiles.get(0);
            Intrinsics.checkNotNullExpressionValue(file2, "get(...)");
            File file3 = file2;
            L80.a.a("VIDEO_FLOW", "createCombinedLastChunks 1 fileLast=" + file3);
            new File(this.context.getFilesDir(), "/fin_video_combined").mkdir();
            file3.renameTo(new File(this.context.getFilesDir(), "/fin_video_combined/PHOTO_" + this.currentWorkingMode + ".mp4"));
            this.analyticInteractor.S((int) this.lastChunkDurationMs, "LAST_FILE", null, true);
            return;
        }
        File file4 = this.videoFiles.get(0);
        Intrinsics.checkNotNullExpressionValue(file4, "get(...)");
        File file5 = file4;
        File file6 = this.videoFiles.get(1);
        Intrinsics.checkNotNullExpressionValue(file6, "get(...)");
        File file7 = file6;
        L80.a.a("VIDEO_FLOW", "createCombinedLastChunks 2 fileLast=" + file5 + " filePreLast=" + file7);
        new File(this.context.getFilesDir(), "/fin_video_combined").mkdir();
        File dst = new File(this.context.getFilesDir(), "/fin_video_combined/PHOTO_" + this.currentWorkingMode + ".mp4");
        ArrayList sources = new ArrayList();
        sources.add(file7);
        sources.add(file5);
        Unit unit = Unit.f71690a;
        boolean E11 = this.fintechSettings.E();
        String str2 = "-------------------";
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(sources, "sources");
        L80.a.a("VIDEO_FLOW", "concatenateFiles");
        ?? isEmpty = sources.isEmpty();
        try {
            if (isEmpty != 0) {
                bVar = new defpackage.b(0, "sources is empty, no any video files saved", false);
                file = file7;
            } else {
                try {
                    mediaMuxer2 = new MediaMuxer(dst.getPath(), 0);
                    try {
                        if (E11) {
                            throw new Exception("Emulated Muxer Error");
                        }
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(((File) C7714v.K(sources)).getAbsolutePath());
                            int i13 = 24;
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                            L80.a.a("VIDEO_FLOW", "degreesString=" + extractMetadata);
                            if (extractMetadata != null && (parseInt = Integer.parseInt(extractMetadata)) >= 0) {
                                mediaMuxer2.setOrientationHint(parseInt);
                            }
                            Iterator it2 = sources.iterator();
                            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                            int i14 = 0;
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = -1;
                            MediaFormat mediaFormat = null;
                            while (it2.hasNext()) {
                                int i18 = i12;
                                Object next = it2.next();
                                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                File file8 = (File) next;
                                System.out.println((Object) str2);
                                System.out.println((Object) ("file: " + i15));
                                System.out.println((Object) str2);
                                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                mediaMetadataRetriever2.setDataSource(file8.getAbsolutePath());
                                L80.a.a("VIDEO_FLOW", "idx=" + i15 + " degreesStringFile=" + mediaMetadataRetriever2.extractMetadata(i13));
                                MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                mediaMetadataRetriever3.setDataSource(file8.getAbsolutePath());
                                try {
                                    String extractMetadata2 = mediaMetadataRetriever3.extractMetadata(9);
                                    Intrinsics.f(extractMetadata2);
                                    i11 = Integer.parseInt(extractMetadata2);
                                } catch (Exception unused) {
                                    i11 = 0;
                                }
                                L80.a.a("VIDEO_FLOW", "trackDuration=" + i11);
                                MediaExtractor mediaExtractor = new MediaExtractor();
                                mediaExtractor.setDataSource(file8.getPath());
                                int trackCount = mediaExtractor.getTrackCount();
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= trackCount) {
                                        it = it2;
                                        str = str2;
                                        break;
                                    }
                                    it = it2;
                                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i19);
                                    int i21 = trackCount;
                                    Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                                    String string = trackFormat.getString("mime");
                                    StringBuilder sb2 = new StringBuilder();
                                    str = str2;
                                    sb2.append("mime: ");
                                    sb2.append(string);
                                    System.out.println((Object) sb2.toString());
                                    Intrinsics.f(string);
                                    if (h.e0(string, "video/", false)) {
                                        mediaExtractor.selectTrack(i19);
                                        mediaFormat = mediaExtractor.getTrackFormat(i19);
                                        break;
                                    } else {
                                        i19++;
                                        it2 = it;
                                        trackCount = i21;
                                        str2 = str;
                                    }
                                }
                                MediaFormat mediaFormat2 = mediaFormat;
                                if (i17 == -1) {
                                    Intrinsics.f(mediaFormat2);
                                    i17 = mediaMuxer2.addTrack(mediaFormat2);
                                }
                                ByteBuffer allocate = ByteBuffer.allocate(262144);
                                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                mediaFormat = mediaFormat2;
                                System.out.println((Object) "muxer.start()");
                                if (i16 == 0) {
                                    mediaMuxer2.start();
                                    i16 = i18;
                                }
                                int i22 = 0;
                                while (i22 == 0) {
                                    bufferInfo.offset = 0;
                                    int i23 = i22;
                                    int readSampleData = mediaExtractor.readSampleData(allocate, 0);
                                    bufferInfo.size = readSampleData;
                                    if (readSampleData < 0) {
                                        bufferInfo.size = 0;
                                        i22 = i18;
                                    } else {
                                        File file9 = file7;
                                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime() + i14;
                                        bufferInfo.flags = i18;
                                        mediaMuxer2.writeSampleData(i17, allocate, bufferInfo);
                                        mediaExtractor.advance();
                                        i22 = i23;
                                        file7 = file9;
                                        i18 = 1;
                                    }
                                }
                                mediaExtractor.release();
                                i14 += i11 * 1000;
                                L80.a.a("VIDEO_FLOW", "concatenateFiles " + bufferInfo.presentationTimeUs + " totalDuration: " + i14);
                                i15++;
                                it2 = it;
                                str2 = str;
                                file7 = file7;
                                i13 = 24;
                                i12 = 1;
                            }
                            file = file7;
                            bVar = new defpackage.b(i14 / 1000, null, true);
                            try {
                                mediaMuxer2.stop();
                                mediaMuxer2.release();
                            } catch (Exception unused2) {
                            }
                        } catch (Exception e11) {
                            e = e11;
                            file = file7;
                            L80.a.a("VIDEO_FLOW", "e=" + e);
                            defpackage.b bVar2 = new defpackage.b(0, e.getMessage(), false);
                            if (mediaMuxer2 != null) {
                                try {
                                    mediaMuxer2.stop();
                                    mediaMuxer2.release();
                                } catch (Exception unused3) {
                                }
                            }
                            bVar = bVar2;
                            this.analyticInteractor.S(bVar.a(), "MEDIA_MUXER", bVar.b(), bVar.c());
                            L80.a.a("VIDEO_FLOW", "createCombinedLastChunks concatenateResult=" + bVar);
                            if (bVar.c()) {
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Exception e13) {
                    e = e13;
                    file = file7;
                    mediaMuxer2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    mediaMuxer = null;
                    if (mediaMuxer != null) {
                        try {
                            mediaMuxer.stop();
                            mediaMuxer.release();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            }
            this.analyticInteractor.S(bVar.a(), "MEDIA_MUXER", bVar.b(), bVar.c());
            L80.a.a("VIDEO_FLOW", "createCombinedLastChunks concatenateResult=" + bVar);
            if (bVar.c()) {
                resetCombinedFile();
                new File(this.context.getFilesDir(), "/fin_video_combined").mkdir();
                file.renameTo(new File(this.context.getFilesDir(), "/fin_video_combined/PHOTO_" + this.currentWorkingMode + ".mp4"));
                L80.a.a("VIDEO_FLOW", "createCombinedLastChunks MUXER error, use preLast");
                this.analyticInteractor.S((int) this.videoChunkDurationMs, "PRE_LAST_FILE", null, true);
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMuxer = isEmpty;
        }
    }

    public final void flashChangeError(boolean isFlashEnabled) {
        CameraActions.Flash.FlashViewType flashViewType;
        if (isFlashEnabled) {
            CameraActions.Flash.FlashViewType flashViewType2 = this.flashViewType;
            CameraActions.Flash.FlashViewType flashViewType3 = CameraActions.Flash.FlashViewType.FLASH_ON;
            flashViewType = flashViewType2 == flashViewType3 ? CameraActions.Flash.FlashViewType.FLASH_OFF : flashViewType3;
        } else {
            flashViewType = CameraActions.Flash.FlashViewType.FLASH_OFF;
        }
        this.flashViewType = flashViewType;
        this.cameraActions.setValue(null);
    }

    public final void flashClicked() {
        CameraActions.Flash.FlashViewType flashViewType = this.flashViewType;
        CameraActions.Flash.FlashViewType flashViewType2 = CameraActions.Flash.FlashViewType.FLASH_ON;
        if (flashViewType == flashViewType2) {
            flashViewType2 = CameraActions.Flash.FlashViewType.FLASH_OFF;
        }
        this.flashViewType = flashViewType2;
        this.cameraActions.setValue(new CameraActions.Flash(flashViewType2));
    }

    @NotNull
    public final BankCardAnalyzer getBankCardAnalyzer() {
        return (BankCardAnalyzer) this.bankCardAnalyzer.getValue();
    }

    @NotNull
    public final BarCodeAnalyzer getBarCodeAnalyzer() {
        return (BarCodeAnalyzer) this.barCodeAnalyzer.getValue();
    }

    @NotNull
    public final x0<CameraActions> getCameraActions() {
        return this.cameraActions;
    }

    @NotNull
    public final x0<Pair<FinLargeButtonState, FinLargeButtonState>> getConfirmButtons() {
        return this.confirmButtons;
    }

    @NotNull
    public final CameraActions.Flash.FlashViewType getFlashViewType() {
        return this.flashViewType;
    }

    public final long getLastChunkDurationMs() {
        return this.lastChunkDurationMs;
    }

    public final int getLensFacing() {
        return this.isBackCamera ? 1 : 0;
    }

    @NotNull
    public final MobScannerConfig getMobScannerConfig() {
        return (MobScannerConfig) this.mobScannerConfig.getValue();
    }

    @NotNull
    public final w0<Boolean> getOpenErrorBottomSheet() {
        return this.openErrorBottomSheet;
    }

    @NotNull
    public final w0<OpenPickerAction> getOpenPickerIntentAction() {
        return this.openPickerIntentAction;
    }

    @NotNull
    public final InterfaceC2395h<DocFrameOrientation> getOrientationFlow() {
        return this.orientationFlow;
    }

    @NotNull
    public w0<AbstractC9781a> getPermissionAction() {
        return this.permissionAction;
    }

    @NotNull
    public x0<C9987a> getPermissionScreenState() {
        return this.permissionScreenState;
    }

    public AbstractC9782b getPermissionState() {
        return this.permissionState;
    }

    @NotNull
    public final PhoneNumberAnalyzer getPhoneNumberAnalyzer() {
        return (PhoneNumberAnalyzer) this.phoneNumberAnalyzer.getValue();
    }

    @NotNull
    public final w0<ScannerBorderPhotoState> getQrBorderPhotoAction() {
        return this.qrBorderPhotoAction;
    }

    @NotNull
    public final x0<String> getQrButtonTextState() {
        return this.qrButtonTextState;
    }

    @NotNull
    public final w0<Intent> getQrChooserAction() {
        return this.qrChooserAction;
    }

    public final boolean getRoundFaceFrameEnabled() {
        return this.roundFaceFrameEnabled;
    }

    @NotNull
    public final CameraFragment.ScanAction getScanAction() {
        CameraFragment.ScanAction scanAction = this.scanAction;
        if (scanAction != null) {
            return scanAction;
        }
        Intrinsics.n("scanAction");
        throw null;
    }

    @NotNull
    public final x0<ScreenState> getScreenStateFlow() {
        return this.screenStateFlow;
    }

    @NotNull
    public final w0<Boolean> getStartVideoFlow() {
        return this.startVideoFlow;
    }

    @NotNull
    public final x0<Boolean> getSubscribeKeyEventState() {
        return this.subscribeKeyEventState;
    }

    @NotNull
    public final x0<TextTipsState> getTextTipsState() {
        return this.textTipsState;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final long getVideoChunkDurationMs() {
        return this.videoChunkDurationMs;
    }

    @NotNull
    public final C4852x getVideoQualityParsed() {
        String str = this.videoQuality;
        int hashCode = str.hashCode();
        if (hashCode != 2300) {
            if (hashCode != 2641) {
                if (hashCode != 69570) {
                    if (hashCode == 83985 && str.equals("UHD")) {
                        C4852x UHD = C4852x.f33150d;
                        Intrinsics.checkNotNullExpressionValue(UHD, "UHD");
                        return UHD;
                    }
                } else if (str.equals("FHD")) {
                    C4852x FHD = C4852x.f33149c;
                    Intrinsics.checkNotNullExpressionValue(FHD, "FHD");
                    return FHD;
                }
            } else if (str.equals("SD")) {
                C4852x SD2 = C4852x.f33147a;
                Intrinsics.checkNotNullExpressionValue(SD2, "SD");
                return SD2;
            }
        } else if (str.equals("HD")) {
            C4852x HD = C4852x.f33148b;
            Intrinsics.checkNotNullExpressionValue(HD, "HD");
            return HD;
        }
        C4852x HD2 = C4852x.f33148b;
        Intrinsics.checkNotNullExpressionValue(HD2, "HD");
        return HD2;
    }

    public final int getVideoUploadAttempt() {
        return this.videoUploadAttempt;
    }

    @NotNull
    public final x0<State> getViewState() {
        return this.viewState;
    }

    /* renamed from: isBackCamera, reason: from getter */
    public final boolean getIsBackCamera() {
        return this.isBackCamera;
    }

    public final boolean isBankCardScannerFlow() {
        return this.currentWorkingMode == CameraFragment.WorkingMode.BANK_CARD;
    }

    public final boolean isGalleryAllow() {
        return true;
    }

    /* renamed from: isNeedSelfieDocumentFrame, reason: from getter */
    public final boolean getIsNeedSelfieDocumentFrame() {
        return this.isNeedSelfieDocumentFrame;
    }

    public final boolean isPhoneScannerFlow() {
        return this.currentWorkingMode == CameraFragment.WorkingMode.TEXT;
    }

    public final boolean isQrScannerFlow() {
        return QR_SCANNER_FLOW_MODES.contains(this.currentWorkingMode);
    }

    public final boolean isSaveBackgroundVideo() {
        return TAKE_PHOTO_FLOW_MODES.contains(this.currentWorkingMode) && this.videoEnabled;
    }

    public final boolean isTakePhotoFlow() {
        return TAKE_PHOTO_FLOW_MODES.contains(this.currentWorkingMode);
    }

    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            Uri data2 = data != null ? data.getData() : null;
            if (data2 == null) {
                openBottomSheetWithQrResult(false);
                return;
            }
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new CameraViewModel$onActivityResult$1(this, data2, requestCode, null), 2);
        }
    }

    public final void onBindsCameraUserCasesToLifecycleError(@NotNull Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (isPhoneScannerFlow()) {
            this.phoneScannerAnalytic.saveError("Error onBindsCameraUserCasesToLifecycleError");
        }
        if (isBankCardScannerFlow()) {
            this.bankCardScannerAnalytic.saveError("Error onBindsCameraUserCasesToLifecycleError");
        }
        if (isQrScannerFlow()) {
            this.qrScannerAnalytic.setStatusType(new QrScannerAnalytic.StatusType.ERROR("Error onBindsCameraUserCasesToLifecycleError"));
        }
        this.analyticInteractor.d0(e11.getMessage(), this.currentWorkingMode.name());
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        if (!this.isPhotoConfirmed) {
            clearLastPhoto();
        }
        super.onCleared();
    }

    public void onClosePermission() {
    }

    public final void onCreate(@NotNull CameraFragment.WorkingMode workingMode, @NotNull String confirmTitle, @NotNull CameraFragment.ScanAction qrAct, boolean qrConfirmDialog, boolean qrDetectAutoclose, boolean backCamera, String forUniqueUuid, @NotNull String previewCameraTitle, String tipsElements, String tipsType, String phoneNumberRegex, List<String> barcodeFormats, @NotNull String uuid, String qrButtonText, boolean videoEnabled, long videoChunkDurationMs, @NotNull String videoQuality, boolean roundFaceFrameEnabled) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        Intrinsics.checkNotNullParameter(confirmTitle, "confirmTitle");
        Intrinsics.checkNotNullParameter(qrAct, "qrAct");
        Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        this.uuid = uuid;
        this.forUniqueUuid = forUniqueUuid;
        this.qrAutoclose = qrDetectAutoclose;
        this.currentWorkingMode = workingMode;
        this.videoEnabled = videoEnabled;
        this.videoQuality = videoQuality;
        this.videoChunkDurationMs = videoChunkDurationMs;
        CameraTakePhotoRequest cameraTakePhotoRequest = new CameraTakePhotoRequest(workingMode, previewCameraTitle, confirmTitle);
        updateViewState(cameraTakePhotoRequest);
        this.cameraTakePhotoRequest = cameraTakePhotoRequest;
        this.needQrConfirmDialog = qrConfirmDialog;
        setScanAction(qrAct);
        this.isBackCamera = backCamera;
        this.isNeedSelfieDocumentFrame = !backCamera && workingMode == CameraFragment.WorkingMode.PASSPORT;
        this.phoneNumberRegex = phoneNumberRegex;
        this.barcodeFormats = barcodeFormats;
        this.roundFaceFrameEnabled = roundFaceFrameEnabled;
        updateIfNeedQrBorderColor();
        if (isQrScannerFlow()) {
            handleNewTextTips(tipsElements, tipsType);
            this.qrButtonText = qrButtonText;
            getBarCodeAnalyzer().warmUp();
        }
        if (isPhoneScannerFlow()) {
            this.phoneScannerAnalytic.startCameraScanner(phoneNumberRegex);
            this.previewTitleBias = 1.0f;
        }
        if (isBankCardScannerFlow()) {
            this.bankCardScannerAnalytic.startCameraScanner();
            this.previewTitleBias = 1.0f;
        }
        if (workingMode == CameraFragment.WorkingMode.NONE) {
            this.previewTitleBias = PREVIEW_BIAS_NONE;
        }
        handleState();
    }

    public final void onCreateView(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.fintechNavigation.hideBottomNavigation(activity);
        this.subscribeKeyEventState.setValue(Boolean.TRUE);
    }

    public final void onDestroy() {
        if (isPhoneScannerFlow()) {
            this.phoneScannerAnalytic.endCameraScanner(false, true, K.f71697a);
            getPhoneNumberAnalyzer().shutdown();
        }
        if (isBankCardScannerFlow()) {
            this.bankCardScannerAnalytic.endCameraScanner(false, true);
            getBankCardAnalyzer().shutdown();
        }
        if (isQrScannerFlow()) {
            this.qrScannerAnalytic.sendResult(this.currentWorkingMode);
            getBarCodeAnalyzer().shutdown();
        }
    }

    public final void onDestroyView(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.subscribeKeyEventState.setValue(Boolean.FALSE);
        this.fintechNavigation.showBottomNavigation(activity);
        closeRenderer();
        if (isQrScannerFlow()) {
            getBarCodeAnalyzer().setPreview(null);
            getBarCodeAnalyzer().setBoxRect(null);
        }
        if (isPhoneScannerFlow()) {
            getPhoneNumberAnalyzer().setPreview(null);
            getPhoneNumberAnalyzer().setBoxRect(null);
        }
        if (isBankCardScannerFlow()) {
            getBankCardAnalyzer().setPreview(null);
            getBankCardAnalyzer().setBoxRect(null);
        }
        this.cbottomDisplay.c(DOWNLOAD_SHEET_ID, this.uuid, null);
    }

    public final void onOrientationChanged(@NotNull DocFrameOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.orientationEvents.tryEmit(orientation);
    }

    public void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.permissionsDelegate.a(activity);
    }

    public final void onStart() {
        this.exchanger.e(QrBottomSheetResult.class, androidx.lifecycle.x0.a(this), true, new I90.e(this, 2));
        InterfaceC6083a interfaceC6083a = this.exchanger;
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.uuid;
        companion.getClass();
        interfaceC6083a.b(ActionResult2.Companion.a(str), androidx.lifecycle.x0.a(this), false, new ha.d(this, 3));
    }

    public final void onStop() {
        this.exchanger.d(QrBottomSheetResult.class);
        InterfaceC6083a interfaceC6083a = this.exchanger;
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.uuid;
        companion.getClass();
        interfaceC6083a.a(ActionResult2.Companion.a(str));
    }

    public final void openGalleryClick() {
        K40.b creator = this.cbottomDisplay.creator();
        String string = this.context.getString(R.string.fintech_camera_gallery_download_bs_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.fintech_camera_gallery_download_photo_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String obj = new OzonSpannableString(string2).toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        String string3 = this.context.getString(R.string.fintech_camera_gallery_download_docs_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String obj2 = new OzonSpannableString(string3).toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        this.cbottomDisplay.g(creator.a(string, obj, obj2), CbottomType.SHEET, this.uuid, null);
    }

    @Override // r90.f.a
    public void permissionUpdated(AbstractC9782b permissionState) {
        setPermissionState(permissionState);
        handleState();
    }

    public final void phoneNumberDetected(@NotNull DetectedData detectedData) {
        Intrinsics.checkNotNullParameter(detectedData, "detectedData");
        L80.a.a(TAG, "phoneNumberDetected " + detectedData);
        String scannerError = detectedData.getScannerError();
        if (scannerError != null) {
            this.phoneScannerAnalytic.saveError(scannerError);
        }
        List<String> phones = detectedData.getPhones();
        if (phones == null || phones.isEmpty()) {
            return;
        }
        handePhoneResult(phones);
    }

    public final void photoTaken(Uri photoFileUri) {
        String str;
        if (photoFileUri == null) {
            photoFileUri = this.lastPhotoUri;
        }
        if (photoFileUri != null) {
            this.lastPhotoUri = photoFileUri;
            x0<State> x0Var = this.viewState;
            CameraTakePhotoRequest cameraTakePhotoRequest = this.cameraTakePhotoRequest;
            if (cameraTakePhotoRequest == null || (str = cameraTakePhotoRequest.getConfirmTitle()) == null) {
                str = "";
            }
            x0Var.setValue(new State.NeedConfirm(photoFileUri, str));
        }
    }

    public final void qrButtonTextClicked() {
        closeByUser(true);
    }

    public final void qrCodeDetected(@NotNull DetectedData detectedData) {
        Intrinsics.checkNotNullParameter(detectedData, "detectedData");
        State value = this.viewState.getValue();
        if ((!Intrinsics.d(this.qrData, detectedData) || detectedData.getCameraScannerSource() == CameraScannerSource.MANUAL) && !(value instanceof State.NeedConfirm)) {
            this.qrData = detectedData;
            if (getScanAction() == CameraFragment.ScanAction.PHOTO) {
                this.currentQrPhotoUiState = (detectedData.getQrString() == null && detectedData.getRawDataBase64() == null) ? ScannerBorderPhotoState.NOT_FOUND : ScannerBorderPhotoState.FOUND;
                handleState();
                return;
            }
            if (!this.needQrConfirmDialog) {
                handleQrData(detectedData);
                return;
            }
            if (this.isConfirmDialogShowed) {
                return;
            }
            this.isConfirmDialogShowed = true;
            S80.b bVar = this.fintechNavigation;
            String positiveButtonText = getPositiveButtonText();
            String string = this.context.getString(R.string.fintech_camera_qr_bottom_sheet_confirm_negative_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.E0(positiveButtonText, string);
        }
    }

    public final void resetChunkFiles() {
        L80.a.a("VIDEO_FLOW", "resetChunkFiles");
        Gf.d.b(new File(this.context.getFilesDir(), "/fin_video"));
        this.videoFileId = 0;
        this.videoFiles.clear();
    }

    public final void resetCombinedFile() {
        L80.a.a("VIDEO_FLOW", "resetCombinedFile");
        new File(this.context.getFilesDir(), "/fin_video_combined/PHOTO_" + this.currentWorkingMode + ".mp4").delete();
    }

    public final void resetQrData() {
        this.qrData = null;
        updateIfNeedQrBorderColor();
    }

    public final void sendTakePhotoErrorAnalytics() {
        this.analyticInteractor.b1();
    }

    public final void sendViewStateAnalytics(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof State.CameraPreview)) {
            if (state instanceof State.NeedConfirm) {
                this.analyticInteractor.getClass();
            }
        } else if (getLensFacing() == 1) {
            this.analyticInteractor.F0(((State.CameraPreview) state).getWorkingMode().toString());
        } else {
            this.analyticInteractor.getClass();
        }
    }

    public final void setBackCamera(boolean z11) {
        this.isBackCamera = z11;
    }

    public final void setFlashViewType(@NotNull CameraActions.Flash.FlashViewType flashViewType) {
        Intrinsics.checkNotNullParameter(flashViewType, "<set-?>");
        this.flashViewType = flashViewType;
    }

    public final void setLastChunkDurationMs(long j11) {
        this.lastChunkDurationMs = j11;
    }

    public final void setNeedSelfieDocumentFrame(boolean z11) {
        this.isNeedSelfieDocumentFrame = z11;
    }

    public void setPermissionAction(@NotNull w0<AbstractC9781a> w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<set-?>");
        this.permissionAction = w0Var;
    }

    public void setPermissionScreenState(@NotNull x0<C9987a> x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
        this.permissionScreenState = x0Var;
    }

    public void setPermissionState(AbstractC9782b abstractC9782b) {
        this.permissionState = abstractC9782b;
    }

    public final void setScanAction(@NotNull CameraFragment.ScanAction scanAction) {
        Intrinsics.checkNotNullParameter(scanAction, "<set-?>");
        this.scanAction = scanAction;
    }

    public final void setScreenStateFlow(@NotNull x0<ScreenState> x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
        this.screenStateFlow = x0Var;
    }

    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final void setVideoChunkDurationMs(long j11) {
        this.videoChunkDurationMs = j11;
    }

    public final void setVideoUploadAttempt(int i11) {
        this.videoUploadAttempt = i11;
    }

    public final void showCanceledVideoUploadSnack() {
        K40.b creator = this.cbottomDisplay.creator();
        int d11 = j.d();
        String string = this.context.getString(R.string.fintech_camera_upload_video_canceled);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.cbottomDisplay.g(K40.b.b(creator, string, d11, 28), CbottomType.SNACK, this.uuid, null);
    }

    @NotNull
    public final File takePhoto(@NotNull Context context, boolean isVolumeDown) {
        String obj;
        CameraFragment.WorkingMode workingMode;
        Intrinsics.checkNotNullParameter(context, "context");
        Companion companion = INSTANCE;
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        File createFile = companion.createFile(filesDir, PHOTO_EXTENSION);
        this.lastPhotoUri = Uri.fromFile(createFile);
        InterfaceC6618a interfaceC6618a = this.analyticInteractor;
        CameraTakePhotoRequest cameraTakePhotoRequest = this.cameraTakePhotoRequest;
        if (cameraTakePhotoRequest == null || (workingMode = cameraTakePhotoRequest.getWorkingMode()) == null || (obj = workingMode.toString()) == null) {
            obj = CameraFragment.WorkingMode.NONE.toString();
        }
        interfaceC6618a.v1(obj);
        return createFile;
    }
}

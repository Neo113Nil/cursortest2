package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.braze.models.BrazeGeofence;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.rnlineargradient.LinearGradientManager;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import java.util.WeakHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CanvasStrategy.kt */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0011H\u0017J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0017J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0017J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0017J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0017J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(H\u0017J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0017J(\u0010)\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0016J0\u0010)\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0017J(\u0010)\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020+H\u0017J(\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0016J0\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016JH\u00104\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016J\"\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J,\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u00112\u0006\u0010=\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J,\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u00112\u0006\u0010=\u001a\u00020 2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J*\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017JR\u0010:\u001a\u00020+2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017JR\u0010:\u001a\u00020+2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017JL\u0010G\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010M\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0016J(\u0010N\u001a\u00020+2\u0006\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0010\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020\u0007H\u0016J\u0018\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020UH\u0017J\u0018\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020VH\u0016J\u0010\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020WH\u0017J\u0018\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020W2\u0006\u0010T\u001a\u00020UH\u0017J@\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020 2\u0006\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\"2\u0006\u0010\\\u001a\u00020 2\u0006\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0017J0\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020 2\u0006\u0010_\u001a\u00020K2\u0006\u0010\\\u001a\u00020 2\u0006\u0010`\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0017J@\u0010a\u001a\u00020+2\u0006\u0010b\u001a\u00020?2\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020K2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020h2\u0006\u00109\u001a\u00020\u0017H\u0016J0\u0010i\u001a\u00020+2\u0006\u0010j\u001a\u00020\"2\u0006\u0010k\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"2\u0006\u0010m\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0018\u0010n\u001a\u00020+2\u0006\u0010o\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0016J(\u0010n\u001a\u00020+2\u0006\u0010o\u001a\u00020K2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0017H\u0016J \u0010q\u001a\u00020+2\u0006\u00109\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"H\u0002J\"\u0010r\u001a\u00020+2\u0006\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010U2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0018\u0010v\u001a\u00020+2\u0006\u00105\u001a\u00020 2\u0006\u00109\u001a\u00020\u0017H\u0016J0\u0010v\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0010\u0010w\u001a\u00020+2\u0006\u00109\u001a\u00020\u0017H\u0016J\"\u0010x\u001a\u00020+2\u0006\u0010y\u001a\u00020z2\u0006\u0010=\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J\"\u0010x\u001a\u00020+2\u0006\u0010y\u001a\u00020z2\u0006\u0010=\u001a\u00020 2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J\u0018\u0010{\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0010\u0010|\u001a\u00020+2\u0006\u0010}\u001a\u00020~H\u0016J\u0018\u0010|\u001a\u00020+2\u0006\u0010}\u001a\u00020~2\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0018\u0010|\u001a\u00020+2\u0006\u0010}\u001a\u00020~2\u0006\u0010=\u001a\u00020 H\u0016J \u0010\u007f\u001a\u00020+2\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0019\u0010\u0080\u0001\u001a\u00020+2\u0006\u0010o\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0016J+\u0010\u0080\u0001\u001a\u00020+2\b\u0010o\u001a\u0004\u0018\u00010K2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0017H\u0016J5\u0010\u0081\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0017J$\u0010\u0081\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0085\u0001\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0017J!\u0010\u0087\u0001\u001a\u00020+2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0016J\u0019\u0010\u0088\u0001\u001a\u00020+2\u0006\u00101\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0017H\u0016J\u0019\u0010\u0088\u0001\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00109\u001a\u00020\u0017H\u0016J1\u0010\u0088\u0001\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020+2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016J+\u0010\u008c\u0001\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020 2\u0007\u0010\u008d\u0001\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016JC\u0010\u008c\u0001\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0007\u0010\u008d\u0001\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J<\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J=\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J+\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J=\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016JF\u0010\u0093\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u0094\u0001\u001a\u00020\"2\u0007\u0010\u0095\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J5\u0010\u0093\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u0094\u0001\u001a\u00020\"2\u0007\u0010\u0095\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016JX\u0010\u0096\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0098\u0001\u001a\u00020\u00072\u0007\u0010\u0099\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016JW\u0010\u0096\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0007\u0010\u009b\u0001\u001a\u00020\u00072\u0007\u0010\u009c\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016JX\u0010\u0096\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0098\u0001\u001a\u00020\u00072\u0007\u0010\u0099\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016Jw\u0010\u009d\u0001\u001a\u00020+2\u0007\u0010T\u001a\u00030\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00072\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00072\t\u0010 \u0001\u001a\u0004\u0018\u00010K2\u0007\u0010¡\u0001\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010M\u001a\u00020\u00072\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\u0007\u0010¤\u0001\u001a\u00020\u00072\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0017H\u0016J\t\u0010¦\u0001\u001a\u00020+H\u0017J\u0012\u0010§\u0001\u001a\u00020\u001b2\u0007\u0010¨\u0001\u001a\u00020\u0011H\u0016J\t\u0010©\u0001\u001a\u00020\u0007H\u0016J\f\u0010ª\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016J\t\u0010¬\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010\u00ad\u0001\u001a\u00020+2\u0007\u0010®\u0001\u001a\u00020-H\u0017J\t\u0010¯\u0001\u001a\u00020\u0007H\u0016J\t\u0010°\u0001\u001a\u00020\u0007H\u0016J\t\u0010±\u0001\u001a\u00020\u0007H\u0016J\t\u0010²\u0001\u001a\u00020\u0007H\u0016J\t\u0010³\u0001\u001a\u00020\u001bH\u0016J\t\u0010´\u0001\u001a\u00020\u001bH\u0016J\u0011\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u001b\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0017J\u0011\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0017J\u001b\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0017J)\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0017J3\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0017J\u0016\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u00012\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0002J\t\u0010º\u0001\u001a\u00020+H\u0016J\u0012\u0010»\u0001\u001a\u00020+2\u0007\u0010¼\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010½\u0001\u001a\u00020+2\u0007\u0010¾\u0001\u001a\u00020\"H\u0016J%\u0010¿\u0001\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u00172\b\u0010<\u001a\u0004\u0018\u00010\u0011H\u0003J\t\u0010À\u0001\u001a\u00020\u0007H\u0016J\u0010\u0010À\u0001\u001a\u00020\u00072\u0007\u0010Á\u0001\u001a\u00020\u0007J\u001e\u0010Â\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0016J'\u0010Â\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\b\u00109\u001a\u0004\u0018\u00010\u00172\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J3\u0010Â\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0016J<\u0010Â\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u00010\u00172\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J\u001d\u0010Ã\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010Ä\u0001\u001a\u00020\u0007H\u0016J&\u0010Ã\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010Ä\u0001\u001a\u00020\u00072\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J2\u0010Ã\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0007\u0010Ä\u0001\u001a\u00020\u0007H\u0016J;\u0010Ã\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0007\u0010Ä\u0001\u001a\u00020\u00072\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J\u001b\u0010Å\u0001\u001a\u00020+2\u0007\u0010Æ\u0001\u001a\u00020\"2\u0007\u0010Ç\u0001\u001a\u00020\"H\u0016J\u0013\u0010È\u0001\u001a\u00020+2\b\u0010;\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010É\u0001\u001a\u00020+2\u0007\u0010Ê\u0001\u001a\u00020\u0007H\u0016J\u0015\u0010Ë\u0001\u001a\u00020+2\n\u0010Ì\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016J\u0013\u0010Í\u0001\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001b\u0010Î\u0001\u001a\u00020+2\u0007\u0010Æ\u0001\u001a\u00020\"2\u0007\u0010Ç\u0001\u001a\u00020\"H\u0016J\u001b\u0010Ï\u0001\u001a\u00020+2\u0007\u0010Ð\u0001\u001a\u00020\"2\u0007\u0010Ñ\u0001\u001a\u00020\"H\u0016R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0001X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ò\u0001"}, d2 = {"Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "Landroid/graphics/Canvas;", "()V", "bitmapColorCache", "Ljava/util/WeakHashMap;", "Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "", "delegate", "getDelegate", "()Landroid/graphics/Canvas;", "setDelegate", "(Landroid/graphics/Canvas;)V", "singlePixelBitmap", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmapBounds", "Landroid/graphics/Rect;", "getSinglePixelBitmapBounds", "()Landroid/graphics/Rect;", "singlePixelCanvas", "getSinglePixelCanvas", "solidPaint", "Landroid/graphics/Paint;", "textPaint", "tmpRect", "clipOutPath", "", "path", "Landroid/graphics/Path;", "clipOutRect", "rect", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "clipPath", "op", "Landroid/graphics/Region$Op;", "clipRect", "concat", "", "matrix", "Landroid/graphics/Matrix;", "disableZ", "drawARGB", "a", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "g", "b", "drawArc", "oval", "startAngle", "sweepAngle", "useCenter", "paint", "drawBitmap", "bitmap", "src", "dst", LinearGradientManager.PROP_COLORS, "", TypedValues.CycleType.S_WAVE_OFFSET, "stride", "x", "y", "width", "height", "hasAlpha", "drawBitmapMesh", "meshWidth", "meshHeight", "verts", "", "vertOffset", "colorOffset", "drawCircle", "cx", "cy", BrazeGeofence.RADIUS_METERS, "drawColor", "color", "mode", "Landroid/graphics/BlendMode;", "Landroid/graphics/PorterDuff$Mode;", "", "drawDoubleRoundRect", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "outerRadii", "innerRadii", "drawGlyphs", "glyphIds", "glyphIdOffset", RRWebInteractionMoveEvent.JsonKeys.POSITIONS, "positionOffset", "glyphCount", "font", "Landroid/graphics/fonts/Font;", "drawLine", "startX", "startY", "stopX", "stopY", "drawLines", "pts", "count", "drawMaskedText", "drawMesh", "mesh", "Landroid/graphics/Mesh;", "blendMode", "drawOval", "drawPaint", "drawPatch", "patch", "Landroid/graphics/NinePatch;", "drawPath", "drawPicture", "picture", "Landroid/graphics/Picture;", "drawPoint", "drawPoints", "drawPosText", "text", "", "index", "pos", "", "drawRGB", "drawRect", "drawRenderNode", "renderNode", "Landroid/graphics/RenderNode;", "drawRoundRect", "rx", "ry", "drawText", "", "start", "end", "drawTextOnPath", "hOffset", "vOffset", "drawTextRun", "Landroid/graphics/text/MeasuredText;", "contextStart", "contextEnd", "isRtl", "contextIndex", "contextCount", "drawVertices", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "indices", "", "indexOffset", "indexCount", "enableZ", "getClipBounds", "bounds", "getDensity", "getDrawFilter", "Landroid/graphics/DrawFilter;", "getHeight", "getMatrix", "ctm", "getMaximumBitmapHeight", "getMaximumBitmapWidth", "getSaveCount", "getWidth", "isHardwareAccelerated", "isOpaque", "quickReject", "type", "Landroid/graphics/Canvas$EdgeType;", "removeBitmapShader", "Landroid/graphics/BitmapShader;", "restore", "restoreToCount", "saveCount", "rotate", "degrees", "sampleBitmapColor", "save", "saveFlags", "saveLayer", "saveLayerAlpha", "alpha", "scale", "sx", "sy", "setBitmap", "setDensity", "density", "setDrawFilter", ViewProps.FILTER, "setMatrix", "skew", "translate", "dx", "dy", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TextIgnoringDelegateCanvas extends Canvas {
    private final WeakHashMap<Bitmap, Pair<Integer, Integer>> bitmapColorCache;
    public Canvas delegate;
    private final Bitmap singlePixelBitmap;
    private final Rect singlePixelBitmapBounds;
    private final Canvas singlePixelCanvas;
    private final Paint solidPaint = new Paint();
    private final Paint textPaint = new Paint();
    private final Rect tmpRect = new Rect();

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] glyphIds, int glyphIdOffset, float[] positions, int positionOffset, int glyphCount, Font font, Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(String text, float[] pos, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public boolean isHardwareAccelerated() {
        return false;
    }

    public TextIgnoringDelegateCanvas() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.singlePixelBitmap = createBitmap;
        this.singlePixelCanvas = new Canvas(createBitmap);
        this.singlePixelBitmapBounds = new Rect(0, 0, 1, 1);
        this.bitmapColorCache = new WeakHashMap<>();
    }

    public final Canvas getDelegate() {
        Canvas canvas = this.delegate;
        if (canvas != null) {
            return canvas;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegate");
        return null;
    }

    public final void setDelegate(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.delegate = canvas;
    }

    public final Bitmap getSinglePixelBitmap() {
        return this.singlePixelBitmap;
    }

    public final Canvas getSinglePixelCanvas() {
        return this.singlePixelCanvas;
    }

    public final Rect getSinglePixelBitmapBounds() {
        return this.singlePixelBitmapBounds;
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        getDelegate().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        getDelegate().enableZ();
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        getDelegate().disableZ();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return getDelegate().isOpaque();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return getDelegate().getWidth();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return getDelegate().getHeight();
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return getDelegate().getDensity();
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        getDelegate().setDensity(density);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return getDelegate().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return getDelegate().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int save() {
        return getDelegate().save();
    }

    public final int save(int saveFlags) {
        return save();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        int saveLayer = getDelegate().saveLayer(bounds, paint, saveFlags);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(removeBitmapShader);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint) {
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        int saveLayer = getDelegate().saveLayer(bounds, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(removeBitmapShader);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) {
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        int saveLayer = getDelegate().saveLayer(left, top, right, bottom, paint, saveFlags);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(removeBitmapShader);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint) {
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        int saveLayer = getDelegate().saveLayer(left, top, right, bottom, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(removeBitmapShader);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        return getDelegate().saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha) {
        return getDelegate().saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        return getDelegate().saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        return getDelegate().saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        getDelegate().restore();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return getDelegate().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        getDelegate().restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        getDelegate().translate(dx, dy);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        getDelegate().scale(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        getDelegate().rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        getDelegate().skew(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        getDelegate().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        getDelegate().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void getMatrix(Matrix ctm) {
        Intrinsics.checkNotNullParameter(ctm, "ctm");
        getDelegate().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(RectF rect, Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(Rect rect, Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipRect(left, top, right, bottom, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        return getDelegate().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        return getDelegate().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rect) {
        boolean clipOutRect;
        Intrinsics.checkNotNullParameter(rect, "rect");
        clipOutRect = getDelegate().clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        Intrinsics.checkNotNullParameter(rect, "rect");
        clipOutRect = getDelegate().clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        boolean clipOutRect;
        clipOutRect = getDelegate().clipOutRect(left, top, right, bottom);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        boolean clipOutRect;
        clipOutRect = getDelegate().clipOutRect(left, top, right, bottom);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipPath(Path path, Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return getDelegate().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        boolean clipOutPath;
        Intrinsics.checkNotNullParameter(path, "path");
        clipOutPath = getDelegate().clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return getDelegate().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter filter) {
        getDelegate().setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(RectF rect, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect) {
        boolean quickReject;
        Intrinsics.checkNotNullParameter(rect, "rect");
        quickReject = getDelegate().quickReject(rect);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(Path path, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        boolean quickReject;
        Intrinsics.checkNotNullParameter(path, "path");
        quickReject = getDelegate().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(float left, float top, float right, float bottom, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom) {
        boolean quickReject;
        quickReject = getDelegate().quickReject(left, top, right, bottom);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return getDelegate().getClipBounds(bounds);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        getDelegate().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(oval, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a2, int r, int g, int b) {
        getDelegate().drawARGB(a2, r, g, b);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(left, top, left + bitmap.getWidth(), top + bitmap.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        int save = getDelegate().save();
        getDelegate().setMatrix(matrix);
        getDelegate().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.solidPaint);
        getDelegate().restoreToCount(save);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawCircle(cx, cy, radius, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        getDelegate().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color) {
        getDelegate().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color, BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLine(startX, startY, stopX, stopY, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, int offset, int count, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, offset, count, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF oval, Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(oval, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(left, top, right, bottom, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPaint(paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPath(path, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x, float y, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoint(x, y, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, int offset, int count, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(pts, offset, count, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(pts, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rect, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(rect, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect r, Paint paint) {
        Intrinsics.checkNotNullParameter(r, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(r, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(left, top, right, bottom, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r, int g, int b) {
        getDelegate().drawRGB(r, g, b);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rect, float rx, float ry, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(rect, rx, ry, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(left, top, right, bottom, rx, ry, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float outerRx, float outerRy, RectF inner, float innerRx, float innerRy, Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader removeBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(removeBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] text, int index, int count, float x, float y, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, index, count, this.tmpRect);
        drawMaskedText(paint, x, y);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, float x, float y, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.tmpRect);
        drawMaskedText(paint, x, y);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, int start, int end, float x, float y, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, start, end, this.tmpRect);
        drawMaskedText(paint, x, y);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence text, int start, int end, float x, float y, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.tmpRect);
        drawMaskedText(paint, x, y);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, index + count, this.tmpRect);
        drawMaskedText(paint, x, y);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), start, end, this.tmpRect);
        drawMaskedText(paint, x, y);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, Paint paint) {
        String measuredText;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        measuredText = text.toString();
        paint.getTextBounds(measuredText, start, end, this.tmpRect);
        drawMaskedText(paint, x, y);
    }

    private final int sampleBitmapColor(Bitmap bitmap, Paint paint, Rect src) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap asShared;
        boolean isRecycled = bitmap.isRecycled();
        int i = ViewCompat.MEASURED_STATE_MASK;
        if (isRecycled) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        Pair<Integer, Integer> pair = this.bitmapColorCache.get(bitmap);
        if (pair != null && pair.getFirst().intValue() == bitmap.getGenerationId()) {
            return pair.getSecond().intValue();
        }
        Bitmap.Config config3 = bitmap.getConfig();
        config = Bitmap.Config.HARDWARE;
        if (config3 == config && Build.VERSION.SDK_INT >= 31) {
            BitmapShader removeBitmapShader = removeBitmapShader(paint);
            Canvas canvas = this.singlePixelCanvas;
            asShared = bitmap.asShared();
            canvas.drawBitmap(asShared, src, this.singlePixelBitmapBounds, paint);
            if (removeBitmapShader != null && paint != null) {
                paint.setShader(removeBitmapShader);
            }
            i = this.singlePixelBitmap.getPixel(0, 0);
        } else {
            Bitmap.Config config4 = bitmap.getConfig();
            config2 = Bitmap.Config.HARDWARE;
            if (config4 != config2) {
                BitmapShader removeBitmapShader2 = removeBitmapShader(paint);
                this.singlePixelCanvas.drawBitmap(bitmap, src, this.singlePixelBitmapBounds, paint);
                if (removeBitmapShader2 != null && paint != null) {
                    paint.setShader(removeBitmapShader2);
                }
                i = this.singlePixelBitmap.getPixel(0, 0);
            }
        }
        this.bitmapColorCache.put(bitmap, new Pair<>(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(i)));
        return i;
    }

    private final void drawMaskedText(Paint paint, float x, float y) {
        this.textPaint.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        this.textPaint.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        drawRoundRect(this.tmpRect.left + x, this.tmpRect.top + y, this.tmpRect.right + x, this.tmpRect.bottom + y, 10.0f, 10.0f, this.textPaint);
    }

    private final BitmapShader removeBitmapShader(Paint paint) {
        if (paint == null) {
            return null;
        }
        Shader shader = paint.getShader();
        if (!(shader instanceof BitmapShader)) {
            return null;
        }
        paint.setShader(null);
        return (BitmapShader) shader;
    }
}

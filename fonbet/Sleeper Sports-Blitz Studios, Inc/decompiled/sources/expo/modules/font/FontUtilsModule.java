package expo.modules.font;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.tracing.Trace;
import com.facebook.react.common.assets.ReactFontManager;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: FontUtilsModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/font/FontUtilsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public class FontUtilsModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        FontUtilsModule fontUtilsModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (fontUtilsModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(fontUtilsModule);
            moduleDefinitionBuilder.Name("ExpoFontUtils");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyType[] anyTypeArr = new AnyType[2];
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            Object obj = null;
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$5$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType;
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RenderToImageOptions.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.font.RenderToImageOptions", Reflection.getOrCreateKotlinClass(RenderToImageOptions.class), false)), new Function0<KType>() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$5$$inlined$AsyncFunctionWithPromise$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(RenderToImageOptions.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + RenderToImageOptions.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (!Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    obj = m13470constructorimpl2;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) obj;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(RenderToImageOptions.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters);
            }
            anyTypeArr[1] = anyType2;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("renderToImageAsync", anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$5$$inlined$AsyncFunctionWithPromise$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Context context;
                    Context context2;
                    float f;
                    Context context3;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj2 = objArr[0];
                    RenderToImageOptions renderToImageOptions = (RenderToImageOptions) objArr[1];
                    String str = (String) obj2;
                    ReactFontManager companion5 = ReactFontManager.INSTANCE.getInstance();
                    String fontFamily = renderToImageOptions.getFontFamily();
                    context = FontUtilsModule.this.getContext();
                    Typeface typeface = companion5.getTypeface(fontFamily, 0, context.getAssets());
                    context2 = FontUtilsModule.this.getContext();
                    float f2 = context2.getResources().getDisplayMetrics().density;
                    float size = renderToImageOptions.getSize() * f2;
                    Float lineHeight = renderToImageOptions.getLineHeight();
                    Float valueOf = lineHeight != null ? Float.valueOf(lineHeight.floatValue() * f2) : null;
                    Paint paint = new Paint();
                    paint.setTypeface(typeface);
                    paint.setColor(renderToImageOptions.getColor());
                    paint.setTextSize(size);
                    paint.setAntiAlias(true);
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil(paint.measureText(str)), (int) (valueOf != null ? valueOf.floatValue() : (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent)), Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(createBitmap);
                    if (valueOf != null) {
                        f = ((valueOf.floatValue() - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) - fontMetrics.ascent;
                    } else {
                        f = -fontMetrics.ascent;
                    }
                    canvas.drawText(str, 0.0f, f, paint);
                    context3 = FontUtilsModule.this.getContext();
                    File file = new File(context3.getCacheDir(), UUID.randomUUID() + ".png");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            CloseableKt.closeFinally(fileOutputStream, null);
                            promise.resolve(MapsKt.mapOf(TuplesKt.to("uri", Uri.fromFile(file).toString()), TuplesKt.to("width", Float.valueOf(createBitmap.getWidth() / f2)), TuplesKt.to("height", Float.valueOf(createBitmap.getHeight() / f2)), TuplesKt.to("scale", Float.valueOf(f2))));
                        } finally {
                        }
                    } catch (IOException e) {
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        promise.reject(new SaveImageException(absolutePath, e));
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder2.getAsyncFunctions().put("renderToImageAsync", asyncFunctionWithPromiseComponent);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}

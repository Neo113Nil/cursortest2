package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.horcrux.svg.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3535m extends AbstractC3539q {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f38887e = Pattern.compile("[0-9.-]+");

    /* renamed from: c, reason: collision with root package name */
    public ReadableArray f38888c;

    /* renamed from: d, reason: collision with root package name */
    public float f38889d;

    public C3535m(ReactContext reactContext) {
        super(reactContext);
        this.f38889d = 1.0f;
    }

    @Override // com.horcrux.svg.AbstractC3539q
    public Bitmap o(HashMap hashMap, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setFlags(EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, this.f38889d, this.f38888c);
        canvas.drawPaint(paint);
        return createBitmap;
    }

    public final void setupPaint(Paint paint, float f10, ReadableArray readableArray) {
        if (readableArray.getInt(0) != 0) {
            return;
        }
        if (readableArray.size() != 2) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f10 * 255.0d : f10 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else {
            paint.setColor((Math.round((r13 >>> 24) * f10) << 24) | ((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215));
        }
    }

    public void w(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.f38888c = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            x(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i10 = 0;
        if (type.equals(ReadableType.Number)) {
            this.f38888c = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.f38888c = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f38887e.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i11 = i10 + 1;
                if (i10 < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i10 = i11;
            }
            this.f38888c = javaOnlyArray;
        }
        invalidate();
    }

    public void x(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f38888c = null;
            invalidate();
            return;
        }
        int i10 = readableMap.getInt("type");
        if (i10 == 0) {
            ReadableType type = readableMap.getType(EventKeys.PAYLOAD);
            if (type.equals(ReadableType.Number)) {
                this.f38888c = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt(EventKeys.PAYLOAD)));
            } else if (type.equals(ReadableType.Map)) {
                this.f38888c = JavaOnlyArray.of(0, readableMap.getMap(EventKeys.PAYLOAD));
            }
        } else if (i10 == 1) {
            this.f38888c = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f38888c = JavaOnlyArray.of(Integer.valueOf(i10));
        }
        invalidate();
    }

    public void y(float f10) {
        this.f38889d = f10;
        invalidate();
    }
}

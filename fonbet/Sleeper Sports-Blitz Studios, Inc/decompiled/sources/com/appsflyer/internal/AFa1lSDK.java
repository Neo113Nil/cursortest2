package com.appsflyer.internal;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class AFa1lSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1vSDK> getCurrencyIso4217Code = new ArrayList();
    private final String getRevenue = null;

    enum AFa1vSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public final AFa1lSDK getRevenue(AFa1vSDK aFa1vSDK, String str) throws AFa1hSDK {
        if (this.getCurrencyIso4217Code.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFa1hSDK("Nesting problem: multiple top-level roots");
        }
        getCurrencyIso4217Code();
        this.getCurrencyIso4217Code.add(aFa1vSDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final AFa1lSDK getCurrencyIso4217Code(AFa1vSDK aFa1vSDK, AFa1vSDK aFa1vSDK2, String str) throws AFa1hSDK {
        AFa1vSDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork != aFa1vSDK2 && monetizationNetwork != aFa1vSDK) {
            throw new AFa1hSDK("Nesting problem");
        }
        this.getCurrencyIso4217Code.remove(r2.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    private AFa1vSDK getMonetizationNetwork() throws AFa1hSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            throw new AFa1hSDK("Nesting problem");
        }
        return this.getCurrencyIso4217Code.get(r0.size() - 1);
    }

    public final AFa1lSDK getCurrencyIso4217Code(Object obj) throws AFa1hSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            throw new AFa1hSDK("Nesting problem");
        }
        if (((Class) com.appsflyer.internal.AFa1vSDK.AFAdRevenueData((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 163 - View.getDefaultSize(0, 0), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Object obj2 = com.appsflyer.internal.AFa1vSDK.AFLogger.get(-1782316754);
                if (obj2 == null) {
                    obj2 = ((Class) com.appsflyer.internal.AFa1vSDK.AFAdRevenueData((char) ExpandableListView.getPackedPositionType(0L), 164 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38)).getDeclaredMethod("getMonetizationNetwork", AFa1lSDK.class);
                    com.appsflyer.internal.AFa1vSDK.AFLogger.put(-1782316754, obj2);
                }
                ((Method) obj2).invoke(obj, objArr);
                return this;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof AFa1jSDK) {
            ((AFa1jSDK) obj).getCurrencyIso4217Code(this);
            return this;
        }
        getCurrencyIso4217Code();
        if (obj == null || (obj instanceof Boolean) || obj == AFa1jSDK.AFAdRevenueData) {
            this.getMediationNetwork.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.getMediationNetwork.append(AFa1jSDK.getMediationNetwork((Number) obj));
            return this;
        }
        getCurrencyIso4217Code(obj.toString());
        return this;
    }

    final void getCurrencyIso4217Code(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                        StringBuilder sb = this.getMediationNetwork;
                        sb.append('\\');
                        sb.append(charAt);
                    } else {
                        switch (charAt) {
                            case '\b':
                                this.getMediationNetwork.append("\\b");
                                break;
                            case '\t':
                                this.getMediationNetwork.append("\\t");
                                break;
                            case '\n':
                                this.getMediationNetwork.append("\\n");
                                break;
                            default:
                                if (charAt <= 31) {
                                    this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                                    break;
                                } else {
                                    this.getMediationNetwork.append(charAt);
                                    break;
                                }
                        }
                    }
                } else {
                    this.getMediationNetwork.append("\\r");
                }
            } else {
                this.getMediationNetwork.append("\\f");
            }
        }
        this.getMediationNetwork.append("\"");
    }

    final void getMediationNetwork() throws AFa1hSDK {
        AFa1vSDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1vSDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(AbstractJsonLexerKt.COMMA);
        } else if (monetizationNetwork != AFa1vSDK.EMPTY_OBJECT) {
            throw new AFa1hSDK("Nesting problem");
        }
        AFa1vSDK aFa1vSDK = AFa1vSDK.DANGLING_KEY;
        this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1vSDK);
    }

    private void getCurrencyIso4217Code() throws AFa1hSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            return;
        }
        AFa1vSDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1vSDK.EMPTY_ARRAY) {
            AFa1vSDK aFa1vSDK = AFa1vSDK.NONEMPTY_ARRAY;
            this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1vSDK);
        } else {
            if (monetizationNetwork == AFa1vSDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(AbstractJsonLexerKt.COMMA);
                return;
            }
            if (monetizationNetwork == AFa1vSDK.DANGLING_KEY) {
                this.getMediationNetwork.append(":");
                AFa1vSDK aFa1vSDK2 = AFa1vSDK.NONEMPTY_OBJECT;
                this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1vSDK2);
                return;
            }
            if (monetizationNetwork != AFa1vSDK.NULL) {
                throw new AFa1hSDK("Nesting problem");
            }
        }
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }
}

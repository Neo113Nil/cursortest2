package com.google.android.gms.internal.gtm;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzcq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class zzcs<T extends zzcq> extends zzbr {
    final zzcr<T> zza;

    public zzcs(zzbv zzbvVar, zzcr<T> zzcrVar) {
        super(zzbvVar);
        this.zza = zzcrVar;
    }

    private final T zzb(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.zza.zzb(attributeValue, trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.zza.zze(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.zza.zzc(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e11) {
                                zzT("Error parsing bool configuration value", trim3, e11);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.zza.zzd(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e12) {
                                zzT("Error parsing int configuration value", trim4, e12);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e13) {
            zzK("Error parsing tracker configuration file", e13);
        } catch (XmlPullParserException e14) {
            zzK("Error parsing tracker configuration file", e14);
        }
        return this.zza.zza();
    }

    public T zza(int i11) {
        try {
            return zzb(zzt().zzb().getResources().getXml(i11));
        } catch (Resources.NotFoundException e11) {
            zzS("inflate() called with unknown resourceId", e11);
            return null;
        }
    }
}

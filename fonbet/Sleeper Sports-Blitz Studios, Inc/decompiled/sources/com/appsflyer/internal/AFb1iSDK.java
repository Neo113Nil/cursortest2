package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class AFb1iSDK {
    public String AFAdRevenueData;
    private byte[] getCurrencyIso4217Code;
    String getMediationNetwork;
    public String getMonetizationNetwork;
    public AFf1wSDK getRevenue;

    public AFb1iSDK(String str, byte[] bArr, String str2, AFf1wSDK aFf1wSDK) {
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = bArr;
        this.getMediationNetwork = str2;
        this.getRevenue = aFf1wSDK;
    }

    public AFb1iSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFAdRevenueData = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.getMediationNetwork = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.getMediationNetwork);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.getCurrencyIso4217Code = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.getRevenue = AFf1wSDK.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFb1iSDK aFb1iSDK = (AFb1iSDK) obj;
            String str = this.getMediationNetwork;
            if (str == null ? aFb1iSDK.getMediationNetwork != null : !str.equals(aFb1iSDK.getMediationNetwork)) {
                return false;
            }
            if (!Arrays.equals(this.getCurrencyIso4217Code, aFb1iSDK.getCurrencyIso4217Code)) {
                return false;
            }
            String str2 = this.AFAdRevenueData;
            if (str2 == null ? aFb1iSDK.AFAdRevenueData != null : !str2.equals(aFb1iSDK.AFAdRevenueData)) {
                return false;
            }
            String str3 = this.getMonetizationNetwork;
            if (str3 == null ? aFb1iSDK.getMonetizationNetwork != null : !str3.equals(aFb1iSDK.getMonetizationNetwork)) {
                return false;
            }
            if (this.getRevenue == aFb1iSDK.getRevenue) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.getMediationNetwork;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.getCurrencyIso4217Code)) * 31;
        String str2 = this.AFAdRevenueData;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMonetizationNetwork;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFf1wSDK aFf1wSDK = this.getRevenue;
        return hashCode3 + (aFf1wSDK != null ? aFf1wSDK.hashCode() : 0);
    }
}

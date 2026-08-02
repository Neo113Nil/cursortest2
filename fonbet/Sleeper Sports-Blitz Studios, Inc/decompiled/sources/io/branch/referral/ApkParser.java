package io.branch.referral;

import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.AppEventsConstants;
import io.branch.referral.Defines;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class ApkParser {
    private static final int endDocTag = 1048833;
    private static final int endTag = 1048835;
    private static final int startTag = 1048834;

    ApkParser() {
    }

    public JSONObject decompressXMLForValidator(byte[] bArr) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        int i4 = 36;
        int LEW = (LEW(bArr, 16) * 4) + 36;
        int LEW2 = LEW(bArr, 12);
        int i5 = LEW2;
        while (true) {
            int length = bArr.length - 4;
            i = startTag;
            if (i5 >= length) {
                break;
            }
            if (LEW(bArr, i5) == startTag) {
                LEW2 = i5;
                break;
            }
            i5 += 4;
        }
        String str4 = "";
        while (LEW2 < bArr.length) {
            try {
                int LEW3 = LEW(bArr, LEW2);
                if (LEW3 != i) {
                    i2 = i4;
                    if (LEW3 != endTag) {
                        break;
                    }
                    LEW2 += 24;
                } else {
                    int LEW4 = LEW(bArr, LEW2 + 28);
                    LEW2 += 36;
                    int i6 = 0;
                    while (i6 < LEW4) {
                        int LEW5 = LEW(bArr, LEW2 + 4);
                        int LEW6 = LEW(bArr, LEW2 + 8);
                        int LEW7 = LEW(bArr, LEW2 + 16);
                        int i7 = LEW2 + 20;
                        String compXmlString = compXmlString(bArr, i4, LEW, LEW5);
                        int i8 = LEW4;
                        if ("scheme".equals(compXmlString)) {
                            if (LEW6 != -1) {
                                str3 = compXmlString(bArr, 36, LEW, LEW6);
                            } else {
                                str3 = "resourceID 0x" + Integer.toHexString(LEW7);
                            }
                            if (validURI(str3)) {
                                if (!jSONObject.has(str3)) {
                                    jSONObject.put(str3, new JSONArray());
                                } else if (jSONObject.has(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                                    jSONObject.put(str3, (JSONArray) jSONObject.get(AppEventsConstants.EVENT_PARAM_VALUE_NO));
                                    jSONObject.remove(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                                }
                                str4 = str3;
                            }
                            if ("http".equals(str3) || "https".equals(str3)) {
                                str4 = str3;
                            }
                        } else if ("host".equals(compXmlString)) {
                            if (LEW6 != -1) {
                                str2 = compXmlString(bArr, 36, LEW, LEW6);
                            } else {
                                str2 = "resourceID 0x" + Integer.toHexString(LEW7);
                            }
                            if (jSONObject.has(str4) && str4 != null && !"https".equals(str4) && !"http".equals(str4)) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray(str4);
                                jSONArray2.put(str2);
                                jSONObject.put(str4, jSONArray2);
                            } else {
                                if (!"https".equals(str4) && !"http".equals(str4)) {
                                    JSONArray jSONArray3 = new JSONArray();
                                    jSONArray3.put(str2);
                                    jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, jSONArray3);
                                }
                                jSONArray.put(str2);
                            }
                        } else if ("name".equals(compXmlString)) {
                            if (LEW6 != -1) {
                                i3 = 36;
                                str = compXmlString(bArr, 36, LEW, LEW6);
                            } else {
                                i3 = 36;
                                str = "resourceID 0x" + Integer.toHexString(LEW7);
                            }
                            if ("android.intent.action.VIEW".equals(str)) {
                                str4 = null;
                            }
                            i6++;
                            i4 = i3;
                            LEW2 = i7;
                            LEW4 = i8;
                        }
                        i3 = 36;
                        i6++;
                        i4 = i3;
                        LEW2 = i7;
                        LEW4 = i8;
                    }
                    i2 = i4;
                }
                i4 = i2;
                i = startTag;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject2;
            }
        }
        jSONObject.remove(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        jSONObject2.put(Defines.Jsonkey.URIScheme.getKey(), jSONObject);
        jSONObject2.put(Defines.Jsonkey.AppLinks.getKey(), jSONArray);
        return jSONObject2;
    }

    private boolean validURI(String str) {
        return (str == null || "http".equals(str) || str.equals("https") || str.equals(User.JsonKeys.GEO) || str.equals("*") || str.equals(SentryStackFrame.JsonKeys.PACKAGE) || str.equals("sms") || str.equals("smsto") || str.equals("mms") || str.equals("mmsto") || str.equals("tel") || str.equals(NotificationCompat.CATEGORY_VOICEMAIL) || str.equals("file") || str.equals("content") || str.equals("mailto")) ? false : true;
    }

    private String compXmlString(byte[] bArr, int i, int i2, int i3) {
        if (i3 < 0) {
            return null;
        }
        return compXmlStringAt(bArr, i2 + LEW(bArr, i + (i3 * 4)));
    }

    private String compXmlStringAt(byte[] bArr, int i) {
        int i2 = ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[i] & 255);
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + 2 + (i3 * 2)];
        }
        return new String(bArr2);
    }

    private int LEW(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[i + 2] << 16) & 16711680) | ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }
}

package com.coremedia.iso.boxes.threegpp26244;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.imj0;
import xsna.jq;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class LocationInformationBox extends AbstractFullBox {
    public static final String TYPE = "loci";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_14 = null;
    private static final /* synthetic */ n0y ajc$tjp_15 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;

    static {
        ajc$preClinit();
    }

    public LocationInformationBox() {
        super(TYPE);
        this.name = "";
        this.astronomicalBody = "";
        this.additionalNotes = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("LocationInformationBox.java", LocationInformationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "altitude", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = crx0.r(byteBuffer);
        this.name = crx0.t(byteBuffer);
        this.role = crx0.e(byteBuffer.get());
        this.longitude = crx0.p(byteBuffer);
        this.latitude = crx0.p(byteBuffer);
        this.altitude = crx0.p(byteBuffer);
        this.astronomicalBody = crx0.t(byteBuffer);
        this.additionalNotes = crx0.t(byteBuffer);
    }

    public String getAdditionalNotes() {
        o0y c = whq.c(ajc$tjp_14, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.additionalNotes;
    }

    public double getAltitude() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.altitude;
    }

    public String getAstronomicalBody() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.astronomicalBody;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.t(this.language, byteBuffer);
        jq.h(this.name, byteBuffer, (byte) 0);
        byteBuffer.put((byte) (this.role & 255));
        aqw.r(byteBuffer, this.longitude);
        aqw.r(byteBuffer, this.latitude);
        aqw.r(byteBuffer, this.altitude);
        jq.h(this.astronomicalBody, byteBuffer, (byte) 0);
        jq.h(this.additionalNotes, byteBuffer, (byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return imj0.b(this.name).length + 22 + imj0.b(this.astronomicalBody).length + imj0.b(this.additionalNotes).length;
    }

    public String getLanguage() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.language;
    }

    public double getLatitude() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.latitude;
    }

    public double getLongitude() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.longitude;
    }

    public String getName() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.name;
    }

    public int getRole() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.role;
    }

    public void setAdditionalNotes(String str) {
        o0y d = whq.d(ajc$tjp_15, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.additionalNotes = str;
    }

    public void setAltitude(double d) {
        o0y d2 = whq.d(ajc$tjp_11, this, this, new Double(d));
        w8g0.a();
        w8g0.b(d2);
        this.altitude = d;
    }

    public void setAstronomicalBody(String str) {
        o0y d = whq.d(ajc$tjp_13, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.astronomicalBody = str;
    }

    public void setLanguage(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.language = str;
    }

    public void setLatitude(double d) {
        o0y d2 = whq.d(ajc$tjp_9, this, this, new Double(d));
        w8g0.a();
        w8g0.b(d2);
        this.latitude = d;
    }

    public void setLongitude(double d) {
        o0y d2 = whq.d(ajc$tjp_7, this, this, new Double(d));
        w8g0.a();
        w8g0.b(d2);
        this.longitude = d;
    }

    public void setName(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.name = str;
    }

    public void setRole(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.role = i;
    }
}

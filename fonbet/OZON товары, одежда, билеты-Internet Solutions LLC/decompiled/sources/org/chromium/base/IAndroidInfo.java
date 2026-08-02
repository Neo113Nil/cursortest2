package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class IAndroidInfo implements Parcelable {
    public static final Parcelable.Creator<IAndroidInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f78471a;

    /* renamed from: b, reason: collision with root package name */
    public String f78472b;

    /* renamed from: c, reason: collision with root package name */
    public String f78473c;

    /* renamed from: d, reason: collision with root package name */
    public String f78474d;

    /* renamed from: e, reason: collision with root package name */
    public String f78475e;

    /* renamed from: f, reason: collision with root package name */
    public String f78476f;

    /* renamed from: g, reason: collision with root package name */
    public String f78477g;

    /* renamed from: h, reason: collision with root package name */
    public String f78478h;

    /* renamed from: i, reason: collision with root package name */
    public String f78479i;

    /* renamed from: k, reason: collision with root package name */
    public String f78481k;

    /* renamed from: l, reason: collision with root package name */
    public String f78482l;

    /* renamed from: n, reason: collision with root package name */
    public String f78484n;

    /* renamed from: o, reason: collision with root package name */
    public String f78485o;

    /* renamed from: p, reason: collision with root package name */
    public String f78486p;

    /* renamed from: j, reason: collision with root package name */
    public boolean f78480j = false;

    /* renamed from: m, reason: collision with root package name */
    public int f78483m = 0;

    final class a implements Parcelable.Creator<IAndroidInfo> {
        @Override // android.os.Parcelable.Creator
        public final IAndroidInfo createFromParcel(Parcel parcel) {
            IAndroidInfo iAndroidInfo = new IAndroidInfo();
            int dataPosition = parcel.dataPosition();
            int readInt = parcel.readInt();
            try {
                if (readInt < 4) {
                    throw new BadParcelableException("Parcelable too small");
                }
                if (parcel.dataPosition() - dataPosition < readInt) {
                    iAndroidInfo.f78471a = parcel.readString();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        iAndroidInfo.f78472b = parcel.readString();
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            iAndroidInfo.f78473c = parcel.readString();
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                iAndroidInfo.f78474d = parcel.readString();
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    iAndroidInfo.f78475e = parcel.readString();
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        iAndroidInfo.f78476f = parcel.readString();
                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                            iAndroidInfo.f78477g = parcel.readString();
                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                iAndroidInfo.f78478h = parcel.readString();
                                                if (parcel.dataPosition() - dataPosition < readInt) {
                                                    iAndroidInfo.f78479i = parcel.readString();
                                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                                        iAndroidInfo.f78480j = parcel.readInt() != 0;
                                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                                            iAndroidInfo.f78481k = parcel.readString();
                                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                                iAndroidInfo.f78482l = parcel.readString();
                                                                if (parcel.dataPosition() - dataPosition < readInt) {
                                                                    iAndroidInfo.f78483m = parcel.readInt();
                                                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                                                        iAndroidInfo.f78484n = parcel.readString();
                                                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                                                            iAndroidInfo.f78485o = parcel.readString();
                                                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                                                iAndroidInfo.f78486p = parcel.readString();
                                                                                if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                                                }
                                                                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                                                            }
                                                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                                                        }
                                                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                                    }
                                                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                                }
                                                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                                            }
                                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                                        }
                                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                    }
                                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                }
                                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(dataPosition + readInt);
                return iAndroidInfo;
            } catch (Throwable th2) {
                if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(dataPosition + readInt);
                throw th2;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final IAndroidInfo[] newArray(int i11) {
            return new IAndroidInfo[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.f78471a);
        parcel.writeString(this.f78472b);
        parcel.writeString(this.f78473c);
        parcel.writeString(this.f78474d);
        parcel.writeString(this.f78475e);
        parcel.writeString(this.f78476f);
        parcel.writeString(this.f78477g);
        parcel.writeString(this.f78478h);
        parcel.writeString(this.f78479i);
        parcel.writeInt(this.f78480j ? 1 : 0);
        parcel.writeString(this.f78481k);
        parcel.writeString(this.f78482l);
        parcel.writeInt(this.f78483m);
        parcel.writeString(this.f78484n);
        parcel.writeString(this.f78485o);
        parcel.writeString(this.f78486p);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}

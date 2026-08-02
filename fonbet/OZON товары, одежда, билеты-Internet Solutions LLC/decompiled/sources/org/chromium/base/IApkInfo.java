package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class IApkInfo implements Parcelable {
    public static final Parcelable.Creator<IApkInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f78487a;

    /* renamed from: b, reason: collision with root package name */
    public String f78488b;

    /* renamed from: c, reason: collision with root package name */
    public String f78489c;

    /* renamed from: d, reason: collision with root package name */
    public String f78490d;

    /* renamed from: f, reason: collision with root package name */
    public String f78492f;

    /* renamed from: g, reason: collision with root package name */
    public String f78493g;

    /* renamed from: h, reason: collision with root package name */
    public String f78494h;

    /* renamed from: i, reason: collision with root package name */
    public String f78495i;

    /* renamed from: e, reason: collision with root package name */
    public boolean f78491e = false;

    /* renamed from: j, reason: collision with root package name */
    public int f78496j = 0;

    final class a implements Parcelable.Creator<IApkInfo> {
        @Override // android.os.Parcelable.Creator
        public final IApkInfo createFromParcel(Parcel parcel) {
            IApkInfo iApkInfo = new IApkInfo();
            int dataPosition = parcel.dataPosition();
            int readInt = parcel.readInt();
            try {
                if (readInt < 4) {
                    throw new BadParcelableException("Parcelable too small");
                }
                if (parcel.dataPosition() - dataPosition < readInt) {
                    iApkInfo.f78487a = parcel.readString();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        iApkInfo.f78488b = parcel.readString();
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            iApkInfo.f78489c = parcel.readString();
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                iApkInfo.f78490d = parcel.readString();
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    iApkInfo.f78491e = parcel.readInt() != 0;
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        iApkInfo.f78492f = parcel.readString();
                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                            iApkInfo.f78493g = parcel.readString();
                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                iApkInfo.f78494h = parcel.readString();
                                                if (parcel.dataPosition() - dataPosition < readInt) {
                                                    iApkInfo.f78495i = parcel.readString();
                                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                                        iApkInfo.f78496j = parcel.readInt();
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
                parcel.setDataPosition(dataPosition + readInt);
                return iApkInfo;
            } catch (Throwable th2) {
                if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(dataPosition + readInt);
                throw th2;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final IApkInfo[] newArray(int i11) {
            return new IApkInfo[i11];
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
        parcel.writeString(this.f78487a);
        parcel.writeString(this.f78488b);
        parcel.writeString(this.f78489c);
        parcel.writeString(this.f78490d);
        parcel.writeInt(this.f78491e ? 1 : 0);
        parcel.writeString(this.f78492f);
        parcel.writeString(this.f78493g);
        parcel.writeString(this.f78494h);
        parcel.writeString(this.f78495i);
        parcel.writeInt(this.f78496j);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
